import java.util.ArrayList;
import java.util.List;

public class Villano {
	String nombre;
	String sexo;
    List <String> señasParticulares = new ArrayList<String>();
    List<String> hobbies = new ArrayList<String>();

   
    public void setVillano (String n, String s ){
    	this.nombre = n;
    	this.sexo = s;
    }
    
    public void agregarSeña(String seña){
    	
    	señasParticulares.add(seña);
    }
    
    public void agregarHobbie (String h){
    	
    	hobbies.add(h);
    }
}