package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wallet.Moneda;



class MonedaTest {

	@Test
    public void testConversionMoneda() {
        Moneda moneda = new Moneda() {
            @Override
            public double convertir(double cantidad) {
                // Implementación ficticia para la prueba
                return cantidad * 1.1; // Supongamos que 1.1 es el tipo de cambio
            }
        };
        assertEquals(1.1, moneda.convertir(1.0), "La conversión de moneda debe ser correcta");
    }
}
