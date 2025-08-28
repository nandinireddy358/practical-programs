
public class Arraymarks {
    public static void main(String[] args){
      int sum=0;
      int[] marks={12,34,69,79,40};
      for(int i=0;i<marks.length;i++){
        System.out.println("i+1:"+marks[i]);
        sum=sum+marks[i];
      }
      double avg = (double) sum / marks.length;
      System.out.println("the total sum:"+sum);
      System.out.println("average:"+avg);
    }
}
