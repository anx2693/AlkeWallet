package wallet;

class Cuenta extends Usuario{

	//atributo
    private double saldo;
    private int numCuenta;
    private Usuario nombre;
    

    // Constructor
    public Cuenta(String nombre, double rut, double saldo, int numCuenta ) {
    	super(nombre, rut);
        this.saldo = saldo;
        this.numCuenta = numCuenta;
       
    }

    // Getter para el atributo saldo
    public double getSaldo() {
        return saldo;
    }
    
    public double getnumCuenta() {
        return numCuenta;
    }
 // Método para mostrar los datos de la cuenta
 		public void mostrarDatos() {
 			System.out.println("Número de cuenta: " + numCuenta);
 			System.out.println("Titular: " + nombre );
 			System.out.println("Saldo: $" + saldo);
 		}
 	// Método para depositar dinero
 			public void depositar(double monto) {
 				if (monto > 0) {
 					var montoFinal = saldo + monto;
 					System.out.println("Depósito exitoso. Saldo anteriro: $" + saldo + " Su nuevo saldo es de: $" + montoFinal);

 					saldo = montoFinal;
 				} else
 					System.out.println("ERROR, el monto debe ser mayor que cero.");
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
}
