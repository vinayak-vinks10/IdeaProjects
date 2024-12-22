import java.util.Scanner;
public class EXTRA_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("choose an operator(+,-,/,*,%)");
        String opt=sc.next();
        switch (opt){
            case "+":
            System.out.println(num1+num2);
            break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;

        }

    }
}
