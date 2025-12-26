package ifElse;

import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {
//        First Question //

//        System.out.println("Enter any number");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if(a<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("positive");
//        }
        //Print week name using Switch case //
        System.out.println("enter No. between 1-12 ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You Entered wrong input \n enter number between 1-12");
                break;
        }

    }
}
