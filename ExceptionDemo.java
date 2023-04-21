import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
        //Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x1 = (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
        double x2 = (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
        System.out.println("X1 : "+x1);
        System.out.println("X2 : "+x2);
        } catch(NumberFormatException ex){
            System.out.println("Please input data in number format only.");
        } catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
}
}
