package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.DiscountPolicy;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;
    private Discount discount;

    public Order(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }

    public void makeOrder(){
        //CozDiscountCondition cozDiscountCondition = new CozDiscountCondition();
        //KidDiscountCondition kidDiscountCondition = new KidDiscountCondition();
        CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(new FixedRateDiscountPolicy(10));
        KidDiscountCondition kidDiscountCondition = new KidDiscountCondition(new FixedAmountDiscountPolicy(500));

        //cozDiscountCondition.checkDiscountCondition();
        //kidDiscountCondition.checkDiscountCondition();
        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);

        System.out.println("[📣] 주문이 완료되었습니다. ");
        System.out.println("[📣] 주문 내역은 다음과 같습니다. ");
        System.out.println("-".repeat(60));

        //상품 상세 내역 출력
        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계      : %d원\n", totalPrice);//금액합계계산
        System.out.printf("할인 적용 금액  : %d원\n",finalPrice);
    }
}
