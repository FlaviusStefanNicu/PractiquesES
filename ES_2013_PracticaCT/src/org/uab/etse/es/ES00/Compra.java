/**
 * @author ES-2012.Practiques
 */

package org.uab.etse.es.ES00;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Compra {

	private Collection<LiniaCompra> liniaCompra;

	protected float saldo;

	protected String idCompra;

	protected Client client = new org.uab.etse.es.ES00.Client();

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Collection<LiniaCompra> getLiniaCompra() {
		return liniaCompra;
	}

	public Iterator<LiniaCompra> liniaCompraIterator() {
		return liniaCompra.iterator();
	}

	public boolean isLiniaCompraEmpty() {
		return liniaCompra.isEmpty();
	}

	public boolean containsLiniaCompra(LiniaCompra liniaCompra) {
		return this.liniaCompra.contains(liniaCompra);
	}

	public boolean containsAllLiniaCompra(Collection<LiniaCompra> liniaCompra) {
		return this.liniaCompra.containsAll(liniaCompra);
	}

	public int liniaCompraSize() {
		return liniaCompra.size();
	}

	public LiniaCompra[] liniaCompraToArray() {
		return (LiniaCompra[]) liniaCompra.toArray(new LiniaCompra[liniaCompra
		                                                           .size()]);
	}
	public LiniaCompra[] liniaCompraToArray(LiniaCompra[] liniaCompra) {
		return (LiniaCompra[]) this.liniaCompra.toArray(liniaCompra);
	}

	public boolean addLiniaCompra(LiniaCompra liniaCompra) {
		return this.liniaCompra.add(liniaCompra);
	}

	public void setLiniaCompra(Collection<LiniaCompra> liniaCompra) {
		this.liniaCompra = liniaCompra;
	}

	public boolean removeLiniaCompra(LiniaCompra liniaCompra) {
		return this.liniaCompra.remove(liniaCompra);
	}

	public void clearLiniaCompra() {
		this.liniaCompra.clear();
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public boolean AfegirProducteCarro(String idLineaCompra, int unitats){			
		LiniaCompra auxLinia = new LiniaCompra(unitats, idLineaCompra);
		if (auxLinia.getProducte().getUnitats() >= unitats){ //REVISARR!!!falta implementar els metodes
			addLiniaCompra(auxLinia);	
			return true;
		}else
			return false;				
	}

	private float PreuTotal(){
		float preuTotal = 0;
		for (int i=0; i<liniaCompraSize();i++){
			preuTotal += liniaCompraToArray()[i].GetPreu(); 
		} 
		return preuTotal;
	}

	private void RegistrarLiniaCompraTxt( String IdProd, String NomProd, int LiniaUnitats, float liniaPreu){
		// Registrar compra
		String nomRegistro = "/home/adria/Escritorio/Practiques ES GIT/PractiquesES/ES_2013_PracticaCT/src/org/uab/etse/es/ES00/registro.txt";

		FileWriter fr;
		BufferedWriter ficheroRegistro;
		try {
			fr = new FileWriter(new File(nomRegistro), true);
			ficheroRegistro = new BufferedWriter(fr);
			String sCadena =  IdProd.toString() + "-" + NomProd.toString()+ "-" + LiniaUnitats + "-" + liniaPreu;
			ficheroRegistro.newLine();
			ficheroRegistro.append(sCadena);
			ficheroRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

	private void RegistrarCompraTxt( String idCompra, String clientNom, float preu){
		// Registrar compra
		String nomRegistro = "registro.txt";
		FileWriter fr;
		BufferedWriter ficheroRegistro;
		try {
			fr = new FileWriter(new File(nomRegistro), true);
			ficheroRegistro = new BufferedWriter(fr);
			String sCadena = "Client: " + clientNom.toString()+ " Preu: " + preu;
			ficheroRegistro.newLine();
			ficheroRegistro.append(sCadena);
			ficheroRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

	/** Efectuar la compra	 
	 * @throws IOException */
	public boolean EfectuarCompra(Client clientRegistrat) {
		setClient(clientRegistrat);
		if ((liniaCompraSize()>0)&&(client!=null)){
			this.saldo += PreuTotal();
			for (int i=0; i<liniaCompraSize();i++){
				int newUnitats = liniaCompraToArray()[i].getProducte().getUnitats() - liniaCompraToArray()[i].getUnitats();
				liniaCompraToArray()[i].getProducte().setUnitats(newUnitats);
				RegistrarLiniaCompraTxt(liniaCompraToArray()[i].getProducte().getIdProducte(), liniaCompraToArray()[i].getProducte().getNombre(), liniaCompraToArray()[i].getUnitats(), liniaCompraToArray()[i].GetPreu());
			}
			RegistrarCompraTxt(idCompra, client.getNom(), this.saldo);
			clearLiniaCompra();
			return true;
		}else
			return false;

	}

	public Compra() {
		super();
		// TODO Auto-generated constructor stub
		this.liniaCompra = new ArrayList<LiniaCompra>();
		this.saldo = 0;
		this.idCompra = "";
	}

	public Compra(Collection<LiniaCompra> liniaCompra, float saldo,
			java.lang.String idCompra, Client client) {
		super();
		this.liniaCompra = liniaCompra;
		this.saldo = saldo;
		this.idCompra = idCompra;
		this.client = client;
	}

	public void EliminarProducte(String IdLinia){
		int pos = 0;
		LiniaCompra auxLiniaCompra = null;
		while ((pos<liniaCompraSize())&&(!(liniaCompraToArray()[pos].getIdLineaCompra().equals(IdLinia)))){ // Mientras no llegue al final Y la linea de la posicion "pos" no sea la buscada
			pos++;
		}
		if ((pos!=liniaCompraSize()) && (liniaCompraToArray()[pos].getIdLineaCompra().equals(IdLinia)))
			auxLiniaCompra = liniaCompraToArray()[pos];
		removeLiniaCompra(auxLiniaCompra);
	}
}
