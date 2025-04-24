package problem_solving;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class First_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float a = sc.nextInt();// here is automatic type casting because a destination type is larger
//        than the source type and both type is compatible
//        System.out.println(a);
//
//
//        //another example
//        int a = sc.nextFloat(); // this will throw error because a destination type
//        is smaller than the source type
//
//        int a = sc.nextInt(); // through sc object we are taking input and
//        the sc object is created by the help of scanner class which is inbuilt
//        int b = sc.nextInt();
//        float sum = a + b; //float is destination type and sources are
//        int type so it will automatically typecast and give the result in float
//        System.out.println(sum);
//
//        //  now let's try the opposite
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        int sum = (int) (a + b); /// here the source type (float)
//        is larger than the destination type, so we have to typecast explicitly
//        System.out.println(sum);

        ///  type promotion
//        byte a = 20;
//        byte b = 30;
//        byte c = 100;
//        byte d = 90;
//        int sum = (a*b*c)+d; // here is happening type promotion because the operation
        // we are performing on byte values in an int type, so the total
        // value gets promote into an int type because int is bigger than byte
//        System.out.println(sum);
  //// Q1. Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.println("enter your number for checking it is even or odd");
//        int n = sc.nextInt();
//        evenodd(n);


        /// Q2. Take the name as input and print a greeting message for that particular name.
//        System.out.println("Enter your Name");
//        String name = sc.nextLine();
//        getName(name);
//

        ///Q3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.println("enter the principal amount");
//        int p = sc.nextInt();
//        System.out.println("enter the time consumed");
//        int t = sc.nextInt();
//        System.out.println("enter the rate");
//        int r = sc.nextInt();
//        System.out.println("SI :- "+simpleInterest(p,t,r));


/// /// Q4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        int fnalres = calculate(a,b);
//        System.out.println(fnalres);

        /// Q5. Take 2 numbers as input and print the largest number.
//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        greater(a,b);


        /// Q6. Input currency in rupees and output in USD.
//        System.out.println("Enter amount in rupees");
//        float rs = sc.nextFloat();
//        double res = currencyConverter(rs);
//        System.out.println("$" + res);


        /// Q7. To calculate Fibonacci Series up to n numbers.
//        System.out.println("Enter nth number for Fibonacci series");
//        int n = sc.nextInt();
//        fibonacci(n);




        /// Q8. To find out whether the given String is Palindrome or not.
//        System.out.println("Enter Your string");
//        String input = sc.nextLine();
//        palindrome(input);


        System.out.println("Enetr 3 digit number ");
        int n = sc.nextInt();


        boolean res = armstrong(n);
        if(res == true){
            System.out.println("it is an Armstrong");
        }else{
            System.out.println("it's not an Armstrong");
        }



    }
    public static void evenodd(int n){
        if (n%2==0){
            System.out.println(n+" is even");
        }else {
            System.out.println(n+" is odd");
        }


    }
    public static void getName(String name){
        System.out.println("Hello "+name+" welcome to my house");
    }
    public static int simpleInterest( int p,int t,int r){
        int res = (p*r*t)/100;
        return res;
    }
    public static int calculate(int a , int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator");
        char operator = sc.nextLine().charAt(0);
       if(operator == '+'){
           int res = a+b;
           return res;

       }else if (operator == '-'){

           int res = a-b;
           return res;
       }
       else if (operator == '*'){
           int res = a*b;
           return res;
       }
       else if (operator == '/'){
           if(b!=0) {
               int res = a/b;
               return res;
           }
       }
       else {
           System.out.println("enter the correct operator 🙂");
       }
     return 0;
    }
public static  void greater (int a , int b){

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else {
            System.out.println(b+" is greater than "+a);
        }
}
public  static double currencyConverter(float rs){
        double res = rs*0.012;
        return res;
}
public static void fibonacci (int n ){
    int a = 0;
    int b = 1;
    /// /0,1,1,2,3,5,.......fibonacci series
    for(int i = 1;i<=n;i++){

        int c = a+b;
        a = b;
        b = c;
        System.out.println(c+" ");
    }
}
public static void palindrome(String input){
    int length = input.length();
    boolean is_palindrome = true;

    for(int i = 0;i<length/2;i++){
        if(input.charAt(i)!= input.charAt(length-1-i)){
            is_palindrome = false;
            break;
        }

    }
    if (is_palindrome){
        System.out.println(input+" is palindrome");
    }else {
         System.out.println(input+" is not palindrome");
    }
}
    public static boolean armstrong(int n) {
        int original = n; // Original value save kar lo
        int sum = 0;

        while (n > 0) { // `for` loop ki jagah `while` loop use karo
            int rem = n % 10;
            int pow = rem * rem * rem;
            sum += pow;
            n = n / 10; // Number ko divide karte raho
        }

        if (sum == original) { // Original value ke saath compare karo
            return true;
        } else {
           return false;
        }
    }
}
