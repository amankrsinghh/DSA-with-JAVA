package function;

import java.util.*;
public class functionnnn {
   /* public static void printname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
    String name = sc.next();
      printname(name);
    }*/


                                               //greater of two number//
    /*
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter two number:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Greater number: " + grt(a,b));
}
                        //// sum of two number///
/*public static int sumation(int a, int b)
        int sum = a+b;
        System.out.println(sum);

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumation(a,b);
        System.out.println("Sum of two number :"+sum);
    }*/


                                        // for multiplying two number//
   /* public static int multiplication(int a , int b){
        int mul = a*b;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number for multiplication:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multiplication(a,b);
        System.out.println(" your multiplication value : "+mul);
    }*/


                                                   //Factorial//
    /*public static int fact(int a){
        int fac = 1;
        for(  int i = 1;i<=a;i++){
            fac = fac*i;

        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial :");
        int a = sc.nextInt();
        System.out.println("your factorial of your given number: "+fact(a));
    }*/

                  //Enter 3 numbers from the user & make a function to print their average//

   /* public static int average (int a,int b,int c){
        int avg = (a+b+c)/3;
      return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number:");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        System.out.println("average of given three number are :"+average(a,b,c));

    }*/

                      //Write a function to print the sum of all odd numbers from 1 to n//


/*public static int sumofodd(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N number:");
        int n = sc.nextInt();
        System.out.println("sum of given N odd numbers :"+sumofodd(n));
    }*/

             //Write a function which takes in 2 numbers and returns the greater of those two//

    public static int grt(int a, int b ){
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("b is greater");
        }
         return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(grt(a,b));
    }

}

