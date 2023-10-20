package com.rpg_test;

public class cMenu {
    private String nama;
    private int harga;
    cMenu(){
        nama="";harga=0;
    }
    cMenu(String nm, int hm){
        nama = nm; harga = hm;
    }
    public void setNama(String nm){
        nama = nm;
    }
    public void setHarga(int hm){
        harga = hm;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String ToString(){
        return "Item : "+nama+" ["+harga+"] ";
    }
}
