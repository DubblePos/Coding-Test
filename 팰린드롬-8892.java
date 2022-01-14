import java.util.*;

public class Main {
   static int stop= 0;
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);   
     
       int T = sc.nextInt();
       for(int i=0; i<T; i++ ){
           int k = sc.nextInt();
           String[] words = new String[k];
           for(int j=0; j<k ; j++){
               String word = sc.next();
               words[j] = word;
              
           } permutation(words, 0, k, 2);
           if (stop==0) {
              System.out.println(0);
           }stop=0;
       }
}static void permutation(String[] arr, int depth, int n, int r) {
    if (depth == r) {
        print(arr, r);
        return;
    }
 
    for (int i=depth; i<n; i++) {
        swap(arr, depth, i);
        if (stop==1) {
           return;
        }
        permutation(arr, depth + 1, n, r);
        swap(arr, depth, i);
    }
}
static void swap(String[] arr, int depth, int i) {
    String temp = arr[depth];
    arr[depth] = arr[i];
    arr[i] = temp;
}
static void print(String[] arr, int r) {
   StringBuffer sb = new StringBuffer(arr[0]+arr[1]);
   String reversedStr = sb.reverse().toString();
   if ((arr[0]+arr[1]).equals(reversedStr)) {
      System.out.println(arr[0]+arr[1]);
      stop=1;
   }
}
}