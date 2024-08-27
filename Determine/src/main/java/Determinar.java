import java.util.Scanner;

public class Determinar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;

        for(i = 0; i < 3; i++){
            System.out.print("Ingrese el numero: ");
            n = sc.nextInt();

            if(n % 2 == 0) {
                System.out.println("El numero es par");
            }
            else{
                System.out.println("El numero es impar");
            }
        }
    }
}