package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;
import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {
    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;

    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order) {
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("🍔 BurgerQueen Order Service");

        while(true){
            // 1️⃣메뉴 출력
            menu.printMenu();
            // 2️⃣사용자 입력 받기
            // 3️⃣장바구니 담기
            // 4️⃣주문하기
            String input = scanner.nextLine();

            if (input.equals("+")) {
               order.makeOrder();
               break;
            } else {
                int menuNumber = Integer.parseInt(input);

                if(menuNumber == 0) cart.printCart();
                else if (1<=menuNumber && menuNumber<=productRepository.getAllProducts().length) cart.addToCart(menuNumber);
            }

        }





    }
}