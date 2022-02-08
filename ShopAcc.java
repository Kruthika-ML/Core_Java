package com.tns.framework;

public abstract class ShopAcc {
    protected int accNo;
    protected String accNm;
    protected float charges;

    void bookProduct(float charges){

    }

    void items(float charges){

    }

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "ShopAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", charges=" + charges +
                '}';
    }
}
