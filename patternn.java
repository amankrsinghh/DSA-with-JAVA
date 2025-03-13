import java.util.Scanner;

public class patternn {
    public static void main(String[] args) {
      // to check the given number is prime or not
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check whether the number is prime or not");
        int a = sc.nextInt();
        for (int i = 2 ;i<a;i++){
            if(a%i==0)
            {
                System.out.println("its not a prime number");
                break;
            }
            else{
                System.out.println("its a prime number");
                break;

        //Another method
         Scanner n = new Scanner(System.in);
        System.out.println("enter any number ");
        int a = n.nextInt();
       int count = 0;
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a+" is a prime number");
        }
        else{
            System.out.println(a+" is not a prime number");
        }

        //factorial of any number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int a = sc.nextInt();
        int fact=1;
        for ( int i = 1 ; i<=a; i++){
           fact = fact*i;

        }
        System.out.println(fact);

        //square pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //right triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

   Scanner sc = new Scanner(System.in);
        System.out.println("enter the age :");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("press the button");
      int num = sc.nextInt();
      switch (num){
          case 1 :
              System.out.println("hello");
          break;
          case 2 :
              System.out.println("namaste");
              break;
          case 3 :
              System.out.println("bonjour");
              break;
      }
        for(int i = 1 ; i<=20;i++){
            System.out.println("hello world");
        }
        int i = 1;
        while(i<=20){
            System.out.println("hello world");
            i++;
        }

        Scanner sc = new Scanner(System.in );
        System.out.println(" enter the two number for the calculation ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("which operation do you want to perform ");
        String s = sc.next();
switch (s){
    case "a" :
        System.out.println(x+y);
        break;
    case "s" :
        System.out.println(x-y);
        break;
    case "m" :
        System.out.println(x*y);
        break;
    case "d" :
        System.out.println(x/y);
        break;
    default :{
        System.out.println("invalid operation ");
    }
}
int n = 1;
while(n<=10){
    System.out.println(n);
    n++;
}
        int n=1;
        do{
            System.out.println(n);
            n++;
        }
    while(n<=10);

        //print the first sum of natural number;

        int sum = 0;
        for(int i = 1; i<=10;i++){
            sum = sum+i;
        }
        System.out.println(sum);x

        int i = 0;
        int sum = 0;

        while(i<=10){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);

        Scanner sc = new Scanner(System.in );
        System.out.println("enter the number of which you want the table of ");
        int n = sc.nextInt();
        int mul;
        for(int i = 1; i<=10;i++){
            mul= n*i;
            System.out.println(n+"x"+i+"="+mul);
        }


                                           ////PATTERN PROBLEM//////
        //solid square pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row ");
        int a = sc.nextInt();
        System.out.println("enter the number of column");
        int b = sc.nextInt();
        for(int i = 1; i<=a;i++){
            for(int j = 1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//hollow square pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Row");
        int a = sc.nextInt();
        System.out.println("enter the column");
        int b = sc.nextInt();
        for (int i = 1; i<=a; i++){
            for(int j = 1;j<=b;j++){
                if(i==1||i==a||j==1||j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

        //right traingle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row ");
        int n = sc.nextInt();
        for( int i = 1 ; i<= n;i++){
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Opposite right triangle
Scanner sc = new Scanner (System.in);
        System.out.println("enter the row ");
        int n = sc.nextInt();
        for( int i = n; i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //another method
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            for(int j = i;j <=a;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
// mirror triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++ ){
            for(int j = 1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //inverted half triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<i;j++){
                System.out.print(" ");
            }

            for(int j = i; j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //numbering triangle triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        //numbering triangle pattern opposite
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        //floyd triangle
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int number=1;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println(" ");
        }
Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                if( (i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println(" ");
        }*/


Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row :");
        int x = sc.nextInt();
        for (int i = 1;i<=x;i++){
            for(int s =x ; s>i;s--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
            

            
        }





    }
}