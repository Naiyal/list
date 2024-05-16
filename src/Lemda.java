import java.util.ArrayList;
import java.util.Arrays;

public class Lemda {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 20, 25, 45, 96, 78));
        list.removeIf(n -> n > 25);
        System.out.println(list);

    }
}
