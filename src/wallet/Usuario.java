package wallet;

public class Usuario  {

	private String nombre;
    private double rut;
    
    

    // Constructor
    public Usuario(String nombre, double rut ) {
        this.nombre = nombre;
        this.rut = rut;
       
    }

    // Getter para el atributo titular
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
	     this.nombre = nombre;
	 }

    // Getter para el atributo saldo
    public double getRut() {
        return rut;
    }
    public void setRut(double rut) {
	     this.rut = rut;
	 }
}

