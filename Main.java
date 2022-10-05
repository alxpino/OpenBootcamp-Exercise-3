public class Main{
    public static void main(String[] args) {
        Persona usuario1 = new Persona();
        usuario1.setEdad(20);
        usuario1.setNombre("Pablo");
        usuario1.setTelefono(91234567);
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }

}
