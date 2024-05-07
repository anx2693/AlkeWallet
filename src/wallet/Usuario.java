package wallet;


public class Usuario {

	// atributos 
	protected long identificador;
	protected String nombre;
	protected Cuenta cuenta;
	
	
	//contructor
	public Usuario(long ID, String nombreUsuario) {
        this.identificador = ID;
        this.nombre = nombreUsuario;
	
}
	
	// geter y setter
	
	// Método para crear una cuenta
    public void crearCuenta(int numCuenta, double saldoInicial) {
        cuenta = new Cuenta(numCuenta, saldoInicial);
    }
    
 // Método para crear deposito
    public void deposito(double cantidad) {
        cuenta.depositar(cantidad);
    }
 // Método para retirar
    public void retirar(double saldoInicial) {
        cuenta.retirar(saldoInicial);
    }
 
}
