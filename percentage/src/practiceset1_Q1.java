import java.util.Scanner;

public class practiceset1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum of three numbers: ");
        System.out.println("num 1=");
        float num1= sc.nextInt();
        System.out.println("num2=");
        float num2= sc.nextInt();
        System.out.println("num3");
        float num3= sc.nextInt();
        float sum= num1+num2+num3;
        System.out.println("The sum of three numbers is ="+sum);

    }


}
