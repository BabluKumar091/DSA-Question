package Recursion5;

public class Stream {
    public static void main(String[] args) {
        String s= "abbcadba";
       System.out.println(skip2(s));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char chr = up.charAt(0);
        if(chr == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+chr, up.substring(1));
        }
    }
    
    static String skip2( String up){
        if(up.isEmpty()){
            return "";
        }

        char chr = up.charAt(0);
        if(chr == 'a'){
          return  skip2(up.substring(1));
        }
        else{
           return chr + skip2(up.substring(1));
        }
    }

}
