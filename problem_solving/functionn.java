package problem_solving;

import java.util.Scanner;

public class functionn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// =========  maximum number among given three number =========///
//        System.out.println("Enter three number");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        max(a,b,c);

        /// ========== even or odd ===============//
//        System.out.println("enter any number to check it is even or odd ");
//        int n = sc.nextInt();
//        evenorodd(n);

        /// ======== check age for voting ========///
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        voting(age);

        ///  =========== addition ==========////
//        System.out.println("Enter two number for addition");
//        int a  = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(sum(a,b));

        /// =========== multiply ==============//
        System.out.println("Enter two number for multiplication");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multiply(a,b));

    }

    /// ================================= Function ============================///

    ///  function for finding maximum from three given number
    public static int max(int a, int b, int c){
        if(a>b&&b>c){
            System.out.println(a+" is maximum");
        } else if (b>a&&a>c) {
            System.out.println(b +" is maximum");
        }else {
            System.out.println(c+" is maximum");
        }

        return 0;
    }

    /// even or odd
    public static void evenorodd(int n){
        if(n%2==0){
            System.out.println(n +" is Even");
        }else {
            System.out.println(n+" is Odd");
        }
    }

    public static  void voting(int age){
        if(age>=18){
            System.out.println("yes you are eligible for voting");
        }else {
            System.out.println("No you are not eligible for voting");
        }

    }
    public static int sum(int a, int b){
        int res = a+b;
        return res;
    }

    public static int multiply(int a, int b){
        int res = a*b;
        return res;
    }
}

