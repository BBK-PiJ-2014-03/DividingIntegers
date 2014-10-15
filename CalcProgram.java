import java.util.Scanner;

public class CalcProgram {
    public static void main(String[] args) {
        
        int n;
        int i;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number > ");
        n = keyboard.nextInt();
        System.out.print("Enter another number > ");
        i = keyboard.nextInt();
        
        Calculator userCalc = new Calculator();
        
        userCalc.add(n,i);
        userCalc.subtract(n,i);
        userCalc.multiply(n,i);
        userCalc.divide(n,i);
        userCalc.modulus(n,i);
    }
}