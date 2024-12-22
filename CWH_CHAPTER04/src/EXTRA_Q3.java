import java.util.Scanner;
public class EXTRA_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your alphabet :");
        String alp=sc.next();
        switch (alp){
            case "a":
                System.out.println("vowel");
                break;
                case "e":
                System.out.println("vowel");
                break;
                case "i":
                System.out.println("vowel");
                break;
                case "o":
                System.out.println("vowel");
                break;
                case "u":
                System.out.println("vowel");
                break;
                default:
                System.out.println("consonant");
                break;
        }
    }
}
