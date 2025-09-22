public class Animal{
    private String especie;
    private String nombre;
    private String comida;
    public String getEspecie() {
        return especie;
    }
    public String getNombre() {
        return nombre;
    }
    public String getComida(){
        return comida;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setComida(String comida){
        this.comida = comida;
    }
    public String caminar(){
        return "caminando";
    }
    public String comida(){
        return comida;
    }
}