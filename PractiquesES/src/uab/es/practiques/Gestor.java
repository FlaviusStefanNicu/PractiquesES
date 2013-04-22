package uab.es.practiques;

import java.util.ArrayList;
import uab.es.practiques.actores.Cajero;
import uab.es.practiques.actores.Cliente;


public class Gestor {

		
		public interface EventoFinalLecturaProducto {

			public abstract void AddProducto(Producto produc);
	}



		public interface EventoFinalFactura {

					
					/**
					 */
					public abstract void LimpiarLista();
					

	}



		/**
		 */
		public ArrayList<Producto> ConsultarCatalogo(){
			return null;
		}

			
			/**
			 */
			public ArrayList<Producto> ConsultarFactura(Cliente cliente){
				return null;
			}


				
					
					/**
					 */
					public void GenerarFactura(Cliente cliente, EventoFinalFactura event){
					}


					
					/**
					 */
					public void GenerarFactura(ArrayList<Producto> carrito, Cajero cajero,EventoFinalFactura event){
					}


						
						/**
						 */
						public Producto leerProducto(){
							return null;
						}

}
