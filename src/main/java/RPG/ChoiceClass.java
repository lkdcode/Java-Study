package RPG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceClass {
    private Scanner scan = new Scanner(System.in);

    private int choiceClass;

    public int getChoiceClass() {
        return choiceClass;
    }

    public ChoiceClass() {
        System.out.println("직업을 선택해주세요 👉 ");
        System.out.println("...................");
        System.out.println("1. 마법사");
        System.out.println("2. 전사");
        System.out.print("입력 대기중 .... : ");
        validate();
    }

    private void validate() {
        int input = scan.nextInt();
        if (input != 1 && input != 2) {
            System.out.println("다시 선택해주세요 👉 ");
            System.out.println("...................");
            System.out.println("1. 마법사");
            System.out.println("2. 전사");
            System.out.print("입력 대기중 .... : ");
            validate();
        }
        choiceClass = input;
    }
}