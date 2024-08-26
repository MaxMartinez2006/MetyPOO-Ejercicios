import javax.swing.*;
import java.util.Scanner;

public class Estudainte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cif, nombre, apellido, asignatura;
        int corte, corte2, corte3;
        int notaf, i;
            //Datos del estudiante
            System.out.println("Ingrese su cif:");
            cif = sc.next();

            System.out.println("Ingrese el nombre del estudiante:");
            nombre = sc.next();

            System.out.println("Ingrese el apellido del estudiante:");
            apellido = sc.next();

            //Corte 1
            System.out.println("Ingrese el corte 1 del estudiante:");
            corte = sc.nextInt();

            //Corte 2
            System.out.println("Ingrese el corte 2 del estudiante:");
            corte2 = sc.nextInt();

            //Corte 3
            System.out.println("Ingrese el corte 3 del estudiante:");
            corte3 = sc.nextInt();

            //calculo
            notaf = (corte + corte2 + corte3)/3;
            System.out.println("La nota final de " + nombre + " con el cif " + cif + " es:  " + notaf);

            if(notaf >=60 && notaf <=69)
            {
                System.out.println("El estudiante necesita ir a convocatoria");
            }
            else
            {
                System.out.println("El estudiante no necesita convocatoria");
                System.out.println();
            }


    }
}