import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, r;
        System.out.println("Ingrese el valor del radio: ");
        r = sc.nextDouble();

        a = Math.PI * (r * r);

        System.out.println("El area del radio es: " + a);
    }
}