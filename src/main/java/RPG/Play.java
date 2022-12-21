package RPG;

import java.util.Scanner;

public class Play {

    MyClass myClass = new MyClass();
    DungeonService dungeonService = new DungeonService();

    private Scanner scan = new Scanner(System.in);

    public Play(int choiceClass) {

        if (choiceClass == 1) {
            myClass.setWizard();
            System.out.println();
            System.out.println("...................");
            System.out.println();
            System.out.println("마법사를 선택하였습니다 🎩 ");
            System.out.println();
        }

        if (choiceClass == 2) {
            myClass.setWarrior();
            System.out.println();
            System.out.println("...................");
            System.out.println();
            System.out.println("전사를 선택하였습니다 ⚔️ ");
            System.out.println();
        }
        inputMenu();
    }

    private void display() {
        System.out.println("...................");
        System.out.println("1. 캐릭터 정보");
        System.out.println("2. 사냥가기");
        System.out.println("3. 인벤토리");
        System.out.println("4. 불러오기");
        System.out.println("5. 저장하기");
        System.out.println("...................");
        System.out.println("9. 무슨 무슨 매뉴");
        System.out.println("0. 게임 종료");
        System.out.println("...................");
        System.out.println();
        System.out.print("입력해주세요 : ");
    }

    private void inputMenu() {
        int inputMenu = 2;
        while (inputMenu != 0) {
            display();
            inputMenu = scan.nextInt();
            System.out.println();
            switch (inputMenu) {
                case 1:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("캐릭터 정보");
                    System.out.println(myClass.toString());
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 2:
                    System.out.println("...................");
                    System.out.println();
                    // 야구도 있고 머도 있꼬
                    dungeonService.baseBall(myClass.getWizard());
                    System.out.println("사냥가기");
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 3:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("인벤토리 정보");
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 4:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("불러오기");
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 5:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("저장하기");
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 9:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("무슨 무슨 매뉴 추가할까");
                    System.out.println();
                    System.out.println("...................");
                    break;
                case 0:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("게임 종료");
                    System.out.println();
                    System.out.println("...................");
                    break;
                default:
                    System.out.println("...................");
                    System.out.println();
                    System.out.println("다시 입력해주세요");
                    System.out.println();
                    System.out.println("...................");
            }
        }

    }
}
