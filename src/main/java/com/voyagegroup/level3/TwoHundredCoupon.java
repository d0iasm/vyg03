package com.voyagegroup.level3;

public class TwoHundredCoupon implements CouponState {
    private static TwoHundredCoupon mInstance = null;

    public static TwoHundredCoupon getInstance() {
        if (mInstance == null) {
            mInstance = new TwoHundredCoupon();
        }
        return mInstance;
    }

    @Override
    public int getPayTimes(int aHadCoupon) {
        return Math.min(aHadCoupon, 2);
    }

    @Override
    public int getPayAmount() {
        return 200;
    }
}
