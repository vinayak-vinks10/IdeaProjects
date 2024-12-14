import java.util.Scanner;

public class practiceset1_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Calculating the CGPA:");
        System.out.println("Enter the marks of First subject= ");
        float sub1= sc.nextInt();
        System.out.println("Enter the marks of Second subject= ");
        float sub2= sc.nextInt();
        System.out.println("Enter the marks of Third subject= ");
        float sub3= sc.nextInt();
        float sum=sub1+sub2+sub3;
        double cgpa=(sum/30)*9.5;
        System.out.println("the sum of three subjects= "+sum);
        System.out.println("CGPA="+cgpa);


    }
}
