import java.util.*;

class intro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Delhi",2000);
        map.put("Mumbai",3000);
        map.put("Bangalore",4000);
      System.out.println(map.get("Delhi"));
      System.out.println(map.get("Bihar")); // This will return null since "Bihar" is not in the map

      //Search

    //   if (map.containsKey("Delhi")) {
    //       System.out.println("Delhi is present in the map");
    //   } else {
    //       System.out.println("Delhi is not present in the map");
    //   }

    // for(Map.Entry<String, Integer> e: map.entrySet()){
    //     System.out.println(e.getKey() + " " + e.getValue());
    // }

    map.remove("Delhi");

    Set<String> keys = map.keySet();
    for(String key : keys){
        System.out.println(key + " " + map.get(key));
    }
    }
}