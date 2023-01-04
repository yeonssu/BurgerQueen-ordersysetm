package app;

import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);
        Cart cart = new Cart(productRepository,menu);
        while(true){
            // 1️⃣메뉴 출력
            System.out.println("🍔 BurgerQueen Order Service");
            menu.printMenu();
            // 2️⃣사용자 입력 받기
            String input = scanner.nextLine();

            if (input.equals("+")) {
               //주문 내역 출력
               break;
            } else {
                int menuNumber = Integer.parseInt(input);

                if(menuNumber == 0) cart.printCart();
                else if (1<=menuNumber && menuNumber<=products.length) cart.addToCart(menuNumber);
            }
            // 3️⃣장바구니 담기
            // 4️⃣주문하기
        }





    }
}