import java.util.*;

public class Main {
    public static void main(String[] args) {

        
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 400; i++) {
            array.add(random.nextInt(0,20));

        }
        System.out.println(array);
        int a = 0;
        for (int i = 0; i < array.size(); i++) {
            a+=array.get(i);

        }
        System.out.println(a);
        Set<Integer> var = new HashSet<>();
        var.addAll(array);
        var.add(a);
        System.out.println(var);

        List<Integer> m = new ArrayList<>();
        m.addAll(var);
        int s =  0;
        for (int i = 0; i < var.size() ; i++) {
            s+=m.get(i);

        }
        System.out.println(s);

    }


}