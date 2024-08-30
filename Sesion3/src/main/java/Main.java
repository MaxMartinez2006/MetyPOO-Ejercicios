import modelos.Curso;
import modelos.Profesor;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso( "Metodologia y POO");
        Profesor dimitrick = new Profesor("Dimitrick Navarro");
        dimitrick.enseñar(curso);
        Departamento fia = new Departamento();




    }
}
