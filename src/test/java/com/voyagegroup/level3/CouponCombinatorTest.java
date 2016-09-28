package com.voyagegroup.level3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CouponCombinatorTest {
    CouponCombinator mCouponCombinator = new CouponCombinator();

    @Test
    public void useCouponNotSetMenuTest() {
        assertThat(mCouponCombinator.pay(2200, 2, 0, new int[]{1, 0, 0}, false, new int[]{1, 0, 0, 0}), is(new int[]{1, 0, 0, 0}));
    }

    @Test
    public void useSetMenuNotCouponTest() {
        assertThat(mCouponCombinator.pay(3200, 0, 2, new int[]{0, 0, 1}, false, new int[]{1, 0, 0, 0}), is(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void useWorkLunchSetMenuTest() {
        assertThat(mCouponCombinator.pay(2400, 0, 1, new int[]{0, 0, 1}, true, new int[]{0, 0, 1, 0}), is(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void useSetMenuForSamePaymentTest() {
        assertThat(mCouponCombinator.pay(3200, 0, 2, new int[]{0, 1, 0}, false, new int[]{1, 0, 0, 0}), is(new int[]{0, 0, 0, 0}));
    }
}