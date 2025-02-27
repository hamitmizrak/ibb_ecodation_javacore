package com.hamitmizrak;

import com.hamitmizrak.controller.StudentController;

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