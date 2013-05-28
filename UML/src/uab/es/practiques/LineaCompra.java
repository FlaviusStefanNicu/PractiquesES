package uab.es.practiques;



/**
 * @uml.dependency   supplier="uab.es.practiques.Carro"
 */
public class LineaCompra {

	/**
	 * @uml.property  name="preuProducte"
	 */
	private float preuProducte;

	/**
	 * Getter of the property <tt>preuProducte</tt>
	 * @return  Returns the preuProducte.
	 * @uml.property  name="preuProducte"
	 */
	public float getPreuProducte() {
		return preuProducte;
	}

	/**
	 * Setter of the property <tt>preuProducte</tt>
	 * @param preuProducte  The preuProducte to set.
	 * @uml.property  name="preuProducte"
	 */
	public void setPreuProducte(float preuProducte) {
		this.preuProducte = preuProducte;
	}

	/**
	 * @uml.property  name="quantitat"
	 */
	private int quantitat;

	/**
	 * Getter of the property <tt>quantitat</tt>
	 * @return  Returns the quantitat.
	 * @uml.property  name="quantitat"
	 */
	public int getQuantitat() {
		return quantitat;
	}

	/**
	 * Setter of the property <tt>quantitat</tt>
	 * @param quantitat  The quantitat to set.
	 * @uml.property  name="quantitat"
	 */
	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

		
		/**
			 * @uml.property  name="producteID"
			 */
			private String producteID;

			/**
			 * Getter of the property <tt>producteID</tt>
			 * @return  Returns the producteID.
			 * @uml.property  name="producteID"
			 */
			public String getProducteID() {
				return producteID;
			}

			/**
			 * Setter of the property <tt>producteID</tt>
			 * @param producteID  The producteID to set.
			 * @uml.property  name="producteID"
			 */
			public void setProducteID(String producteID) {
				this.producteID = producteID;
			}

				
				/**
				 */
				public void afegirProducte(){
				}

					
					/**
					 */
					public void eliminarProducte(){
					}

					/** 
					 * @uml.property name="carro"
					 * @uml.associationEnd inverse="lineaCompra1:uab.es.practiques.Carro"
					 */
					private Carro carro;

					/** 
					 * Getter of the property <tt>carro</tt>
					 * @return  Returns the carro.
					 * @uml.property  name="carro"
					 */
					public Carro getCarro() {
						return carro;
					}

					/** 
					 * Setter of the property <tt>carro</tt>
					 * @param carro  The carro to set.
					 * @uml.property  name="carro"
					 */
					public void setCarro(Carro carro) {
						this.carro = carro;
					}

					/** 
					 * @uml.property name="producte"
					 * @uml.associationEnd aggregation="composite" inverse="lineaCompra:uab.es.practiques.Producte"
					 */
					private Producte producte;

					/** 
					 * Getter of the property <tt>producte</tt>
					 * @return  Returns the producte.
					 * @uml.property  name="producte"
					 */
					public Producte getProducte() {
						return producte;
					}

					/** 
					 * Setter of the property <tt>producte</tt>
					 * @param producte  The producte to set.
					 * @uml.property  name="producte"
					 */
					public void setProducte(Producte producte) {
						this.producte = producte;
					}

	
}
