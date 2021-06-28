import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        String text = "learning java could be fun for some and headache for others".replaceAll("\\s", "");
        HashMap<String, Integer> map = new HashMap<>();

        Arrays.stream(text.split("")).forEach( p-> map.compute(p, (k,v)  -> v==null? 1 : v+1 ))  ;

        //map.computeIfPresent()

        System.out.println("======>>>>>>");
        System.out.println(map);
        Map<String, Integer> map2 = new HashMap<>();
        String[] strings = {"a", "b", "a", "b"};
        word0(map2, strings);
        System.out.println(map2);

    }

    public static Map<String, Integer> word0(Map<String, Integer> map, String[] strings) {
        Arrays.stream(strings).forEach(c-> map.put(c,0));
        return map;
    }


    public Map<String, String> mapShare(Map<String, String> map) {

        if( map.containsKey("a") ) {
            map.put("b", map.get("a"));
        }

        map.remove( "c");
        return map;
    }

}
