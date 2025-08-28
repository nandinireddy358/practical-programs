public class Maxmin {
    public static void main(String[] args) {
        int[] arr={10,20,50,78,48,90};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]>min){
            min=arr[i];
          }
          if(arr[i]<max){
            max=arr[i];
          }
         
        }
         System.out.println("maximum is"+max);
          System.out.println("minimum is"+min);
    }
}

