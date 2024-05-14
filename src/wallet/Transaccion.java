package wallet;



public class Transaccion extends Cuenta {
	
	
	private double monto;
	private Cuenta origen;
	 private Cuenta destino;
	 private Cuenta numCuenta;
	

	public Transaccion(String nombre,int numCuenta, double monto, Cuenta origen, Cuenta destino) {
		super(nombre, monto, monto, numCuenta);
		this.monto = monto;
		this.origen = origen;
	     this.destino = destino;

	}

	 public boolean ejecutar() {
	     if (origen.getSaldo() >= monto) {
	         origen.retirar(monto);
	         destino.depositar(monto);
	         return true;
	     }
	     return false;
	 }

   
}
