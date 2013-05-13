package uab.es.practiques;

import java.util.ArrayList;


public class Factura {

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
	 * @uml.property  name="Codigo"
	 */
	private String codigo;

	/**
	 * Getter of the property <tt>Codigo</tt>
	 * @return  Returns the codigo.
	 * @uml.property  name="Codigo"
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Setter of the property <tt>Codigo</tt>
	 * @param Codigo  The codigo to set.
	 * @uml.property  name="Codigo"
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @uml.property  name="fecha"
	 */
	private String fecha;

	/**
	 * Getter of the property <tt>fecha</tt>
	 * @return  Returns the fecha.
	 * @uml.property  name="fecha"
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Setter of the property <tt>fecha</tt>
	 * @param fecha  The fecha to set.
	 * @uml.property  name="fecha"
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @uml.property  name="productos"
	 */
	private ArrayList<Producto> productos;

	/**
	 * Getter of the property <tt>productos</tt>
	 * @return  Returns the productos.
	 * @uml.property  name="productos"
	 */
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	/**
	 * Setter of the property <tt>productos</tt>
	 * @param productos  The productos to set.
	 * @uml.property  name="productos"
	 */
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * @uml.property  name="precioTotal"
	 */
	private double precioTotal;

	/**
	 * Getter of the property <tt>precioTotal</tt>
	 * @return  Returns the precioTotal.
	 * @uml.property  name="precioTotal"
	 */
	public double getPrecioTotal() {
		return precioTotal;
	}

	/**
	 * Setter of the property <tt>precioTotal</tt>
	 * @param precioTotal  The precioTotal to set.
	 * @uml.property  name="precioTotal"
	 */
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

}
