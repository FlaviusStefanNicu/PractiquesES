package uab.es.practiques.actores;

import java.util.ArrayList;

import uab.es.practiques.Factura;
import uab.es.practiques.Producto;



public class Cajero extends User {

	
	public interface eventFinCarrito {

	}



	@Override
	public boolean Login() {
		// TODO Auto-generated method stub
		return false;
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
		 * @uml.property name="nom"
		 */
		public String nom;


		/**
		 * @uml.property  name="carrec"
		 */
		private String carrec;


		/**
		 * Getter of the property <tt>carrec</tt>
		 * @return  Returns the carrec.
		 * @uml.property  name="carrec"
		 */
		public String getCarrec() {
			return carrec;
		}


		/**
		 * Setter of the property <tt>carrec</tt>
		 * @param carrec  The carrec to set.
		 * @uml.property  name="carrec"
		 */
		public void setCarrec(String carrec) {
			this.carrec = carrec;
		}


}
