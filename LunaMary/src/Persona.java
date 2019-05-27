public class Persona {


    String nombre;
    String edad;
    String sexo;

    public Persona(String nombre,
                   String edad,
                   String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(sexo);
    }

}
