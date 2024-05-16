import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 20, 25, 45, 96, 78));
        list.removeIf(n -> n > 25);
        System.out.println(list);

    }
}
