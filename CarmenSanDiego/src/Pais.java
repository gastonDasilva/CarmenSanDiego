import java.util.ArrayList;
import java.util.List;


public class Pais {
	String nombrePais;
	List <String> caracteristicasDelPais = new ArrayList<String>();
	List <Pais> paisConexiones = new ArrayList<Pais>();
	ArrayList<LugarDeInteres> lugaresDeInteres= new ArrayList<LugarDeInteres>(); // limite son 3 lugares sin repetidos

	public void setNombrePais(String n){
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
		// recorre los lugares de interes y los procesa con el fin de encontrar al villano
		for (int i= 0;i != lugaresDeInteres.size(); i++ ){
			if(lugaresDeInteres.get(i).hayCuidador()){
			    lugaresDeInteres.get(i).procesarCuidador();
			 }
			lugaresDeInteres.get(i).procesarOcupante();
		}
		
	}

}