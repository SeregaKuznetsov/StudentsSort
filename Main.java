import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Student st1 = new Student("Danil", 21334);
        Student st2 = new Student("Sergey", 234234);
        Student st3 = new Student("Taras", 343423);
        Student st4 = new Student("Egor", 12312);
        hashMap.put(st1.getIndex(), st1.getName());
        hashMap.put(st2.getIndex(), st2.getName());
        hashMap.put(st3.getIndex(), st3.getName());

        System.out.println(hashMap.get(343423));

    }
}


