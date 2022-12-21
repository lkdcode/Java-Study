package caffeine;

import java.util.Scanner;

public class CoffeeMenu {
    private Scanner scanner;
    private CoffeeConsole coffeeConsole;

    public CoffeeMenu() {
        this.scanner = new Scanner(System.in);
        this.coffeeConsole = new CoffeeConsole();
    }


    public void show() {
        int inputNumber = 0;

        while (true) {
            displayMenu();
            inputNumber = selectMenu();

            switch (inputNumber) {
                case 1:
                    // 직원 선택
                    //
                    //
                    break;
                case 2:
                    // 직원 전체 조회
                    break;
                case 3:
                    // 전체 직원 카페인 상태 보기
                    break;
                case 0:
                    return;
                default:
                    System.out.println("다시 선택해 주세요.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("──────────────────────────────");
        System.out.println("☕ Coffee Menu ☕");
        System.out.println("──────────────────────────────");
        System.out.println("1. 직원 선택.");
        System.out.println("2. 직원 전체 조회.");
        System.out.println("3. 전체 직원 카페인 상태 보기.");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("0. 끝내기.");
        System.out.println("==============================");
    }

    private int selectMenu() {
        System.out.print("Select : ");
        int menuNumber = scanner.nextInt();
        if (menuNumber >= 0 && menuNumber <= 3) {
            scanner.nextLine();
            return menuNumber;
        } else {
            System.out.println("잘 못된 번호를 입력했습니다. ──▶ " + menuNumber);
            return -1;
        }
    }
}