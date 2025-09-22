public class Persona{
    private String nombre;
    private int edad;
    private String rol;
    private String genero;
    public void Persona(String nombre, int edad, String rol, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
        this.genero = genero;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getRol(){
        return this.rol;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}