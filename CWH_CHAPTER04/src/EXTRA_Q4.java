import java.util.Scanner;
public class EXTRA_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        switch (num%2){
            case 1:
                System.out.println("odd number");
                break;
            case 0:
                System.out.println("even number");
                break;
            default:
                System.out.println("invalid choice");


        }
    }

}
