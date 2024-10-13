package com.juaracoding;

public class Login {

    // login menggunakan boolean
//    public boolean loginUser(String username,String password){
//        if(username.equals("admin") && password.equals("password")){
//            return true;
//        } else {
//            return false;
//        }
//    }


    //login menggunakan String

    public String loginUser(String username, String password){
        if(username.equals("admin") && password.equals("password")){
            return "Login Berhasil";
        }else {
            return "Login Tidak Berhasil";
        }
    }

}