package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        Scanner scan = new Scanner(System.in);


        try {
            inputStream = new FileInputStream("C:\\Users\\lkd\\IdeaProjects\\Java-Study\\src\\main\\java\\File\\chicken.txt");
            outputStream = new FileOutputStream("C:\\Users\\lkd\\IdeaProjects\\Java-Study\\src\\main\\java\\File\\test.txt");

            System.out.println("입력해라 저장할것을!!: ");
            outputStream.write(scan.nextLine().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);
    }
}
