/**
 * @author ES-2012.Practiques
 */

package org.uab.etse.es.ES00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;


public class LiniaCompra {
	private int unitat;
	private String IDLinea;
	private Compra compra;
	private Producte producte;

	public LiniaCompra(int unitats, String idLineaCompra) {
		super();
		this.unitat = unitats;
		this.IDLinea = idLineaCompra;
	}
	public Producte getProducte() {
		return this.producte;
	}

	public void setProducte(Producte producte) {
		this.producte = producte;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public int getUnitats() {
		return this.unitat;
	}

	public void setUnitats(int unitats) {
		this.unitat = unitats;
	}
			
	public String getIdLineaCompra() {
		return this.IDLinea;
	}

	public void setIdLineaCompra(String idLineaCompra) {
		this.IDLinea = idLineaCompra;
	}

	

	public float GetPreu(){
		return 0;
	}
}
