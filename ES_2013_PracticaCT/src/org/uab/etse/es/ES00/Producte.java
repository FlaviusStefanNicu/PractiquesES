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

public class Producte {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (this.nombre!=null){
			this.nombre = nombre;
			UpdateProdTxt();
		}else
			this.nombre = nombre;
	}

	private String idProducte;

	public String getIdProducte() {
		return idProducte;
	}

	public void setIdProducte(String idProducte) {
		if (this.idProducte!=null){
			this.idProducte = idProducte;
			UpdateProdTxt();
		}else
			this.idProducte = idProducte;
	}

	private int unitats = 0;

	public int getUnitats() {
		return unitats;
	}

	public void setUnitats(int unitats) {
		if (this.unitats!=0){
			this.unitats = unitats;
			UpdateProdTxt();
		}else
			this.unitats = unitats;
	}

	private float cost = 0;

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		if (this.cost!=0){
			this.cost = cost;
			UpdateProdTxt();
		}else
			this.cost = cost;
	}

	private int stockOptim = 0;

	public int getStockOptim() {
		return stockOptim;
	}

	public void setStockOptim(int stockOptim) {
		if (this.stockOptim!=0){
			this.stockOptim = stockOptim;
			UpdateProdTxt();
		}else
			this.stockOptim = stockOptim;
	}

	private int stockMinim = 0;

	public int getStockMinim() {
		return stockMinim;
	}

	public void setStockMinim(int stockMinim) {
		if (this.stockMinim!=0){
			this.stockMinim = stockMinim;
			UpdateProdTxt();
		}else
			this.stockMinim = stockMinim;
	}

	public Producte(){
		super();
	}

	public Producte( String nombre, String idProducte, int unitats, float cost, int stockOptim,
			int stockMinim, String descripcio) {
		super();
		this.nombre = nombre;
		this.idProducte = idProducte;
		this.unitats = unitats;
		this.cost = cost;
		this.stockOptim = stockOptim;
		this.stockMinim = stockMinim;
		this.descripcio = descripcio;
	}

	private String descripcio;

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		if (this.descripcio!=null){
			this.descripcio = descripcio;
			UpdateProdTxt();
		}else
			this.descripcio = descripcio;
	}

	private void UpdateProdTxt(){
		String nomRegistro = Constantes.RutaProductes;
		FileReader fr;
		BufferedReader ficheroRegistro;
		FileWriter fr1;
		BufferedWriter ficheroRegistro1;

		try {
			// reading
			fr = new FileReader (new File(nomRegistro));//for reading
			ficheroRegistro = new BufferedReader(fr);
			String sCadena;
			int max = 1000;				
			String[] prodStr = new String[max];
			int pos = 0;
			ficheroRegistro = new BufferedReader(fr);
			while ((sCadena = ficheroRegistro.readLine())!=null) {
				prodStr[pos] = sCadena;
				pos++;					
			} 


			fr1 = new FileWriter(new File(nomRegistro));// for writing
			ficheroRegistro1 = new BufferedWriter(fr1);
			for (int i=0; i<pos;i++){
				String IDprod = getIdProducte();
				String idstr = IdProdStr(prodStr[i]);
				if (!IDprod.equals(idstr)){
					ficheroRegistro1.append(prodStr[i]);
					ficheroRegistro1.newLine();
				}				
			}
			ficheroRegistro1.append( getIdProducte().toString()+ "-" +getNombre().toString() + "-" +getCost()  + "-" + getUnitats() + "-" + getStockOptim() + "-" + getStockMinim() + "-" + getDescripcio().toString());
			
			ficheroRegistro.close();
			ficheroRegistro1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String IdProdStr(String sCadena){
		String[] ProdDades = sCadena.split("-");
		return ProdDades[0];
	}

}
