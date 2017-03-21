
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LugarDeInteresTest extends TestCase{ 
	Embajada em;
	Banco ba;
	Club cl;
	Villano juancho;
	
   @Before
	    public void setUp() {
	   em = new Embajada();
	   //em.crearEmbajada();
	   ba = new Banco();
	   cl = new Club ();
	    juancho = new Villano();
	    }

	@Test
	public void testRecorrerLugaresDeInteres() {
		juancho = new Villano();
		juancho.setVillano("JUancho Sierra", "Masculino ");
	    juancho.agregarHobbie("jugar al futbol");
		juancho.agregarSeña("pelo rojo");
	    juancho.agregarSeña("piel morena");
		juancho.agregarSeña("ojos azules");
		em.setearOcupante();
		em.setearVillanoEnLugar(juancho);
		ba.setearOcupante();
		cl.setearOcupante();
		em.procesarCuidador();
		assertFalse(em.hayCuidador());
		assertFalse(em.hayInformante());
		assertTrue (em.hayOcupante());
		em.procesarOcupante();
		ba.procesarOcupante();
		cl.procesarOcupante();
	}
	
	

}
