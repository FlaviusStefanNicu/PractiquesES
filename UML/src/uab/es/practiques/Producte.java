package uab.es.practiques;

import java.util.Collection;

public class Producte{

	/**
	 * @uml.property  name="descripcio"
	 */
	private String descripcio;

	/**
	 * Getter of the property <tt>descripcio</tt>
	 * @return  Returns the descripcio.
	 * @uml.property  name="descripcio"
	 */
	public String getDescripcio() {
		return descripcio;
	}

	/**
	 * Setter of the property <tt>descripcio</tt>
	 * @param descripcio  The descripcio to set.
	 * @uml.property  name="descripcio"
	 */
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	/**
	 * @uml.property  name="ID"
	 */
	private String id;

	/**
	 * Getter of the property <tt>ID</tt>
	 * @return  Returns the id.
	 * @uml.property  name="ID"
	 */
	public String getID() {
		return id;
	}

	/**
	 * Setter of the property <tt>ID</tt>
	 * @param ID  The id to set.
	 * @uml.property  name="ID"
	 */
	public void setID(String id) {
		this.id = id;
	}

	/**
	 * @uml.property  name="preu"
	 */
	private int preu;

	/**
	 * Getter of the property <tt>preu</tt>
	 * @return  Returns the preu.
	 * @uml.property  name="preu"
	 */
	public int getPreu() {
		return preu;
	}

	/**
	 * Setter of the property <tt>preu</tt>
	 * @param preu  The preu to set.
	 * @uml.property  name="preu"
	 */
	public void setPreu(int preu) {
		this.preu = preu;
	}

	/**
	 * @uml.property  name="stock"
	 */
	private int stock;

	/**
	 * Getter of the property <tt>stock</tt>
	 * @return  Returns the stock.
	 * @uml.property  name="stock"
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Setter of the property <tt>stock</tt>
	 * @param stock  The stock to set.
	 * @uml.property  name="stock"
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @uml.property  name="cataleg"
	 * @uml.associationEnd  inverse="producte:uab.es.practiques.Cataleg"
	 */
	private Cataleg cataleg;

	/**
	 * Getter of the property <tt>cataleg</tt>
	 * @return  Returns the cataleg.
	 * @uml.property  name="cataleg"
	 */
	public Cataleg getCataleg() {
		return cataleg;
	}

	/**
	 * Setter of the property <tt>cataleg</tt>
	 * @param cataleg  The cataleg to set.
	 * @uml.property  name="cataleg"
	 */
	public void setCataleg(Cataleg cataleg) {
		this.cataleg = cataleg;
	}

	/** 
	 * @uml.property name="lineaCompra"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="producte:uab.es.practiques.LineaCompra"
	 */
	private Collection<LineaCompra> lineaCompra;

	/** 
	 * Getter of the property <tt>lineaCompra</tt>
	 * @return  Returns the lineaCompra.
	 * @uml.property  name="lineaCompra"
	 */
	public Collection<LineaCompra> getLineaCompra() {
		return lineaCompra;
	}

	/** 
	 * Setter of the property <tt>lineaCompra</tt>
	 * @param lineaCompra  The lineaCompra to set.
	 * @uml.property  name="lineaCompra"
	 */
	public void setLineaCompra(Collection<LineaCompra> lineaCompra) {
		this.lineaCompra = lineaCompra;
	}



	
	
}
