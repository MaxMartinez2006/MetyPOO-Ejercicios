import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int mayor = 0;
        int i;

        for(i = 0; i < 3; i++) {
            System.out.print("Enter the number to be made: ");
            n = sc.nextInt();
        }

        if(n >= mayor)
        {
            mayor = n;
        }
        System.out.println("El numero con mayor valor es: " + n);
    }
}
