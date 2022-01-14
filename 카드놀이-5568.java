package test;
import java.util.*;

public class Main {
   static HashSet<Integer> num_list1 = new HashSet<Integer>();
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
       int n = sc.nextInt();
       int k = sc.nextInt();
       int [] nums = new int [n];
       
       for(int i=0; i<n; i++) {
          int num = sc.nextInt();
          nums[i] = num;
       }
       permutation(nums, 0, n, k);
       System.out.println(num_list1.size());
    }
   
   
   
   static void permutation(int[] arr, int depth, int n, int r) {
       if (depth == r) {
           print(arr, r);
           return;
       }
    
       for (int i=depth; i<n; i++) {
           swap(arr, depth, i);
           permutation(arr, depth + 1, n, r);
           swap(arr, depth, i);
       }
   }
    
   static void swap(int[] arr, int depth, int i) {
       int temp = arr[depth];
       arr[depth] = arr[i];
       arr[i] = temp;
   }
    static void print(int[] arr, int r) {
       String sum_num="";
        for (int i = 0; i < r; i++) {
           String temp_num = Integer.toString(arr[i]);
           sum_num+=temp_num;
        }
       
        int sum_num2 = Integer.parseInt(sum_num);
        num_list1.add(sum_num2);
    }
}