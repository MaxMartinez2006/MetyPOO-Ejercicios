import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float F,C;
        System.out.println("Digite el valor de los Celsius:");
        C = sc.nextFloat();

        F = ((C*9/5)+32);
        System.out.println("El valor de los Fahrenheit es: "+F);
    }

}