package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    void bookProduct(float deliveryCharge){

    }

    @Override
    public String toString() {
        return "GSNormalAcc{}";
    }
}
