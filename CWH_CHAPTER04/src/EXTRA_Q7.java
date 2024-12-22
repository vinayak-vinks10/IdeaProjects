import java.util.Scanner;
public class EXTRA_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you grade(A,B,C,D,F):");
        Character grade=sc.next().charAt(0);
        System.out.println("GRADE:"+grade);
        char g=Character.toUpperCase(grade);
        switch (g){
            case 'A':
                System.out.println("REMARK:"+"EXCELLENT");
                break;
                case 'B':
                System.out.println("REMARK:"+"VERY GOOD");
                break;
                case 'C':
                System.out.println("REMARK:"+"GOOD");
                break;
                case 'D':
                System.out.println("REMARK:"+"AVERAGE");
                break;
                case 'F':
                System.out.println("REMARK:"+"FAIL");
                break;
        }
    }

}
