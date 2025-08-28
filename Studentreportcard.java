import java.util.*;
public class Studentreportcard {
    public static void main(String[] args){
        int sum=0;
        int highestTotal=0;
        int passCount=0;
        int failCount=0;
        String topperName="";
        Scanner sc=new Scanner(System.in);
        System.out.println("how many students do you want to enter:");
        int numstudents=sc.nextInt();
        for(int i=0;i<numstudents;i++){
            System.out.println("name of the student:");
              sc.nextLine();
            String name=sc.nextLine();
            System.out.println("enter subject 1 marks:");
            int subject1=sc.nextInt();
            System.out.println("enter subject2 marks:");
            int subject2=sc.nextInt();
            System.out.println("enter subject 3 marks:");
            int subject3=sc.nextInt();
            int total = subject1 + subject2 + subject3;
            sum+=total;
              if(total>highestTotal){
                highestTotal=total;
                topperName=name;
              }
              double avg = (double) total / 3;
              String result = (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) ? "Pass" : "Fail";
              if(result.equals("Pass")){
                passCount++;
              }else{
                failCount++;
              }
                 System.out.println("Student Name: " + name);
             System.out.println("Total Marks: " + total);
              System.out.println("Average: " + avg);
              System.out.println("Result: " + result);
        }
        double classAvg = (double) sum / numstudents;

              System.out.println("no of passed students:"+passCount);
              System.out.println("no of failed students:"+failCount);
        System.out.println("topper is:"+topperName);
              System.out.println("total marks:"+highestTotal);
              System.out.println("Class Average: " + classAvg);
    }
        
 }

