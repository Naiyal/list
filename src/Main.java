import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main extends ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 20, 25));
        ArrayList<Integer> list2 = new ArrayList<>();
        Main arr = new Main();
        list2 = (ArrayList) list.clone();
        // System.out.println(list.contains(5));
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        arr.add(10);
        list2.set(0, 20);
        list2.remove(Integer.valueOf(25));

    }
}
