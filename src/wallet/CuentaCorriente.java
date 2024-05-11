package wallet;


class CuentaCorriente extends Cuenta {
private double limiteCredito;

// Constructor
public CuentaCorriente(String nombre, double rut, double saldo, int numCuenta, double limiteCredito) {
	// Llama al constructor de la superclase (CON SUPER)
	 super(nombre, rut, saldo, numCuenta); 
   this.limiteCredito = limiteCredito;
}

// Getter específico para el atributo limiteCredito
public double getLimiteCredito() {
   return limiteCredito;
}
}
