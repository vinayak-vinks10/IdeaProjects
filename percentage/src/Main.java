import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("calculating the percentage of:");
        String name = scanner.nextLine();
System.out.println("Maths:");
int sub1=scanner.nextInt();
System.out.println("English:");
int sub2=scanner.nextInt();
System.out.println("Hindi:");
int sub3=scanner.nextInt();
System.out.println("Social science:");
int sub4=scanner.nextInt();
System.out.println("Computer:");
int sub5=scanner.nextInt();
int sum=sub1+sub2+sub3+sub4+sub5;
System.out.println("the total marks obtained:"+sum);
double percentage=(sum/5);
System.out.println("The percentage obtained="+percentage);
scanner.close();
    }
}