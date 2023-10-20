package com.rpg_test;


public class cPlayer {
    private String nama;
    cPlayer(){
        nama=null;
        System.out.println("Object player dibuat..");
    }
    cPlayer(String np){
        nama = np;
        System.out.println("Objek "+nama+" dibuat");
    }
    public void setNama(String np){
        nama=np;  
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "Player : " + nama;
    }
}
