import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     System.out.println("how many numbers do you want to enter");
    int n=s.nextInt();
     System.out.println("enter first number");
     int n1=s.nextInt();
     System.out.println("enter second number");
     
     int n2=s.nextInt();
     System.out.println("the number are"+n1+""+n2);
     for(int i=2;i<n;i++){
     int next=0;
     next=n1+n2;
     System.out.println("the next number is"+next);
     n1=n2;
     n2=next;
     }
    }
}
