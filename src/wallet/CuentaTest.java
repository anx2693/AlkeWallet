package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wallet.Cuenta;


class CuentaTest {
	
	Cuenta cuenta;

	@Test
    public void testDepositar() {
        Cuenta cuenta = new Cuenta(null, 0, 0, 0);
        cuenta.depositar(100);
        assertEquals(100, cuenta.getSaldo(), "El saldo después de depositar debe ser 100");
    }

    @Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta(null, 0, 0, 0);
        cuenta.depositar(200);
        cuenta.retirar(100);
        assertEquals(100, cuenta.getSaldo(), "El saldo después de retirar debe ser 100");
    }
}
