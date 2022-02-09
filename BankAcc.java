package com.tns.framework;

public abstract class BankAcc {
    protected int accNo;
    protected String accNm;
    protected float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    void withdraw(float accBal){

    }

    void deposit(float accBal){

    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                '}';
    }
}
