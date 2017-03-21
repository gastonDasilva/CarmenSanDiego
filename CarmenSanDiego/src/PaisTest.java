import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaisTest {
	Pais argentina;
	Embajada em;
	Banco ba;
	Club cl;
	Villano juancho;
	
	  @Before
	    public void setUp() {
		  juancho = new Villano();
		  juancho.setVillano("JUancho Sierra", "Masculino ");
		  juancho.agregarHobbie("jugar al futbol");
		  juancho.agregarSeña("pelo rojo");
		  juancho.agregarSeña("piel morena");
		  juancho.agregarSeña("ojos azules");
		  em= new Embajada();
		  ba= new Banco();
		  cl = new Club();
		  em.setearOcupante();
		  ba.setearOcupante();
		  cl.setearOcupante();
		  em.setearVillanoEnLugar(juancho);
	   argentina = new Pais ();
	   argentina.setNombrePais("Argentina");
	   argentina.agregarCaracteristica("bandera celeste y blanca");
	   argentina.agregarCaracteristica("Moneda Peso");
	   argentina.agregarCaracteristica("Casa de gobierno rosada");
	   argentina.agregarLugarDeInteres(em);
	   argentina.agregarLugarDeInteres(ba);
	   argentina.agregarLugarDeInteres(cl);
	   argentina.agregarPaisConexion(null);
	   
	    }
	@Test
	public void testRecorrerLugarDeInteres() {
		assertEquals(3, argentina.caracteristicasDelPais.size());
		assertEquals(3, argentina.lugaresDeInteres.size());
		assertTrue(em.hayOcupante());

		argentina.recorrerLugaresDeInteres();
		
	}

}
