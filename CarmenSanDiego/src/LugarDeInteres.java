
 public abstract class  LugarDeInteres {
	 // Solo pueden ser Club,Embajada,Banco y Biblioteca 
	    Boolean informante = false ; //Solo puede haber una persona en el lugar, es decir que solo un booleano puede ser true
		Boolean ocupante = false  ;
		Boolean cuidador = false ;
		Villano vil = null ;// indica si el villano esta en el lugar de interes  
		
		
		
		public Boolean hayInformante() {
			return this.informante;
		}

		public Boolean hayOcupante() {
			return this.ocupante;
		}

		public Boolean hayCuidador() {
			return this.cuidador;
		}

		public void setearVillanoEnLugar(Villano v){
			this.vil = v;
		}
		public void setearInformante() {
			if (this.hayCuidador() || this.hayOcupante()){
				System.out.println("Ya hay un individuo en el lugar" );
			}else{
				  this.informante = true;
				 }
		}

		public void setearOcupante() {
			if (this.hayCuidador() || this.hayInformante()){
				System.out.println("Ya hay un individuo en el lugar" );
			}else{
				  this.ocupante = true;
			     }
		}

		public void setearCuidador() {
			if (this.hayInformante() || this.hayOcupante()){
				System.out.println("Ya hay un individuo en el lugar" );
			}else{
			      this.cuidador = true;
			     }
			
		}
		
		public void procesarCuidador() {
			if (this.hayCuidador()){
				System.out.println("CUIDADOR: Te equivocaste de pais bato, mejor volve por donde viniste" );
			}
		}
		
		public void procesarOcupante (){
			// si el villano es en el lugar se lo detiene sino se le advierte al detective que el villano esta en la
			// ciudad
			
			if(this.hayOcupante()){
				if (vil== null ){
					System.out.println("CUIDADO DETECTIVE! el villano esta en la ciudad" );
				    }else{
				          System.out.println("Alto!!"+vil.nombre+" Queda Arrestado" );
			             }
			}
		}
		
		public abstract void procesarInformante();
		// depende de cada lugar la informacion que da 
		
		
		
 }