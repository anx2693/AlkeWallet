package wallet;

public class Cuenta {

	//atributos
	protected  int numeroCuenta;
	private double saldo;

	// Constructor
	public Cuenta(int numCuenta, double saldoInicial) {
		this.numeroCuenta = numCuenta;
		this.saldo = saldoInicial;
	}

	// Método para depositar dinero
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			var cantidadFinal = saldo + cantidad;
			System.out.println("Depósito exitoso. Saldo anteriro: $" + saldo + " Su nuevo saldo es de: $" + cantidadFinal);

			saldo = cantidadFinal;
		} else
			System.out.println("ERROR, la cantidad debe ser mayor que cero.");

	}

	// Método para retirar dinero
	public void retirar(double monto) {
		if (monto > 0 && monto <= saldo) {
			var montoFinal = saldo - monto;
			System.out.println("Retiro exitoso. Saldo anterior: $" + saldo + " Su nuevo saldo es de: $" + montoFinal);

			saldo = montoFinal;
		} else
			System.out.println("ERROR, monto inválido o saldo insuficiente.");
	}

	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}

}
