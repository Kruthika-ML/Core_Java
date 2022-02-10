package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    void bookProduct(float charges){

    }

    @Override
    public String toString() {
        return "PrimeAcc{" +
                "isPrime=" + isPrime +
                '}';
    }
}
