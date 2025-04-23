import javax.swing.*;
import java.util.Scanner;

public class practice {

    /// /SQUARE ////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /* Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    for(int i = 1;i<=5;i++){
      for(int j = 1;j<=5;j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }*/


        /// RIGHT HALF PYRAMID ///
  /*   System.out.println("enter the number  of rows");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j = 1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println(" ");
    }*/


        ///lEFT HALF PYRAMID///
 /*  System.out.println("enter the number of rows ");
Scanner sc = new Scanner(System.in);
int  n = sc.nextInt();
for (int i = 1;i<=n;i++){
  for(int j = 1;j<=n-i;j++){
    System.out.print(" ");
}
for(int j = 1;j<=i;j++){
  System.out.print("*");
}
System.out.println(" ");

  }*/


        ///REVERSE RIGHT HALF PYRAMID///
 /*  System.out.println("enter the rows");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i = n;i>=1;i--){
    for(int j = 1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println(" ");
  }*/

        //// REVERSE LEFT HALF PYRAMID ////
 /* System.out.println("enter the rows");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i = 1;i<=n;i++){
    for(int j = 1;j<=i;j++){
      System.out.print(" ");
}
for(int j = i;j<=n;j++){
  System.out.print("*");
}
System.out.println(" ");
} */

        ///RHOMBUS///
  /*  System.out.println("enter the number of rows");  
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i = 1;i<=n;i++){
    for(int j = 1;j<=i;j++){
      System.out.print(" ");
    }
    for(int j = 1;j<=n;j++){
      System.out.print("*");
   }  
   System.out.println(" ");
  } */


        ///  this is the neat and clean way to reverse the array
//      int[] arr = {1, 2, 3, 4, 5};
//      printt(arr);
//      System.out.println("");
//      int i = 0;
//      int j = arr.length-1;
//      while(i<j){
//          swap(arr, i, j);
//          i++;
//          j--;
//      }
//      printt(arr);

//      int[] arrA = {1, 2, 3, 4, 5};
//        int[] arrB = {6, 7, 8, 9, 10};
//        int[] arrC = new int[arrA.length];
//        int sum = 0;
//
//        for (int i =0;i<arrA.length;i++){
//            sum = arrA[i] + arrB[i];
//            arrC[i] = sum;
//            System.out.print( arrC[i] +" ");
//        }


//        int[] arr = {2, 4, 5, 9, 20};
//        int target = 7;
//
//        twosum(arr,target);



//        int[] arr = {2,4,5,6,7,9};
//        for (int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
//a,b
        for (int i = 2;i<=n;i++){
            int temp = b;
            b = a+b;
            a = temp;
            System.out.print(b+ " ");
        }

    }
    public static int[] twosum(int[] arr, int target){
        for(int i =0;i< arr.length;i++){
            for(int j = 1;j< arr.length;j++){
                if(arr[i]+ arr[j]==target){
                    int[] z = {i,j};
                    return z;

                }
            }
        }

       return null;
    }
}
