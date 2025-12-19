

public class FindUnique {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2, 4, 5, 4, 5};
        System.out.println(uniqe(arr));
    }
    static int uniqe(int[] arr){
        int uniqe = 0;
        for (int n : arr){
            uniqe ^= n;
        }
        return uniqe;
    }
}
