package com.voyagegroup.level3;

public class SetMenu {
    private int mMPizzaNumber;
    private int mLPizzaNumber;
    private int[] mSideMenus = {0, 0, 0};
    private boolean mIsWorkdayLunch;

    public SetMenu(int aMPizzaNumber, int aLPizzaNumber, int[] aSideMenus, boolean aIsWorkdayLunch) {
        mMPizzaNumber = aMPizzaNumber;
        mLPizzaNumber = aLPizzaNumber;
        mSideMenus = aSideMenus;
        mIsWorkdayLunch = aIsWorkdayLunch;
    }

    public int discount() {
        if (mLPizzaNumber >= 2) {
            if (mSideMenus[2] >= 1) {
                return 600;
            } else if (mSideMenus[1] >= 1) {
                return 500;
            } else if (mSideMenus[0] >= 1) {
                return 400;
            }
        } else if (mMPizzaNumber + mLPizzaNumber >= 2 && mSideMenus[0] >= 1) {
            return 400;
        } else if (mMPizzaNumber + mLPizzaNumber >= 1 && mIsWorkdayLunch && (mSideMenus[0] >= 1 || mSideMenus[1] >= 1 || mSideMenus[2] >= 1)) {
            return 400;
        }
        return 0;
    }
}
