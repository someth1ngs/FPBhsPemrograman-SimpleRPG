package com.rpg_test;

import java.util.Scanner;
public class cShop {
    private cPlayer player;
    private cEquipable equipable[];
    private cConsumable consumable[];
    private int jequip, maksequip, totalequip;
    private int jconsume, maksconsume, total;
    private Scanner sc = new Scanner(System.in);
    cShop(){
        maksequip = 5;
        maksconsume = 5;
        equipable = new cEquipable[maksequip];//maksimumnya ada 5
        consumable = new cConsumable[maksconsume];
        jequip=0; totalequip=0;
        jconsume=0; total=0;
        System.out.println("Objek pembelian dibuat..");
    }

    public void isiPlayer(cPlayer p){
        player = p;
        System.out.println("Isi player sukses...");
    }
    public void tambahEquip(cEquipable m){
        if(jequip>=maksequip){
            System.out.println("Kapasitas penuh!");
        }
        else{
            equipable[jequip] = m;//untuk menyimpan object
            jequip++;
            System.out.println("Penambahan sukses..");
        }
    }
    public void hapusEquip(){
        if(jequip<0){
            System.out.println("Inventory anda kosong!");
        }
        else{
            System.out.print("Item dihapus = "); 
            String itm = sc.next();
            boolean ada = false;
            for (int i = 0; i < jequip; i++) {
                if(itm.equalsIgnoreCase(equipable[i].getNama())){
                    ada = true;
                    equipable[i]=null;
                    //akan menggeser elemen array
                    int p=i;
                    for (int j = p; j < maksequip; j++) {
                        if(j==jequip-1){
                             equipable[j]=null;
                        }
                        else{
                            equipable[j]=equipable[j+1];
                        }
                        jequip--;
                        System.out.println("Penghapusan sukses..");
                        break;
                    }
                }
                if(ada==false){
                    System.out.println("Item tidak ada");
                }
                
            }
            
        }
        
    }
    public void lihatEquip(){
        System.out.println("Data pembelian");
        for (int i = 0; i < jequip; i++) {
            System.out.println((i+1)+"."+equipable[i].ToString());
        }
        System.out.println("");
    }

    public void tambahConsume(cConsumable m){
        if(jconsume>=maksconsume){
            System.out.println("Kapasitas penuh!");
        }
        else{
            consumable[jconsume] = m;//untuk menyimpan object
            jconsume++;
            System.out.println("Penambahan sukses..");
        }
    }
    public void hapusConsume(){
        if(jconsume<0){
            System.out.println("Inventory anda kosong!");
        }
        else{
            System.out.print("Item dihapus = "); 
            String itm = sc.next();
            boolean ada = false;
            for (int i = 0; i < jconsume; i++) {
                if(itm.equalsIgnoreCase(consumable[i].getNama())){
                    ada = true;
                    consumable[i]=null;
                    //akan menggeser elemen array
                    int p=i;
                    for (int j = p; j < maksconsume; j++) {
                        if(j==jconsume-1){
                             consumable[j]=null;
                        }
                        else{
                            consumable[j]=consumable[j+1];
                        }
                        jconsume--;
                        System.out.println("Penghapusan sukses..");
                        break;
                    }
                }
                if(ada==false){
                    System.out.println("Item tidak ada");
                }
                
            }
            
        }
        
    }
    public void lihatConsume(){
        System.out.println("Data pembelian");
        for (int i = 0; i < jconsume; i++) {
            System.out.println((i+1)+"."+consumable[i].ToString());
        }
        System.out.println("");
    }
}
