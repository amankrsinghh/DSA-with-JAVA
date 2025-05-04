package problem_solving;

import java.util.Arrays;

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

//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
//    public static Boolean anagram ( String s, String t){
//        String st1 = s.replaceAll("//s"," ");
//        String st2 = t.replaceAll("//s"," ");
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
    public static boolean isPalindrome(String s){
          s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
          int i = 0;
          int j = s.length()-1;
          while(i<j){
              if(s.charAt(i)!=s.charAt(j)){
                  return false;
              }
              i++;
              j--;
          }
          return true;
    }

}
