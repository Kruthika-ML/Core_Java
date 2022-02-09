package com.tns.framework;

public abstract class CurrentAcc extends BankAcc{
    protected final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    void withdraw(float creditLimit){

    }

    @Override
    public String toString() {
        return "CurrentAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
