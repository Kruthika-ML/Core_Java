package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
    private float deliveryCharge;

    public NormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    void bookProduct(float deliveryCharge) {

    }

    @Override
    public String toString() {
        return "NormalAcc{" +
                "deliveryCharge=" + deliveryCharge +
                '}';
    }
}
