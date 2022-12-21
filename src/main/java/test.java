import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C");
        list.add("React");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println();

        list.stream().forEach((String str) -> {
            System.out.println(str);
        });

        System.out.println();

        list.stream().forEach(str -> {
            System.out.println(str + "응");
        });

        System.out.println();

        list.stream().forEach(System.out::println);

    }
}