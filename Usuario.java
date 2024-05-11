package wallet;

class Usuario  {

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

    // Getter para el atributo saldo
    public double getRut() {
        return rut;
    }
}

