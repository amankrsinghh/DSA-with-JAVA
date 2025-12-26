package problem_solving;

import java.util.Scanner;

public class Conditionloops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///  Area of Circle ///
//        System.out.println("Enter radius of the Circle");
//        int r = sc.nextInt();
//        float area  = arofcircle(r);
//        System.out.println("Area : " + area);

        /// Area of Triangle ///
//        System.out.println(aroftriangle(6,20));

        /// Area of rectangle ///
//        System.out.println(arofractangle(4,8));

        ///  Area of Rhombus based on diagonal///
//        System.out.println(arofRhombus(6,8));

        /// fibonacci series ///
//        System.out.println("Enter n nuber for fibonacci series ");
//        int n = sc.nextInt();
//        fibonacci(n);

        ///  subtract the product nd the sum of the given integer ///
       System.out.println("Enter the digit");
       int n = sc.nextInt();
       int res = sub(n);
       System.out.println("Subtract of product and sum: "+res);

/// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)///
//        sumOfAll();

//largestNo();

    }

    /// /========================FUNCTIONS =======================================//////////////////////

    ///  Area of Circle ///
    public static float arofcircle(int radius){
        double res = ((float)22/7)*radius*radius;
        return (float)res;
    }
///  Area of Triangle ///
    public static float aroftriangle (int base, int height){
        float area = ((float)1/2)*base*height;

        return area;
    }

    /// Area of rectangle ///
    public static float arofractangle(float length, float breadth){
         float area = length*breadth;
         return area;
    }

    ///  area of rhombus based on Diagonal ///
    public static float arofRhombus(int diagonal1, int diagonal2){
        float area = (float)((diagonal1*diagonal2)/2);
        return  area;
    }


    ///  fibonacci series ///
public static void fibonacci ( int n ){
        int a = 0;
        int b = 1;
        for(int i = 0;i<n;i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
}

///  subtract the product nd the sum of the given integer //
public static int sub(int n ){
    int mul = 1;
    int sum = 0;
    while (n>0){
        int lg = n%10;  // iss se har baar last digit nikal jayega
        n = n/10; // iss se given digit ka har baar last digit remove krnge
                   // Taki next last digit nikal sake
        mul = mul*lg;
        sum = sum+lg;
    }
    System.out.println("the product of digit: "+ mul + " and the sum of the digit: "+sum);
    return mul-sum;

}

/// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)///
    public static void sumOfAll(){
        Scanner sc = new Scanner(System.in);
//int number;
//int sum = 0;
//        System.out.println("enter Number and enter 0 to stop");
//        while(true){
//            number = sc.nextInt();
//           if(number==0){
//               break;
//           }
//           sum = sum+number;
//        }
//        System.out.println(sum);


        ///  one more way ///

//        int sum = 0;
//        int number;
//
//        System.out.println("Enter numbers (0 to stop):");
//        number = sc.nextInt(); // Pehla input lene ke liye
//
//        while (number != 0) { // Condition ko yahi check kar liya
//            sum += number;
//            number = sc.nextInt(); // Agla input lene ke liye
//        }
//
//        System.out.println("Sum of entered numbers: " + sum);
    }

    /// Take integer inputs till the user enters 0 and print the largest number from all.///
    public static void largestNo(){
        Scanner sc = new Scanner(System.in);
        int n;
        int max= Integer.MIN_VALUE;
        while(true){
            n = sc.nextInt();
            if(n==0){
            break;
            }
            if(n>max){
                 max=n;
            }
        }
        System.out.println(max);
    }
}



