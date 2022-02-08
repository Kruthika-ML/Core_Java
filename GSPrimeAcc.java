package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
    public GSPrimeAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    void bookProduct(float charges){

    }

    @Override
    public String toString() {
        return "GSPrimeAcc{}";
    }
}
