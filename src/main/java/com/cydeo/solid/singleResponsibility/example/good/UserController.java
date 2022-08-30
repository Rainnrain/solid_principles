package com.cydeo.solid.singleResponsibility.example.good;

public class UserController {

    public static void getRequest(){
        // get request
        // Send this request to validation and security part
    }

    public static String createResonpnse(){
        return "Response"; // For example " User is created"
    }

    public static void sendResponse(){
        //Send user a response
    }
}
