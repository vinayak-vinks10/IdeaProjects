import java.util.Scanner;
public class PRATICESET_Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String letter=new String();
        letter="Dear <name>,thanks a lot.";
        String name=sc.nextLine();
        System.out.println();
        System.out.println(letter.replace("<name>",name));
    }
}
