package com.hamitmizrak.tutorials.common;

import javax.swing.*;

public class _8_JOptionalPane {
    public static void main(String[] args) {
        System.out.println("jOptionalPane");

        // Ekranda Göstermek
        JOptionPane.showMessageDialog(null, "Nasilsiniz");

        // Kullanıcıdan Veri almak
        String name = JOptionPane.showInputDialog("Lütfen ismizi giriniz");
        JOptionPane.showMessageDialog(null, "Adiniz:" + name);
    } //end PSVM
}// end Class
