package com.voyagegroup.level3;

public class CouponCombinator {

    public int[] pay(int aTotalAmount, int aMPizzaNumber, int aLPizzaNumber, int[] aSideMenus, boolean aIsWorkdayLunch, int[] aHadCoupon) {
        int[] tUsedCoupon = new int[]{0, 0, 0, 0};
        int tPayAmount = aTotalAmount;
        boolean tHasPizza = false;

        if (1000 >= tPayAmount) {
            return tUsedCoupon;
        }

        if (0 <= aMPizzaNumber + aLPizzaNumber) {
            tHasPizza = true;
        }

        SetMenu tSetMenu = new SetMenu(aMPizzaNumber, aLPizzaNumber, aSideMenus, aIsWorkdayLunch);
        for (int i = 0; i < 4; i++) {
            CouponContext tCouponContext = new CouponContext(i, tHasPizza);
            for (int j = 0; j < tCouponContext.getPayTimes(aHadCoupon[i]); j++) {
                tPayAmount -= tCouponContext.getPayAmount();
                if (0 > tPayAmount) {
                    if(tPayAmount < aTotalAmount - tSetMenu.discount()){
                        return tUsedCoupon;
                    }
                    return new int[]{0, 0, 0};
                }
                tUsedCoupon[i]++;
            }
        }
        return tUsedCoupon;
    }
}
