/**
 * @author ES-2012.Practiques
 */

package org.uab.etse.es.ES00;

import java.util.Collection;


public class Client {
	
	public Client(){};

	public Client(String idclient, String dni, String nom, String cognom, 
					   String password, String telefon, String comptebancari){
		this.dni = dni;
		this.nom = nom;
		this.cognom = cognom;
		this.password = password;
		this.compteBancari = comptebancari;
		this.idClient = idclient;
		this.telefon = telefon;
	}

	private String dni="";

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	private String nom="";

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String cognom="";

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	private String compteBancari="";

	public String getCompteBancari() {
		return compteBancari;
	}

	public void setCompteBancari(String compteBancari) {
		this.compteBancari = compteBancari;
	}

	private String telefon="";

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	private String idClient="";

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	private String password="";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean Identificarse(String idClient, String password){
		return ((this.idClient.equals(idClient))&&(this.password.equals(password))); 
	}

	private Collection<Compra> compra;

	public Collection<Compra> getCompra() {
		return compra;
	}

	public void setCompra(Collection<Compra> compra) {
		this.compra = compra;
	}
}
