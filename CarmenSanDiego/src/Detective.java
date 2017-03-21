import java.util.ArrayList;

public class Detective {
	ArrayList <Pais> mapamundi = new ArrayList<Pais>();
	ArrayList <Villano> villanos = new ArrayList<Villano>();
	ArrayList <Caso> casos = new ArrayList<Caso>();
	
	
	public void resolverCaso(){
		casos.get(1).iniciarCaso();
	}
}
