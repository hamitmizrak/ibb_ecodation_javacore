package com.hamitmizrak.dao;

import com.hamitmizrak.dto.RegisterDto;
import com.hamitmizrak.iofiles.SpecialFileHandler;
import com.hamitmizrak.utils.SpecialColor;
import com.hamitmizrak.exceptions.RegisterNotFoundException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class RegisterDao implements IDaoGenerics<RegisterDto> {

    private static final Logger logger = Logger.getLogger(RegisterDao.class.getName());
    private final List<RegisterDto> registerDtoList;
    private final SpecialFileHandler fileHandler;

    static {
        System.out.println(SpecialColor.RED + " Static: RegisterDao Initialized" + SpecialColor.RESET);
    }


    public RegisterDao() {
        this.fileHandler = new SpecialFileHandler();
        this.fileHandler.setFilePath("registers.txt");
        this.registerDtoList = new ArrayList<>();
        this.fileHandler.createFileIfNotExists();

        List<String> fileLines = this.fileHandler.readFile();
        for (String line : fileLines) {
            RegisterDto register = csvToRegister(line);
            if (register != null) {
                registerDtoList.add(register);
            }
        }
    }


    public int generateNewId() {
        return registerDtoList.isEmpty() ? 1 :
                registerDtoList.stream().mapToInt(RegisterDto::getId).max().orElse(0) + 1;
    }

    private String registerToCsv(RegisterDto registerDto) {
        return registerDto.getId() + "," + registerDto.getNickname() + "," +
                registerDto.getEmailAddress() + "," + registerDto.getPassword() + "," +
                registerDto.isLocked() + "," + registerDto.getRole();
    }

    private RegisterDto csvToRegister(String csvLine) {
        try {
            String[] parts = csvLine.split(",");
            if (parts.length < 6) return null;

            return new RegisterDto(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    parts[3],
                    parts[5],
                    Boolean.parseBoolean(parts[4]),
                    null,
                    null
            );
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Optional<RegisterDto> create(RegisterDto registerDto) {
        registerDtoList.add(registerDto);
        fileHandler.writeFile(registerToCsv(registerDto));
        return Optional.of(registerDto);
    }


    @Override
    public List<RegisterDto> list() {
        return new ArrayList<>(registerDtoList);
    }

    @Override
    public Optional<RegisterDto> findByName(String nickName) {
        return registerDtoList.stream()
                .filter(s -> s.getNickname().equalsIgnoreCase(nickName))
                .findFirst();
    }

    public Optional<RegisterDto> findByEmail(String email) {
        if (registerDtoList.isEmpty()) {
            list(); // 📌 Eğer liste boşsa, dosyadan verileri yükle
        }

        return registerDtoList.stream()
                .filter(s -> s.getEmailAddress().equals(email))
                .findFirst();
    }


    @Override
    public Optional<RegisterDto> findById(int id) {
        return registerDtoList.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }


    public void overwriteFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileHandler.getFilePath(), false))) {
            for (RegisterDto register : registerDtoList) {
                writer.write(registerToCsv(register));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Dosyaya yazma hatası: " + e.getMessage());
        }
    }

    @Override
    public Optional<RegisterDto> update(int id, RegisterDto registerDto) {
        for (int i = 0; i < registerDtoList.size(); i++) {
            if (registerDtoList.get(i).getId() == id) {
                registerDtoList.set(i, registerDto);
                overwriteFile();
                return Optional.of(registerDto);
            }
        }
        throw new RegisterNotFoundException("Kayıt bulunamadı.");
    }

    @Override
    public Optional<RegisterDto> delete(int id) {
        Optional<RegisterDto> registerToDelete = findById(id);
        if (registerToDelete.isPresent()) {
            registerDtoList.remove(registerToDelete.get());
            fileHandler.writeFile(registerDtoList.stream()
                    .map(this::registerToCsv)
                    .collect(Collectors.joining("\n")));
            logger.info("✅ Kullanıcı silindi: " + registerToDelete.get().getEmailAddress());
            return registerToDelete;
        } else {
            logger.warning("⚠️ Kullanıcı silinemedi, çünkü bulunamadı. ID: " + id);
            return Optional.empty();
        }
    }

    @Override
    public void choose() {
        // Kullanıcı işlemlerini yönlendirme
    }
}
