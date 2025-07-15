import java.util.Arrays;
import java.util.Scanner;

public class Dsa_prac {
    public static void main(String[] args) {
       //To calculate Fibonacci Series up to n numbers.

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0 ; i < n;i++) {
//            System.out.println(fibonacci(i));
//        }

        /// find out whether the given String is Palindrome or not.
//        String input = sc.next();
//        palindrome(input);

///To find Armstrong Number between two given number.
//        int num = sc.nextInt();
//        System.out.println(armstrong(num));

        /// Subtract the Product and Sum of Digits of an Integer
//int n = sc.nextInt();
//        System.out.println(suar(n));


/// Input a number and print all the factors of that number (use loops).
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        factor(num);

/// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//        System.out.println(sumNumber());
/// Take integer inputs till the user enters 0 and print the largest number from all.
//        System.out.println(largestNum());


//        System.out.println(factorial(5));

        /// Calculate Average Of N Numbers
//        int num = sc.nextInt();
//        System.out.println( sumAverage(num));


//        int [] nums  = {2,6,7,10,12,23};
//        System.out.println();
////        System.out.println(secondLarge(nums));
//        threeLarge(nums);

//        int [] nums = {1,0,1,0,1,1,1};
//
//        System.out.println( consitiveOnce(nums));




    }

//
//    public static int fibonacci(int n){
//
//        if(n<=1){
//            return n;
//        }
//        return (fibonacci(n-1)+fibonacci(n-2));
//    }

//    public static void palindrome(String input){
//        int  length = input.length();
//        boolean ispalindrome = true;///amma
//
//        for(int i = 0; i<length/2;i++){
//            if(input.charAt(i)!=input.charAt(length-1-i)){
//                ispalindrome = false;
//                break;
//            }
//        }
//        if(ispalindrome){
//            System.out.println("yes it is palindrome");
//        }else {
//            System.out.println("no it is not palindrome");
//        }
//    }
//   public static boolean armstrong(int num){
//       int origanal = num;
//       int sum =0;
//
//       while(num> 0){
//           int f = num % 10;
//           int pow = f*f*f;
//           sum +=pow;
//           num = num/10;
//       }
//       if(sum == origanal){
//           return true;
//       }else {
//           return false;
//       }
//   }

//    public static int suar(int n){
//        int product= 1;
//        int sum = 0;
//        while(n>0){/// 2  3  4
//            int lastDigit = n%10;
//            sum = sum+lastDigit;
//            product = product*lastDigit;
//            n = n/10;
//        }
//        int result = product-sum;
//        return result;
//    }



//    public  static void factor(int num){
//
//       for(int i =1; i< num; i++){
//           if(num % i == 0){
//               System.out.println(i);
//           }
//       }
//    }


//    public static int sumNumber(){
//        int sum =0;
//        Scanner sc =new Scanner(System.in);
//        int num ;
//        while (true){
//            num = sc.nextInt();
//            if(num == 0){
//                break;
//            }
//            sum+= num;
//        }
//        return sum;
//    }


//    public static int largestNum(){
//
//        Scanner sc = new Scanner(System.in);
//        int num;
//        int max = Integer.MIN_VALUE;
//        while(true){
//            num = sc.nextInt();
//            if(num == 0){
//                break;
//            }
//            if(num>max){
//                max=num;
//            }
//        }
//        return max;
//    }
//    public static int factorial(int num){
//        int fact=1;
//        for(int i = 1;i<=num;i++){
//            fact = i*fact;
//        }
//        return fact;
//    }

//    public static float sumAverage(int num){
//        int sum = 0;
//        float avg =0;
//        for(int i =0 ; i<=num;i++){
//           sum +=i+sum;
//        }
//        avg = sum/num;
//
//return avg;
//    }

//    public static int secondLarge( int [] nums){
//
//        int largeNum = 0;
//        int secLargeNum =0;
//
//
//        for(int number : nums){
//            if(number > largeNum){
//                secLargeNum = largeNum;
//                largeNum=number;
//
//            }if(secLargeNum < largeNum && largeNum != secLargeNum){
//                secLargeNum=secLargeNum;
//            }
//        }
//
//        return secLargeNum;
//    }

//
//    public static  void   threeLarge(int [] nums ){
//
//        Arrays.sort(nums);
//        int n = nums.length;
//        System.out.println(nums[n-1]*nums[n-2]*nums[n-3] );
//
//    }

//    public static  int consitiveOnce(int nums []){
//
//        int count =0;
//        for(int i  = 0; i < nums.length; i++){
//            if(nums[i]==1){
//                count++;
//            }
//        }
//        return count;
//
//    }

}
