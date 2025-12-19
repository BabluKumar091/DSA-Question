package Recursion5;
public class Permutation {
    public static void main(String[] args) {
        permutaion("", "abc");
    }

    static void permutaion(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String strt = p.substring(0, i);
            String end = p.substring(i, p.length());
            permutaion(strt+ch+end, up.substring(1));
        }
    }
}
