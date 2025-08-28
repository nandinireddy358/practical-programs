import java.util.*;
public class Prime {
    

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        boolean True = false;
        boolean isPrime=True;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=True;
                break;
            }
        }
        if(n<1){
            System.out.println("not prime");
        }
        else{
            System.out.println("is prime");
        }
    } 
}
