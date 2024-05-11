package wallet;

class Transaccion extends Cuenta {
	
	
	private double monto;
	
	

	public Transaccion(String nombre, double rut, double saldo,int numCuenta, double limiteCredito, double monto) {
		super(nombre, rut, saldo, numCuenta);
		this.monto = monto;
		
		// TODO Auto-generated constructor stub
	}

	

   
}
