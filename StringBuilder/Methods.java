package StringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Bablu kumar";
        System.out.println(Arrays.toString(name.toCharArray()));// [B, a, b, l, u,  , k, u, m, a, r]
        System.out.println("       bablu,p   ".strip());//bablu
        System.out.println(name.indexOf('a'));//1
        System.out.println(Arrays.toString(name.split(" "))); //[Bablu, kumar]
    }
}
