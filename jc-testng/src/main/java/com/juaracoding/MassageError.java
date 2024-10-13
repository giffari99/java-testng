package com.juaracoding;

public class MassageError {


    //return kata lengkap (equals)
//    public boolean textMassage(String massage){
//        return massage.equals("Login Gagal");
//    }

    //return sebagian kata (contains)
    public boolean textMassage(String massage) {
        return massage.contains("Login");
    }

}

