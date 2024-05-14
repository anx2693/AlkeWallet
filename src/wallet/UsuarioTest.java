package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import wallet.Usuario;



class UsuarioTest {

	 Usuario usuario;
	  /*
	   * @BeforeAll: Esta anotación se utiliza para marcar un método que se ejecuta una
	   * sola vez antes de todas las pruebas en una clase. El método anotado
	   * debe ser estático.
	  */
	      @BeforeAll
	      static void setupAll() {
	          System.out.println("Iniciando los tests.");
	      }
	  /*
	   * @BeforeEach: Esta anotación se utiliza para marcar un método que se ejecuta
	   * antes de cada prueba. Puedes usarlo para realizar configuraciones
	   * o inicializaciones necesarias antes de cada prueba.
	  */
	      @BeforeEach
	      void setup() {
	          usuario = new Usuario("ana", 18417493-6);
	          System.out.println("Iniciando un test.");
	      }
	      @Test
	      void testGetNombre() {
	          assertEquals("ana", usuario.getNombre(), "El nombre del cliente debe ser ana.");
	      }
	  /*
	   * @Test: Esta anotación se utiliza para marcar un método como una prueba unitaria.
	   * Los métodos anotados con @Test deben ser públicos y no devolver ningún valor.
	   */
	      @Test
	      void testGetEmail() {
	          assertEquals(18417493-6 , usuario.getRut(), "El rut del cliente debe ser 18417493-6");
	      }
	  /*
	   * @AfterEach: Esta anotación se utiliza para marcar un método que se ejecuta
	   * después de cada prueba. Puedes usarlo para limpiar recursos o realizar
	   * acciones posteriores a cada prueba.
	  */
	      @AfterEach
	      void tearDown() {
	          System.out.println("Finalizando un test.");
	      }
	  /*
	   *@AfterAll: Esta anotación se utiliza para marcar un método que se ejecuta una sola vez
	   *después de todas las pruebas en una clase. El método anotado debe ser estático.
	   */
	      @AfterAll
	      static void tearDownAll() {
	          System.out.println("Limpiando recursos después de todos los tests.");
	      }
	  }

