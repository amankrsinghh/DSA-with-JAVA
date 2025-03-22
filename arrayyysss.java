import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class arrayyysss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       int [] arr = {5, 6, 7, 8, 9};
//        int i = arr.length; // this is for getting the length of the array
//        System.out.println(arr[2]);  // im passing arr[2] , 2 is index it will print the 2th index element of the array
//        System.out.println("the length of array "+  i); // length
//


        ///####/// traverse all element of array and print it all
//        int [] arr = {5,4,6,3,10,23,56};
//        for (int i = 0 ;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }

///      /##/ we can update the value of array
//        int[] arr = {5, 4, 6, 3, 10, 23, 56};
//        arr[2] = 100;
//        System.out.println(arr[2]);


        /// ## //initializing array size and taking input in array and print it all

//        int [] arr = new int[5];
//        for(int i = 0 ; i<arr.length ; i++){
//            System.out.println("Enter value for index " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("your array is :");
//        for (int i = 0 ; i<arr.length ; i++){
//
//            System.out.print(arr[i] + " ");
//        }


///        Q1- Given an array of the marks of students, if the marks of any student is than 35
///        print its roll number. here refers to the index of the array

//        System.out.println("enter the total students size");
//        int totalstd ;
//        totalstd = sc.nextInt();
//
//        int[] marks = new int[totalstd];
//        System.out.println("Enter the marks of students");
//        for(int i = 0; i<marks.length; i++){
//            marks[i] = sc.nextInt();
//        }
//        System.out.println("Students Roll no. who got marks less than 35 ");
//        for(int i = 0;i<marks.length;i++){
//            if(marks[i]<35){
//                System.out.println("Roll no-:"+i);
//            }
//        }


///      Q2- Calculate the sum of the element in the given array

//        System.out.println("Enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for (int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i = 0;i<n;i++){
//            sum= sum+arr[i];
//        }
//        System.out.println("total sum of elements given in array = " + sum);
//


///   Q3-  Find the element 'x' in the array. Take array and x as input

//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("enter the elements you want to search");
//        int search = sc.nextInt();
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == search){
//                System.out.println("Element found at index " + i);
//                break;
//            } else if(i == arr.length - 1){
//                System.out.println("Element not found in the array");
//            }
//        }

       /// Q4- Find the maximum value out of all thr elements in the array

//        int[] arr = {5, 4, 6, 3, 10, 23, 56};
//        int max = arr[0]; // we can also use  Integer.MAX_VALUE OR Integer.MIN_VALUE
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);


        /// Q5- Find the Second maximum value out of all the elements in the array
//        int[] arr = {5, 4, 6, 3, 10, 23, 56};
//        int max = arr[0]; // we can also use  Integer.MAX_VALUE OR Integer.MIN_VALUE
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int smax = Integer.MIN_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > smax && arr[i] != max ) {
//                smax = arr[i];
//            }
//        }
//        System.out.println(smax);

        /// Q6- Count the number of elements in given array greater than a given number x

//        int[] arr = {2,3,4,5,20,10,37};
//        int x = sc.nextInt();
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i]>x){
//                System.out.println(arr[i]);
//                count++;
//            }
//
//        }
//        System.out.println("The total counts are = "+count);


///        Comparing two arrays and print maximum one

//        int[] A = {2, 5, 8, 10};
//        int[] B = {3, 4, 9, 1};
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] > B[i]) {
//                System.out.println(A[i]);
//            } else {
//                System.out.println(B[i]);
//            }
//        }


///       Taking two array and get sum in pair of each element of both arrays like
///        arrA = {1, 2, 3, 4, 5} and arrB = {6, 7, 8, 9, 10} so sum = {7, 9, 11, 13, 15}
//        int[] arrA = {1, 2, 3, 4, 5};
//        int[] arrB = {6, 7, 8, 9, 10};
//
//        int sum = 0;
//
//        for (int i =0;i<arrA.length;i++){
//            sum = arrA[i] + arrB[i];
//            System.out.print(sum+ " ");
//        }




        /// ### Two sum problem using nested loops

//        int[] arr = {1, 2, 3, 4, 5};
//        int x = 10;
//        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];
//            for(int j = 0;j<arr.length;j++){
//                if(a+arr[j] == x){
//                    System.out.println("(" + a + ", " + arr[j] + ")");
//                    break;
//                }
//                else{
//                    System.out.println("No pair found");
//                    break;
//                }
//            }
//            break;
//        }


        ///  Q7- Reverse the given array in my way

//        int[] arr = {1, 2, 3, 4, 5};
//        for(int i = arr.length-1; i>=0;i--){
//            System.out.print(arr[i]+ " ");
//        }


        /// Neat and clean way for reversing the array by two pointer methods

//        int[] arr = {12, 3, 4, 45, 63, 20, 30};
//        reverse(arr);
//        System.out.println("");
//
//        int b = arr.length - 1;
//
//
//        for (int a = 0; a < b; a++) {
//            int temp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = temp;
//            b--;
//        }
//     reverse(arr);



/////  Rotate the given array by  given k steps
//        ///  like arr = {12, 3, 4, 45, 63, 20, 30} and k = 3 should give {45, 63, 20, 30, 12, 3, 4}
//        int[] arr = {12, 3, 4, 45, 63, 20, 30};
//        printt(arr);   //calling printt method , here it will print orignal array
//        System.out.println("");
//
//        int b = arr.length - 1;
//
//
//        for (int a = 0; a < b; a++) {
//          swap(arr,a,b);
//          b--;
//        }
//        printt(arr); //this method will print the reverse of array {30,20,63,45,4,3,12}
//        System.out.println("");
//
//        int k = 0;
//        int l = 4;
//        while (k<l){
//          swap(arr,k,l);// we have now revere array like {30,20,63,45,4,3,12}
//                     // so now we are rotating array by k steps by reversing specific part of array from 0th to 4th step by this we wil get array like {4,45, 63, 20, 30, 3,12}
//            k++;
//            l--;
//        }
//        int m =5;
//        int n = 6;
//        while (m<n){
//           swap(arr,m,n); // we have now rotated array like {45, 63, 20, 30, 12, 3, 4} now we have to just reverse another part for getting {45, 63, 20, 30, 4,3,12}
//            m++;
//            n--;
//        }
//        printt(arr);






    }

    /// this method is for reversing the array using
    public static void printt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
    }

    /// this method is for swapping the elements of two array elements
    public static  void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
