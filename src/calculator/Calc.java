package calculator;

import java.util.Scanner;

public class Calc {

    public int sum(int a, int b) {
        if (a < 1) {
            throw new IllegalArgumentException( String.format("Argument a can`t be 0 or less than zero. Current value = %s", a) );
        } else if (b < 1) {
            throw new IllegalArgumentException(String.format("Argument b can`t be 0 or less than zero. Current value = %s", b));
        }

        return a + b;
    }

    public static void main(String[] args) {
        Calc calcRef = new Calc();

        System.out.println("before Ex");


        Scanner scanner = new Scanner(System.in);
        try {

            int i = scanner.nextInt();

            int sum = calcRef.sum(2, i);


            System.out.println("calc.sum(2, i) = " + sum);

            //throw new ArithmeticException();

        } catch (IllegalArgumentException ex) {
            System.out.println("In catch IllegalArgumentException");
        } catch (NullPointerException ex) {
            System.out.println("In catch NullPointerException");
            ex.printStackTrace();
        } finally {
            System.out.println("FINALLY");
            scanner.close();
            System.out.println("scanner closed");
        }

        System.out.println("After Ex");
    }
}
