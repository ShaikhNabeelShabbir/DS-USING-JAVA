import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,Integer> student=new HashMap<String,Integer>();
        student.put("Nabeel", 50);
        student.put("Osaid", 27);
        student.put("Faizan", 24);
        student.put("Mueez", 33);

        Set<String> data=student.keySet();
        for (String i : data) {
            System.out.println(student.get(i)+" "+i.hashCode()%10);
        }

        Set<Map.Entry<String,Integer>> data1=student.entrySet();
        for(Map.Entry<String,Integer> i:data1){
            System.out.println(i.getKey()+" "+i.getValue());
        }
        String name="Nabeel";
        System.out.println(name.hashCode());
    }
}
