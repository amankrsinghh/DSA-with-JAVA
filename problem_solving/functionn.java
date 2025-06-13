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
//        System.out.println("Enter two number for multiplication");
//        int a  = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(multiply(a,b));

        /// ============ area and circumference  of the circle =============///
//        area_circumference(9);

        /// ============ prime or not =================///
//        System.out.println(prime(10));

        /// =============== grading System ==============///
//        gradingSystem(56);

        /// ================ Factorial=============//
//        factorial(3);

        ///  ============= palindrome ================///
//        System.out.println(palindrome(121));

        ///  ================ simple pythogorean triplet ========///
//        boolean res = pythagoreantriplet(3,4,5);
//        System.out.println(res);

        ///  prime number between given two number
//        primeNo(2,10);


        ///  Write a function that returns the sum of first n natural numbers.
        int res = sumofnaturalNo(3);
        System.out.println(res);
    }




    /// ================================= Function ============================///

    ///  function for finding maximum from three given numbers
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
///  checking age for voting
    public static  void voting(int age){
        if(age>=18){
            System.out.println("yes you are eligible for voting");
        }else {
            System.out.println("No you are not eligible for voting");
        }

    }

    /// addition
    public static int sum(int a, int b){
        int res = a+b;
        return res;
    }
///  multiplication
    public static int multiply(int a, int b){
        int res = a*b;
        return res;
    }

    /// finding area and circumference for circle
    public static void area_circumference(int radius){
        Double area = Math.PI*(radius*radius);
        System.out.println("Area of the circle is "+area);

        double circumference = Math.PI*2*radius;
        System.out.println("Circumference of the circle is "+circumference);


        ///  checking number it is prime or not
    }
    public static  boolean prime(int n){
        if(n<=1){
            return false;
        }
        else {
            for(int i = 2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    /// grading System
    public static void gradingSystem(int marks){
       if(marks>90&&marks<100){
           System.out.println("Grade: AA");
       } else if (marks>81&& marks<90) {
           System.out.println("Grade: AB");
       } else if (marks>71&& marks<80) {
           System.out.println("Grade: BB");
       } else if (marks>61&&marks<70) {
           System.out.println("Grade: BC");
       } else if (marks>51&&marks<60) {
           System.out.println("Grade: CD");
       } else if (marks>41&&marks<50) {
           System.out.println("Grade: BC");
       }
       else {
           System.out.println("Fail");
       }
    }

    ///  factorial program
    public static void factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
  ///  palindrome checking
    public static boolean palindrome(int n) {
        if (n < 0) {
            return false;
        }
        int x = n;
        int rev = 0;
        while (x > 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    ///  pythagorean triplet
    public static boolean pythagoreantriplet(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        int x = a * a;
        int y = b * b;
        int z = c * c;
        if (x == y + z || y == z + x || z == x + y) {
            return true;
        } else {
            return false;
        }

    }

    public static void primeNo(int a, int b) {
        if (a < 1 || b < 1) {
            System.out.println("Invalid input, both numbers should be positive.");
            return;
        }

        System.out.println("Prime numbers between " + a + " and " + b + ":");

        for (int i = a + 1; i < b; i++) {
            int j;
            for ( j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i==j && i > 1) {
                System.out.print(i + " ");
            }
        }

    }
//// Sum of first Natural Number
    public static int sumofnaturalNo(int n )
    {
        int sumofN = 0;
        for (int i = 1;i<=n;i++){
            sumofN = sumofN+i;
        }
        return sumofN;
    }

}

