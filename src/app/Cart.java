package app;

import app.product.Product;
import app.product.subproduct.BurgerSet;
import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

import java.util.Deque;
import java.util.Scanner;

public class Cart {
    private Product[] items = new Product[0];
    private Scanner scanner = new Scanner(System.in);
    private Menu menu;
    public void printCart(){
        System.out.println("🧺 장바구니");
        System.out.println("-".repeat(60));

        //여기에 장바구니 상품들을 옵션 정보와 함께 출력
        printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("합계 : %d원\n", calculateTotalPrice());

        System.out.println("이전으로 돌아가려면 엔터를 누르세요. ");
        scanner.nextLine();
    }
    private void printCartItemDetails(){
        for(Product product : items){
            if(product instanceof BurgerSet) {
                BurgerSet burgerSet = (BurgerSet) product;
                System.out.printf(
                        "%s %6d원 (%s(케첩 %d개), %s(빨대 %s개)\n",
                        burgerSet.getName(),
                        burgerSet.getPrice(),
                        burgerSet.getSide().getName(),
                        burgerSet.getSide().getKetchup(),
                        burgerSet.getDrink().getName(),
                        burgerSet.getDrink().hasStraw() ? "있음" : "없음"
                );
            } else if (product instanceof Hamburger) {
                Hamburger hamburger = (Hamburger) product;
                System.out.printf(
                        "%-8s %6d원 (단품)\n",
                        hamburger.getName(),
                        hamburger.getPrice()
                );
            } else if (product instanceof Side) {
                Side side = (Side) product;
                System.out.printf(
                        "%-8s %6d원 (케첩 %d개\n)",
                        side.getName(),
                        side.getPrice(),
                        side.getKetchup()
                );
            } else if (product instanceof Drink) {
                Drink drink = (Drink) product;
                System.out.printf(
                        "%-8s %6d원 (빨대 %s\n)",
                        drink.getName(),
                        drink.getPrice(),
                        drink.hasStraw() ? "있음" : "없음"
                );
            }
        }
    }
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addToCart(int productId){
        // 2.2.1.
        //Product product = productId를 통해 productId를 id로 가지는 상품 찾기

        // 2.2.2.
        //상품 옵션 설정 // chooseOption()

        // 2.2.3.
        //if (product가 Hamburger의 인스턴스이고, isBurgerSet이 true라면) {
        //    product = 세트 구성 // composeSet();
        //}

        // 2.2.4.
        //items에 product 추가

        //"[📣] XXXX를(을) 장바구니에 담았습니다." 출력
    }
    private void chooseOption(Product product) {
        String input;

        if (product instanceof Hamburger) {
            Hamburger hamburger = (Hamburger) product;
            System.out.printf(
                    "단품으로 주문하시겠어요? (1)_단품(%d원) (2)_세트(%s원)\n",
                    hamburger.getPrice(),
                    hamburger.getBurgerSetPrice()
            );
            input = scanner.nextLine();
            if (input.equals("2")) hamburger.setIsBurgerSet(true);
        } else if (product instanceof Side) {
            Side side = (Side) product;
            System.out.println("케첩은 몇개가 필요하신가요?");
            input = scanner.nextLine();
            side.setKetchup(Integer.parseInt(input));
        } else if (product instanceof Drink) {
            Drink drink = (Drink) product;
            System.out.println("빨대가 필요하신가요? (1)_예 (2)_아니오");
            input = scanner.nextLine();
            if (input.equals("2")) drink.setHasStraw(false);
        }
    }
    private BurgerSet composeSet(Hamburger hamburger) {
        //"사이드를 골라주세요" 출력
        //사이드 메뉴 출력

        //String sideId = 사용자 입력 받기
        //Side side = sideId를 id로 가지는 상품 검색
        //사이드 옵션 선택

        //"음료를 골라주세요." 출력
        //음료 메뉴 출력

        //String drinkId = 사용자 입력 받기
        //Drink drink = drinkId를 id로 가지는 상품 검색
        //드링크 옵션 선택

        //String name = hamburger의 이름 + "세트";
        //int price = hamburger의 BurgerSetPrice필드의 값
        //int kcal = 햄버거, 사이드, 드링크의 칼로리 총합
        //return new BurgerSet(name, price, kcal, hamburger, side, drink);
    }

}
