import java.util.*;
public class cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first operand=");
        int a =in.nextInt();
        System.out.print("enter second operand=");
        int b = in.nextInt();
        System.out.print("enter operator=");
        char c = in.next().charAt(0);

        switch(c){
            case '+':
            System.out.println("addition:"+(a+b));
            break;
            case '-':
            System.out.println("subtraction:"+(a-b));
            break;
            case '*':
            System.out.println("multiplication:"+(a*b));
            break;
            case '/':
                switch (b) {
                    case 0:
                    System.out.println("can not divide");
                        break;
                
                    default:
                    System.out.println("division:"+(a/b));
                        break;
                }
        }
        

    }
}
