import java.util.ArrayList;
import java.util.List;

public class Villano {
	String nombre;
	String sexo;
    List <String> se�asParticulares = new ArrayList<String>();
    List<String> hobbies = new ArrayList<String>();

   
    public void setVillano (String n, String s ){
    	this.nombre = n;
    	this.sexo = s;
    }
    
    public void agregarSe�a(String se�a){
    	
    	se�asParticulares.add(se�a);
    }
    
    public void agregarHobbie (String h){
    	
    	hobbies.add(h);
    }
}