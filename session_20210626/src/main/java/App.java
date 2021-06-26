import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        String text = "learning java could be fun for some and headache for others".replaceAll("\\s", "");
        HashMap<String, Integer> map = new HashMap<>();

        Arrays.stream(text.split("")).forEach( p-> map.compute(p, (k,v)  -> v==null? 1 : v+1 ))  ;

        System.out.println(map);

    }

}
