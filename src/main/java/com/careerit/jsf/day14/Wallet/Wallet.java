package com.careerit.jsf.day14.Wallet;

public class Wallet {
    private String id;
    private String name;
    private long mobile;
    private float balance;


    public Wallet(String id,String name,long mobile, float balance){
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.balance = balance;
    }
    public void showWalletInfo(){
        System.out.println("Id :"+id+" Name :"+name+" Mobile :"+mobile+" Balance :"+balance);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}
