package app;

import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;

    public Order(Cart cart){
        this.cart = cart;
    }
    public void makeOrder(){
        //CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(new FixedRateDiscountPolicy(200));
        //KidDiscountCondition kidDiscountCondition = new KidDiscountCondition(new FixedAmountDiscountPolicy(20));

        //cozDiscountCondition.checkDiscountCondition();
        //kidDiscountCondition.checkDiscountCondition();



    }
}
