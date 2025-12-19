package StringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder sereies = new StringBuilder();
    for(int i=0; i<26; i++){
        char ch = (char)('a'+i);
        sereies.append(ch);
       }
       System.out.println(sereies.toString());
       sereies.reverse();
       System.out.println(sereies.toString());
    }
       
}
