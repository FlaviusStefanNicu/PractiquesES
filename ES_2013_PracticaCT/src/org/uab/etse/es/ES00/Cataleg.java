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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cataleg {

	private Collection<Producte> producte;

	public Collection<Producte> getProducte() {
		if (isProducteEmpty())
			ReadProdFromTxt();
		return producte;
	}

	private void ReadProdFromTxt(){
		FileReader fr;
		BufferedReader ficheroRegistro;
		try {
			fr = new FileReader (new File(StorageFilename()));
			ficheroRegistro = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = ficheroRegistro.readLine())!=null) {
				addProducte(ReadProdStr(sCadena));
			}
			ficheroRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Producte ReadProdStr(String sCadena){
		Producte auxProd = new Producte();
		String[] ProdDades = sCadena.split("-");
		// Update values
		auxProd.setNombre(ProdDades[0]);
		auxProd.setIdProducte(ProdDades[1]);
		auxProd.setUnitats(Integer.parseInt(ProdDades[2]));
		auxProd.setCost(Float.valueOf(ProdDades[3]).floatValue());
		auxProd.setStockOptim(Integer.parseInt(ProdDades[4]));
		auxProd.setStockMinim(Integer.parseInt(ProdDades[5]));
		auxProd.setDescripcio(ProdDades[6]);

		return auxProd;
	}

	public Iterator<Producte> producteIterator() {
		return producte.iterator();
	}

	public boolean isProducteEmpty() {
		return producte.isEmpty();
	}

	public boolean containsProducte(Producte producte) {
		return this.producte.contains(producte);
	}

	public boolean containsAllProducte(Collection<Producte> producte) {
		return this.producte.containsAll(producte);
	}

	public int producteSize() {
		return producte.size();
	}

	public Producte[] producteToArray() {
		return (Producte[]) getProducte().toArray(new Producte[getProducte().size()]);
	}

	public Producte[] producteToArray(Producte[] producte) {
		return (Producte[]) this.producte.toArray(producte);
	}

	public boolean addProducte(Producte producte) {
		return this.producte.add(producte);
	}

	public void setProducte(Collection<Producte> producte) {
		this.producte = producte;
	}

	public boolean removeProducte(Producte producte) {
		return this.producte.remove(producte);
	}

	public void clearProducte() {
		this.producte.clear();
	}

	public boolean AfegirProducte(String nombreProd, String idProd, int unistatsProd, float costProd, int stockOptimProd, int stockMinimProd, String descrpcio){
		Producte auxProd = new Producte( nombreProd, idProd, unistatsProd, costProd, stockOptimProd, stockMinimProd, descrpcio);
		WriteProdToTxt(nombreProd, idProd, unistatsProd, costProd, stockOptimProd, stockMinimProd, descrpcio);
		return this.producte.add(auxProd);
	}

	private void WriteProdToTxt(String nombreProd, String idProd, int unistatsProd, float costProd, int stockOptimProd, int stockMinimProd, String descrpcio){
		// Registro de productos
		FileWriter fr;
		BufferedWriter ficheroRegistro;
		try {
			fr = new FileWriter(new File(StorageFilename()), true);
			ficheroRegistro = new BufferedWriter(fr);
			String sCadena = nombreProd.toString() + "-" + idProd.toString()+ "-" + unistatsProd + "-" + costProd + "-" + stockOptimProd + "-" + stockMinimProd + "-" + descrpcio.toString();
			ficheroRegistro.append(sCadena);
			ficheroRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Modificar producte **/
	public boolean ModificarProducte(Producte oldProd, String nombreProd, String idProd, int unistatsProd, float costProd, int stockOptimProd, int stockMinimProd, String descrpcio){
		this.producte.remove(oldProd);
		Producte auxProd = new Producte( nombreProd, idProd, unistatsProd, costProd, stockOptimProd, stockMinimProd, descrpcio);
		return this.producte.add(auxProd);
	}


	/** 
	 * Get product
	 */
	private Producte GetProd(String idProd){

		int pos = 0;
		while ((pos<producteSize())&&(!(producteToArray()[pos].getIdProducte().equals(idProd)))){ // Mientras no llegue al final Y el producto de la posicion "pos" no sea el buscado
			pos++;
		}
		if ((pos!=producteSize()) && (producteToArray()[pos].getIdProducte().equals(idProd)))
			return producteToArray()[pos];
		else 
			return null;
	}

	/** 
	 * Get product position
	 */
	private int GetProdPos(String idProd){
		int pos = 0;
		while ((pos<producteSize())&&(!(producteToArray()[pos].getIdProducte().equals(idProd)))){ // Mientras no llegue al final Y el producto de la posicion "pos" no sea el buscado
			pos++;
		}
		if ((pos!=producteSize()) && (producteToArray()[pos].getIdProducte().equals(idProd)))
			return pos;
		else 
			return -1;
	}

	/**
	 */
	public boolean EliminarProducte(String idProd){
		return removeProducte(GetProd(idProd));	
	}

	public Cataleg() {
		super();
		// TODO Auto-generated constructor stub
		producte = new ArrayList<Producte>();

	}

	protected String StorageFilename(){
		return "productes.txt";
	}
}
