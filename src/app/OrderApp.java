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
        while(true){
            // 1️⃣메뉴 출력
            System.out.println("🍔 BurgerQueen Order Service");
            menu.printMenu();
            // 2️⃣사용자 입력 받기
            String input = scanner.nextLine();
        }


        // if (사용자 입력이 +인 경우) {
        //   주문 내역 출력
        //   break;
        // }
        // else if (사용자 입력이 0인 경우) {
        //  ️장바구니 출력
        // }
        // else if (사용자 입력이 1부터 메뉴 마지막 번호에 해당하는 경우) {
        //   사용자가 고른 상품의 옵션을 보여주고 고르게 한 후, 장바구니에 담기
        // }
        // 3️⃣장바구니 담기
        // 4️⃣주문하기

    }
}
// while(true){
//   1️⃣메뉴 출력
//   2️⃣사용자 입력 받기
//   if (사용자 입력이 +인 경우) {
//       주문 내역 출력
//       break;
//   }
//      else if (사용자 입력이 0인 경우) {
//  ️장바구니 출력
// }
// else if (사용자 입력이 1부터 메뉴 마지막 번호에 해당하는 경우) {
//   사용자가 고른 상품의 옵션을 보여주고 고르게 한 후, 장바구니에 담기
// }
// 3️⃣장바구니 담기
// 4️⃣주문하기
//}