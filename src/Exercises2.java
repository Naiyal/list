import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercises2
 */
public class Exercises2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int m;
        for (int i = 0; i++ != -1;) {
            System.out.println("1-Add element\n2-Remove element\n3-Print element\n4- Exit");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element: ");
                    m = in.nextInt();
                    list.add(m);
                    System.out.println("Element added");
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    m = in.nextInt();
                    list.remove((Integer) m);
                    System.out.println("Element deleted ");
                    break;
                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    // i = -1;
                    // System.out.println(i);
                    return;

            }

        }
        System.out.println("text");
    }
}