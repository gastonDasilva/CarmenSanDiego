
 public abstract class  LugarDeInteres {
	 // Solo pueden ser Club,Embajada,Banco y Biblioteca 
	    Boolean informante = false ; 
		Boolean ocupante = false  ;
		Boolean cuidador = false ;
		
		public abstract void procesarOcupante();
		
		public Boolean hayInformante() {
			return this.informante;
		}

		public Boolean hayOcupante() {
			return this.ocupante;
		}

		public Boolean hayCuidador() {
			return this.cuidador;
		}

		public void setearInformante() {
			this.informante = true;
		}

		public void setearOcupante() {
			this.ocupante = true;
			
		}

		public void setearCuidador() {
			this.cuidador = true;
			
		}
 }