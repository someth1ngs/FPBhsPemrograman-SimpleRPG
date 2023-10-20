package com.rpg_test;

public class cAccount {
    private String id;
    private String pass;
    
        cAccount(){
        System.out.println("Constructor 1 account...");
        }
    
        cAccount(String ids, String pw){
        id = ids; pass = pw;
        }
    
        public void setId(String n){
        id = n;
        }
        public void setPass(String n){
        pass = n;
        }

        //method getter
        public String getId(){
        return id;
        }
        public String getPass(){
        return pass;
        }

        //method query
        public String ToString(){
        return id+" "+pass;
    }
}
