package uab.es.practiques.actores;

import java.util.ArrayList;

import uab.es.practiques.Factura;
import uab.es.practiques.Producto;



public class Cliente extends User {

		
		/**
		 */
		public void AnyadirProducto(Producto producto){
		}

		/** 
		 * @uml.property name="CarroCompra"
		 */
		private ArrayList<Producto> carroCompra = new java.util.ArrayList<Producto>();

		/** 
		 * Getter of the property <tt>CarroCompra</tt>
		 * @return  Returns the carroCompra.
		 * @uml.property  name="CarroCompra"
		 */
		public ArrayList<Producto> getCarroCompra() {
			return carroCompra;
		}

		/** 
		 * Setter of the property <tt>CarroCompra</tt>
		 * @param CarroCompra  The carroCompra to set.
		 * @uml.property  name="CarroCompra"
		 */
		public void setCarroCompra(ArrayList<Producto> carroCompra) {
			this.carroCompra = carroCompra;
		}

			
			/**
			 */
			public void eliminarProducto(Producto producto){
			}

				
				/**
				 */
				public void CompraOnline(){
				}

					
					/**
					 */
					public ArrayList<Producto> ConsultarCatalogo(){
						return null;
					}

					@Override
					public boolean Login() {
						// TODO Auto-generated method stub
						return false;
					}

						
						/**
						 */
						public ArrayList<Factura> MisFacturas(){
							return this.ConsultaFactures(this);
						}

				

			
		

}
