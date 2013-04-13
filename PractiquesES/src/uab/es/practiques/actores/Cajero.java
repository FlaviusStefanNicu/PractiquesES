package uab.es.practiques.actores;

import java.util.ArrayList;

import uab.es.practiques.Factura;
import uab.es.practiques.Producto;



public class Cajero extends User {

	@Override
	public boolean Login() {
		// TODO Auto-generated method stub
		return false;
	}

		
		/**
		 */
		public void leerProducto(String codigo){
		}


		/**
		 * @uml.property  name="lista"
		 */
		private ArrayList<Producto> lista;


		/**
		 * Getter of the property <tt>lista</tt>
		 * @return  Returns the lista.
		 * @uml.property  name="lista"
		 */
		public ArrayList<Producto> getLista() {
			return lista;
		}


		/**
		 * Setter of the property <tt>lista</tt>
		 * @param lista  The lista to set.
		 * @uml.property  name="lista"
		 */
		public void setLista(ArrayList<Producto> lista) {
			this.lista = lista;
		}


			
			/**
			 */
			public Factura generarFactura(){
				return null;
			}



}
