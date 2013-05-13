package uab.es.practiques;

import java.util.ArrayList;


public class Producto {

	/**
	 * @uml.property  name="Nombre"
	 */
	private String nombre;

	/**
	 * Getter of the property <tt>Nombre</tt>
	 * @return  Returns the nombre.
	 * @uml.property  name="Nombre"
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter of the property <tt>Nombre</tt>
	 * @param Nombre  The nombre to set.
	 * @uml.property  name="Nombre"
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @uml.property  name="precio"
	 */
	private double precio = 0;

	/**
	 * Getter of the property <tt>precio</tt>
	 * @return  Returns the precio.
	 * @uml.property  name="precio"
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter of the property <tt>precio</tt>
	 * @param precio  The precio to set.
	 * @uml.property  name="precio"
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @uml.property  name="Caracteristicas"
	 */
	private ArrayList<String> caracteristicas;

	/**
	 * Getter of the property <tt>Caracteristicas</tt>
	 * @return  Returns the caracteristicas.
	 * @uml.property  name="Caracteristicas"
	 */
	public ArrayList<String> getCaracteristicas() {
		return caracteristicas;
	}

	/**
	 * Setter of the property <tt>Caracteristicas</tt>
	 * @param Caracteristicas  The caracteristicas to set.
	 * @uml.property  name="Caracteristicas"
	 */
	public void setCaracteristicas(ArrayList<String> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
