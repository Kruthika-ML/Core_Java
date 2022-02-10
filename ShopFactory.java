package com.tns.framework;

public abstract class ShopFactory {
    public ShopFactory(int accNo, String accNm, float charges) {
    }

    PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime){

        return null;
    }

    NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
        return null;
    }

}

