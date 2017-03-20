import java.util.ArrayList;
import java.util.List;

public class Villano {
	String nombre;
	String sexo;
    List <String> seņasParticulares = new ArrayList<String>();
    List<String> hobbies = new ArrayList<String>();

   
    public void setVillano (String n, String s ){
    	this.nombre = n;
    	this.sexo = s;
    }
    
    public void agregarSeņa(String seņa){
    	
    	seņasParticulares.add(seņa);
    }
    
    public void agregarHobbie (String h){
    	
    	hobbies.add(h);
    }
}