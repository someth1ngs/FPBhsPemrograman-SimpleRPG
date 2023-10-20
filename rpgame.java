package com.rpg_test;
import java.util.Scanner;

public class rpgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cPlayer player = new cPlayer();

        cAccount acc = null;
        int pilih, pilih2, pilih3;

        cEquipable equipable [] = new cEquipable[3];
        equipable[0]=new cEquipable("Sword",3000);
        equipable[1]=new cEquipable("Armor",5000);
        equipable[2]=new cEquipable("Axe",4000);

        cConsumable consumable [] = new cConsumable[3];
        consumable[0]=new cConsumable("HealthPotion",300);
        consumable[1]=new cConsumable("ManaPotion",300);
        consumable[2]=new cConsumable("Antidote",500);

        cPet p1 = new cPet("Anjing", 17000);
        cPet p2 = new cPet("Kucing", 18000);
        cPet p3 = new cPet("Burung", 16500);
        cLinkedList LL = new cLinkedList();
        int pilih5 = 0;
        
        
        do{
        System.out.println("\n===Menu Game===");
        System.out.println("1. Login");
        System.out.println("2. Play Game");
        System.out.println("3. Quit Game");
        System.out.print("Pilih = ");
        pilih = sc.nextInt();
        switch(pilih){
        case 1:
            System.out.println("\n===Login===");
            System.out.print("id = ");
            String id = sc.next();
            System.out.print("pass = ");
            String pass = sc.next();
            acc = new cAccount(id, pass);
            System.out.println("Login Berhasil");
            break;
        case 2:
        if (acc!=null){
        System.out.println("\nAnda akan Login sebentar lagi...");
        System.out.println("Tunggu sebentar...");
        System.out.println("Mencari Server yang stabil...");
            do{
                System.out.println("\n===Menu Account===");
                System.out.println("1. Create Character");
                System.out.println("2. Delete Character");
                System.out.println("3. View Character");
                System.out.println("4. Play");
                System.out.println("5. Quit Game");
                pilih2 = sc.nextInt();
                switch(pilih2){
                case 1:
                System.out.println("\n===Creating Character===");
                System.out.print("Input your name = ");
                String nama = sc.next();
                player.setNama(nama);
                break;

                case 2:
                if (player.getNama() != null){
                    System.out.println("\nData ditemukan!!\n");
                    System.out.println("Dihapus?\n1.Ya, 2.Tidak");
                    System.out.print("Pilih = ");
                    pilih2 = sc.nextInt();
                    if (pilih2 == 1){
                    player.setNama(null);
                    System.out.println("Data Berhasil dihapus");
                    } else System.out.println("Dibatalkan");
                } else System.out.println("Data tidak ditemukan...");
                break;

                case 3:
                if(player.getNama() != null){
                    System.out.println("\n===Your Character Data===");
                    System.out.println("Nama         : "+ player.getNama());
                }else System.out.println("Data tidak ditemukan...");
                    break;

                case 4:
                if (player.getNama() != null){
                System.out.println("\nPLAYING...\n");
                do{
                    System.out.println("Anda Ingin pergi kemana?");
                    System.out.println("1. Shop");
                    System.out.println("2. Pet Shop");
                    System.out.println("3. Exit to Main Menu");
                    System.out.print("pilih = ");
                    pilih3 = sc.nextInt();
                    switch(pilih3){
                        case 1:
                        System.out.println("\n===Selamat Datang di Shop===");
                        do{
                            System.out.println("1. Daftar Item (Equipable)");
                            System.out.println("2. Daftar Item (Consumable)");
                            System.out.println("3. Transaksi(pembelian)");
                            System.out.println("4. Selesai");
                            System.out.print("Pilih = ");
                            pilih=sc.nextInt();
                            switch(pilih){
                                case 1:
                                    System.out.println("\nDaftar Menu");
                                    for (int i = 0; i < equipable.length; i++) {
                                        System.out.println(equipable[i].ToString());
                                    }
                                    System.out.println("\n");
                                    break;

                                case 2:
                                System.out.println("\nDaftar Menu");
                                for (int i = 0; i < consumable.length; i++) {
                                    System.out.println(consumable[i].ToString());
                                }
                                System.out.println("\n");
                                break;

                                case 3:
                                    System.out.println("Pembelian");
                                    cShop beli = new cShop();
                                    beli.isiPlayer(player);
                                    int pilih4=0;
                                    do{
                                        System.out.println("\n===Menu Pembelian===");
                                        System.out.println("1. Tambah Item (Equipable)");
                                        System.out.println("2. Tambah Item (Consumable)");
                                        System.out.println("3. Hapus Item (Equipable)");
                                        System.out.println("4. Hapus Item (Consumable)");
                                        System.out.println("5. Lihat Item");
                                        System.out.println("6. Selesai");
                                        System.out.print("Pilih = ");
                                        pilih2= sc.nextInt();
                                        switch(pilih2){
                                            case 1:
                                                System.out.print("Nama Item = ");
                                                String mn = sc.next();
                                                boolean ada = false;
                                                for (int i = 0; i < equipable.length; i++) {
                                                    if(mn.equalsIgnoreCase(equipable[i].getNama())){
                                                        ada = true;
                                                        beli.tambahEquip(equipable[i]);
                                                        break;
                                                    }
                                                }
                                                if(ada==false){
                                                    System.out.println("Item tidak ada!");
                                                }
                                                break;

                                            case 2:
                                            System.out.print("Nama Item = ");
                                            String mn2 = sc.next();
                                            boolean ada2 = false;
                                            for (int i = 0; i < consumable.length; i++) {
                                                if(mn2.equalsIgnoreCase(consumable[i].getNama())){
                                                    ada2 = true;
                                                    beli.tambahConsume(consumable[i]);
                                                    break;
                                                }
                                            }
                                            if(ada2==false){
                                                System.out.println("Item tidak ada!");
                                            }
                                            break;

                                            case 3:
                                                beli.hapusEquip();
                                                break;

                                            case 4:
                                                beli.hapusConsume();
                                                break;

                                            case 5:
                                            System.out.println(player.ToString());
                                            System.out.println("Item (Equipable) yang dibeli: ");
                                                beli.lihatEquip();
                                            System.out.println("Item (Consumable) yang dibeli");
                                                beli.lihatConsume();
                                                break;

                                            case 6:
                                                System.out.println("Terima Kasih, Silahkan datang lagi...\n");
                                                break;
                                                
                                        }
                                    }while(pilih2!=6);
                                    break;
                                case 4:
                                    System.out.println("Terima kasih, Semoga hari anda menyenangkan...\n");
                            }
                        }while(pilih != 4);
                        break;
                        case 2:
                        System.out.println("\nWelcome to Pet Shop");
                        do{
                            System.out.println("\nAnda ingin apa?");
                            System.out.println("1. Tambah Pemesanan");
                            System.out.println("2. Hapus Pemesanan");
                            System.out.println("3. Lihat Pesanan");
                            System.out.println("4. Exit");
                            System.out.print("Pilih = ");
                            pilih5 = sc.nextInt();
                            switch(pilih5){
                                case 1:
                                System.out.println("1. Anjing");
                                System.out.println("2. Kucing");
                                System.out.println("3. Burung");
                                System.out.print("pilih = ");
                                int pilih6 = sc.nextInt();
                                switch(pilih6){
                                    case 1:
                                    cSimpul b = new cSimpul(p1);
                                    LL.tambahBelakang(b);
                                    break;
                                    case 2:
                                    b = new cSimpul(p2);
                                    LL.tambahBelakang(b);
                                    break;
                                    case 3:
                                    b = new cSimpul(p3);
                                    LL.tambahBelakang(b);
                                    break;
                                }
                                break;

                                case 2:
                                LL.hapusDepan();
                                break;

                                case 3:
                                LL.bacaList();
                                break;

                                case 4:
                                System.out.println("Terima kasih, silahkan datang lagi");
                                break;
                            }
                        } while(pilih5!=4);
                    }        
                    } while (pilih3 != 3);    
                } else System.out.println("\nKarakter Tidak Ada!");
                break;
                case 5:
                System.out.println("Back to Login Menu...\n");
                break;
                }
            } while (pilih2 != 5);
        }else System.out.println("\nAkun Tidak Ada!");
        break;
    }
        }while (pilih != 3);
        System.out.println("Quitting...\n");
    }
}