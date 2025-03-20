import java.util.*;

public class arrayyysss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       int [] arr = {5, 6, 7, 8, 9};
//        int i = arr.length; // this is for getting the length of the array
//        System.out.println(arr[2]);  // im passing arr[2] , 2 is index it will print the 2th index element of the array
//        System.out.println("the length of array "+  i); // length
//


        //####/// traverse all element of array and print it all
//        int [] arr = {5,4,6,3,10,23,56};
//        for (int i = 0 ;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }

//      /##/ we can update the value of array
//        int[] arr = {5, 4, 6, 3, 10, 23, 56};
//        arr[2] = 100;
//        System.out.println(arr[2]);


        // ## //initializing array size and taking input in array and print it all

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


//        Q1- Given an array of the marks of students, if the marks of any student is than 35
//        print its roll number. here refers to the index of the array

//        int[] marks = {20, 37, 40, 9, 4, 29, 35};
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] < 35) {
//                System.out.println("roll no-:" + i);
//            }
//        }


//      Q2- Calculate the sum of the element in the given array

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


//   Q3-  Find the element 'x' in the array. Take array and x as input

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

        // Q4- Find the maximum value out of all thr elements in the array

//        int[] arr = {5, 4, 6, 3, 10, 23, 56};
//        int max = arr[0]; // we can also use  Integer.MAX_VALUE OR Integer.MIN_VALUE
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);


        // Q5- Find the Second maximum value out of all the elements in the array
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


        // Q6- Count the number of elements in given array greater than a given number x

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


    }
}
