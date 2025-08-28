import java.util.*;
public class Searching {
    public static void main(String[] args) {
        int a[]={2,3,4,15,27,18,19};
        Scanner s=new Scanner(System.in);
        System.out.println("enter the key");
        int key = s.nextInt();
        
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("index is"+i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
       
}

