import java.util.Scanner;
public class EXTRA_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select your gender(M/F) :");
        String gen=sc.nextLine();
        switch (gen){
            case "M" :
                System.out.println("MALE");
                break;
            case "F":
                System.out.println("FEMALE");
                break;
            case "m" :
                System.out.println("MALE");
                break;
            case "f":
                System.out.println("FEMALE");
                break;
        }

    }
}
