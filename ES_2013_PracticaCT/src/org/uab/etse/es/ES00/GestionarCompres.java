/**
 * @author ES-2012.Practiques
 */

package org.uab.etse.es.ES00;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class GestionarCompres {
	private Compra compra;
	private Cataleg cataleg;
	private Collection<Client> clients;
	private Client clientRegistrat;

	public Collection<Producte> ConsultarCatalog() {
		return getCataleg().getProducte();
	}


	public GestionarCompres() {
		super();
		cataleg = new Cataleg();
		compra = new Compra();
		clientRegistrat = null;
		clients = new ArrayList<Client>();
	}


	public Cataleg getCataleg() {
		return cataleg;
	}

	public void setCataleg(Cataleg cataleg) {
		this.cataleg = cataleg;
	}

	

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public boolean FinalitzarCompra() {
		if (clientRegistrat != null)
			return compra.EfectuarCompra(clientRegistrat);
		else 
			return false;

	}

	public boolean AfegirProducte(String IdProd, int unitats){
		if(clientRegistrat!=null)
			return compra.AfegirProducteCarro(IdProd, unitats);
		else 
			return false;

	}


	private Client ReadClientStr(String sCadena){
		Client auxClient = new Client();
		String[] clientDades = sCadena.split("-");
		// Update values
		auxClient.setIdClient(clientDades[0]);
		auxClient.setNom(clientDades[1]);
		auxClient.setCognom(clientDades[2]);
		auxClient.setDNI(clientDades[3]);
		auxClient.setCompteBancari(clientDades[4]);
		auxClient.setTelefon(clientDades[5]);
		auxClient.setPassword(clientDades[6]);

		return auxClient;
	}

	private void ReadClientFromTxt(){
		String nomRegistro = Constantes.RutaClient;
		FileReader fr;
		BufferedReader ficheroRegistro;
		try {
			fr = new FileReader (new File(nomRegistro));
			ficheroRegistro = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = ficheroRegistro.readLine())!=null) {
				clients.add(ReadClientStr(sCadena));
			}
			ficheroRegistro.close();
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
	}

	public Collection<Client> getClient() {
		if (clients.isEmpty())
			ReadClientFromTxt();
		return clients;
	}

	private Client[] clientToArray(){
		return (Client[]) getClient().toArray(new Client[getClient().size()]);
	}

	public void setClient(Collection<Client> client) {
		clients = client;
	}

	public boolean RegistrarClient(String IdClient, String password){
		int pos = 0;
		boolean flag = clientToArray()[pos].Identificarse(IdClient, password);
		while ((pos<getClient().size())&&(!(flag))){ // Mientras no llegue al final Y el producto de la posicion "pos" no sea el buscado
			flag = clientToArray()[pos].Identificarse(IdClient, password);
			pos++;
		}
		if (flag){
			this.clientRegistrat =  clientToArray()[pos];
			return true;
		}
		else {
			this.clientRegistrat = null;
			return false;
		}
	}


	public boolean Desconnectar(String idClient, String password){
		if (clientRegistrat!=null){
			if (clientRegistrat.Identificarse(idClient, password)){
				clientRegistrat = null;
				return true;
			}else
				return false;
		}else
			return false;
	}

	public Client getClientRegistrat() {
		return clientRegistrat;
	}

	public void setClientRegistrat(Client clientRegistrat) {
		this.clientRegistrat = clientRegistrat;
	}

	public void EliminarProducte(String IdProd){
		if(clientRegistrat!=null)
			compra.EliminarProducte(IdProd);
	}

	private void RegistrarCompra(String registro){
	}

	public int MostrarStockProductes(){
		int aux = 0;
		Producte[] productes = getCataleg().producteToArray();
		for (int i=0; i<getCataleg().producteSize(); i++) {
			aux += productes[i].getUnitats();
		}
		return aux;
	}

}
