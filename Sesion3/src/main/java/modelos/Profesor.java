package modelos;

public class Profesor {
    private String nombre;

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enseñar( Curso curso ) {
        System.out.println(nombre + "esta enseniando"
                + curso.getNombre());

    }



}
