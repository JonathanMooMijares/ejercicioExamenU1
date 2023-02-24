import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner operacion = new Scanner (System.in);

        System.out.println (" Ingrese dos números enteros");
        int num1= operacion.nextInt ();
        int num2= operacion.nextInt();

        int diferencia= num1-num2;
        System.out.println (" La diferencia entre los dos números es:" +diferencia);

        int divisor= (num1/diferencia);
        System.out.println ("El número es: " +divisor);
        int divisor2= (num2/diferencia);
        System.out.println ("El número es: " +divisor2);

    }
}