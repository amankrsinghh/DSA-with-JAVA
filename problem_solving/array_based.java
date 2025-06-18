package problem_solving;

import java.util.Arrays;
import java.util.stream.IntStream;

public class array_based {
    public static void main(String[] args) {


        ////=================== Anagram ===============================////////
//        System.out.println(anagram("aman","nama"));

        ////  Inserting element in array ///
//        char[] ar = new char[6];
//
//        ar[0]= 'a';
//        ar[1]= 'b';
//        ar[2]= 'c';
//        ar[3]= 'd';
//        ar[4]= 'e';
//
//        insert(ar, 2, 'f');
//        for (int i = 0; i < ar.length; i++) {
//            System.out.println(ar[i]);
//        }

        /// ========== Two pointer valid palindrome ============////
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        /// ====== build array with permutation ======///
//        int[] nums = {0,2,1,5,3,4};
//        int[] ans = buildArray(nums);
//        System.out.println(Arrays.toString(ans));

        /// concatination of array
//        int[] arr = {2,3,4};
//        int[] ans = concatenate(arr);
//        System.out.println(Arrays.toString(ans));

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        for (int i = 0; i< arr.length;i++){

        }



    }

    /// ////////================== FUNCTIONS =========================///////////

    ///=======================  valid Anagram ==================////
//    public static Boolean anagram ( String s, String t){
//        String st1 = s.replaceAll("\\s"," ");
//        String st2 = t.replaceAll("\\s"," ");
//
//        if(st1.length() != st2.length()){
//            return  false;
//        }
//        else{
//            char [] c1 = st1.toLowerCase().toCharArray();
//            char [] c2 = st2.toLowerCase().toCharArray();
//
//            Arrays.sort(c1);
//            Arrays.sort(c2);
//
//            return Arrays.equals(c1,c2);
//        }
//
//    }


    /// /// ============== inserting an element in an array at desired position =================///////

//    public static void insert(char[] arr, int pos, char val) {
//        for (int i = arr.length - 1; i >= pos; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[pos-1] = val;
//    }


    ///  Two pointer valid palindrome ////
//    public static boolean isPalindrome(String s){
//          s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
//          int i = 0;
//          int j = s.length()-1;
//          while(i<j){
//              if(s.charAt(i)!=s.charAt(j)){
//                  return false;
//              }
//              i++;
//              j--;
//          }
//          return true;
//    }

  ///  Build array from permutation
//    public static int[] buildArray(int[] nums){
//        int[] ans = new int[nums.length];
//        for(int i = 0;i<nums.length;i++){
//             ans[i] = nums[nums[i]];
//        }
//
//        return ans;
//    }

    ///  Concatenation of array
//    public static int[] concatenate(int[] nums){
//        int[] ans  = new int[2*nums.length];
//        for (int i = 0; i <nums.length;i++){
//            ans[i] = ans[i+nums.length] = nums[i];
//        }
//        return ans;

        ///  this is super smart way to concatenate array
//        int[] ans = IntStream.concat(Arrays.stream(nums),Arrays.stream(nums)).toArray();
//        return ans;
//    }
    }
