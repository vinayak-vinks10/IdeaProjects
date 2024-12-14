import java.util.Scanner;
public class practiceset1_Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("converting kilometers to miles");
        System.out.println("Enter the value in Kilometers=");
        float km= sc.nextFloat();
        double miles=km*0.621371;
        System.out.println("Miles="+miles);
    }
}
