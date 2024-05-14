package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wallet.Cuenta;
import wallet.Transaccion;


class TransaccionTest {

	@Test
	 public void testTransaccionExitosa() {
	     Cuenta cuentaOrigen = new Cuenta(null, 0, 0, 0);
	     cuentaOrigen.depositar(500);
	     Cuenta cuentaDestino = new Cuenta(null, 0, 0, 0);
	Transaccion transaccion = new Transaccion();
	     assertEquals(true, transaccion.ejecutar(), "La transacción debe ejecutarse con éxito");
	     assertEquals(400, cuentaOrigen.getSaldo(), "El saldo de la cuenta origen debe ser 400 después de la transacción");
	     assertEquals(100, cuentaDestino.getSaldo(), "El saldo de la cuenta destino debe ser 100 después de la transacción");
}

}
