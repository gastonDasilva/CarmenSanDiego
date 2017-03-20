import java.util.ArrayList;
import java.util.List;


public class Pais {
	String nombrePais;
	List <String> caracteristicasDelPais = new ArrayList<String>();
	List <Pais> paisConexiones = new ArrayList<Pais>();
	ArrayList<LugarDeInteres> lugaresDeInteres= new ArrayList<LugarDeInteres>(); // limite son 3 lugares sin repetidos

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
		if (lugaresDeInteres.contains(l)){
			System.out.println("Error el lugar de interes"+ l+ "ya esta en la lista" );
		} 
		else
		{
		lugaresDeInteres.add(l);
		
	    }
	}
	
	public void recorrerLugaresDeInteres (){
		for (int i= 0;i != lugaresDeInteres.size(); i++ ){
			 lugaresDeInteres.get(i).procesarOcupante();
		}
	}
}