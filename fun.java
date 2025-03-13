import java.util.Scanner;

public class fun{
  public static void main(String[] args) {
//   add();
//    fact();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value");
    int n = sc.nextInt();
    System.out.println("enter r value");
    int r = sc.nextInt();
    bicoefficient(n,r);
  }
  public static void add(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your 1st number");
    int a = sc.nextInt();
    System.out.println("enter your 2nd number");
    int b  = sc.nextInt();
    int sum = a+b;
    System.out.println("your sum is :-" +" "+ sum);

  }

  public static int fact(int n){
    int fac = 1;
    for(int i = n ; i>=1;i--){
      fac = fac*i;
    }
    return fac;
  }

  public static  int bicoefficient(int n , int r){
    int fact_n = fact(n);
    int fact_r = fact(r);
    int fact_nmr = fact(n-r);
    int binres = fact_n/(fact_r*fact_nmr);
    System.out.println(binres);
    return binres;
  }

}
