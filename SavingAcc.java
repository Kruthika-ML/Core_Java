package com.tns.framework;

public abstract class SavingAcc extends BankAcc{
    protected boolean isSalaried;
    private static final float MinBal = 0;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    void withdraw(float accBal){

    }

    @Override
    public String toString() {
        return "SavingAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                ", isSalaried=" + isSalaried +
                '}';
    }
}
