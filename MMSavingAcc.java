package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    private static final float MinBal=0;

    void withdraw(float accBal){

    }

    @Override
    public String toString() {
        return "MMSavingAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                ", isSalaried=" + isSalaried +
                '}';
    }
}
