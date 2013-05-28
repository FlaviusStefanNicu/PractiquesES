package uab.es.practiques;

import java.util.ArrayList;



public class Cataleg  {

	/**
		 */
		public void AfegirProducte(){
		}

			
			/**
			 */
			public void ConsultarCataleg(){
			}

				
				/**
				 */
				public void EliminarProducte(){
				}

					
					/**
					 */
					public void ModificarCataleg(){
					}


					/**
					 * @uml.property  name="data"
					 */
					private String data;


					/**
					 * Getter of the property <tt>data</tt>
					 * @return  Returns the data.
					 * @uml.property  name="data"
					 */
					public String getData() {
						return data;
					}


					/**
					 * Setter of the property <tt>data</tt>
					 * @param data  The data to set.
					 * @uml.property  name="data"
					 */
					public void setData(String data) {
						this.data = data;
					}


					/**
					 * @uml.property  name="producte"
					 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" aggregation="composite" inverse="cataleg:uab.es.practiques.Producte"
					 */
					private ArrayList<Producte> producte;


					/**
					 * Getter of the property <tt>producte</tt>
					 * @return  Returns the producte.
					 * @uml.property  name="producte"
					 */
					public ArrayList<Producte> getProducte() {
						return producte;
					}


					/**
					 * Setter of the property <tt>producte</tt>
					 * @param producte  The producte to set.
					 * @uml.property  name="producte"
					 */
					public void setProducte(ArrayList<Producte> producte) {
						this.producte = producte;
					}	
}

