import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Element: ");
            n = in.nextInt();
            if (!list.contains(n)) {
                list.add(n);
            }
        }
        System.out.println(list);
    }
}
