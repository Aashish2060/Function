import java.util.*;
public class Main {


    public static void hello(){
        System.out.println("Hello, Here we are using function.");
    }
    public static void summation(int a , int b){
      int sum=a+b;
      System.out.println(sum);
    }
    public static int  sub(int a , int b){

       return a-b;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no:");
        int x= sc.nextInt();
        int y=sc.nextInt();
        summation(x,y);

        System.out.println("Work one");
       hello();//Function call
        System.out.println("Work two");
         int z=sub(x,y);
        System.out.println(z);
    }
}