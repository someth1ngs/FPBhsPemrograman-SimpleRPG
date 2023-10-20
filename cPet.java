package com.rpg_test;

public class cPet {
    String nama;
    int harga;
    cPet(String n, int h){
        nama=n; harga=h;
    }
    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }
}
