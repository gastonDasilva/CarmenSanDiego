import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Pais {
	String nombrePais;
	List <String> caracteristicasDelPais = new ArrayList<String>();
	List <Pais> paisConexiones = new ArrayList<Pais>();
	Set <LugarDeInteres> lugaresDeInteres= new HashSet<LugarDeInteres>(); // limite son 3 lugares sin repetidos

	public void setNombrePias(String n){
		this.nombrePais = n;
	}
	
	public void agregarCaracteristica(String c){
		caracteristicasDelPais.add(c);
	}
	
	public void agregarPaisConexion(Pais p){
		paisConexiones.add(p);
	}
	
	public void agregarLugarDeInteres(LugarDeInteres l){
		lugaresDeInteres.add(l);
	}
	
	public void recorrerLugaresDeInteres (){
		for (int i= 0;i != lugaresDeInteres.size(); i++ ){
			lugaresDeInteres.
		}
	}
}