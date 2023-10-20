package com.rpg_test;

public class cLinkedList {
    cSimpul head,tail;
    int jumlah;
    cLinkedList(){
        head=tail=null;
        jumlah=0;
    }
    public void tambahBelakang(cSimpul baru){
        if(tail==null){
            head=tail=baru;
        } else{
            tail.next=baru;
            tail=baru;
        }
        System.out.println("Penambahan Sukses...");
    }
    public void bacaList(){
        System.out.println("Isi Linked LIst: ");
        for(cSimpul t=head; t!= null; t = t.next){
            System.out.println(t.getData().getNama()+" | "+ "Harga: "+ t.getData().getHarga());
        }
        System.out.println("");
    }

    public void hapusDepan(){
        if(head==null){
            System.out.println("Linked List Kosong!");
        } else if(head.next==null){
            System.out.println("["+head.getData().getNama()+"] dihapus...");
            head=tail=null;
        } else{
            cSimpul t=head;
            head=head.next;
            System.out.println("["+t.getData().getNama()+"] dihapus...");
            t = null;
        }
    }
}
