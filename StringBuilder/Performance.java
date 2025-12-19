package StringBuilder;

public class Performance {
    public static void main(String[] args) {
       String series = "";
       for(int i=0; i<26; i++){
        char ch = (char)('a'+i);
        series = series + ch;
       }
       System.out.println(series);
    }
}

// this is wrong method in this method space complexity is to high becuse we create a new object after each iterarion(loop).