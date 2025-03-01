package com.hamitmizrak;

import com.hamitmizrak.controller.StudentController;
import com.hamitmizrak.dto.PersonDto;

//
public class Main {
    public static void main(String[] args) {
        try {
            StudentController studentController = new StudentController();
            studentController.chooise();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}