import java.util.*;
class Main {
    public static void dubChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            // if (Character.isWhitespace(ch)) continue; 
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                System.out.println(e.getKey() +": "+ e.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        dubChar(str);
    }
}