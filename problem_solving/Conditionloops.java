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

        /// fibonacci series ///
//        System.out.println("Enter n nuber for fibonacci series ");
//        int n = sc.nextInt();
//        fibonacci(n);

        ///  subtract the product nd the sum of the given integer ///
//        System.out.println("Enter the digit");
//        int n = sc.nextInt();
//        int res = sub(n);
//        System.out.println("Subtract of product and sum: "+res);

    }




    ///  Area of Circle ///
    public static float arofcircle(int radius){
        double res = (22/7)*radius*radius;
        return (float)res;
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

}



