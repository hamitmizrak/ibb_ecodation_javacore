package com.hamitmizrak.tutorials._3_week;

import lombok.*;

import java.util.Date;

@NoArgsConstructor // parametresiz Constructor
@AllArgsConstructor // parametreli Constructor
//@Data
@Getter
@Setter
@ToString
@Builder
public class Week3_06_Class_LOMBOK {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    public static void main(String[] args) {
        Week3_06_Class_LOMBOK lombok= Week3_06_Class_LOMBOK.builder()
                .id(1L)
                .name("Hamit")
                .surname("Surname")
                .createdDate(new Date(System.currentTimeMillis()))
                .build();

        System.out.println(lombok);

    }
}
