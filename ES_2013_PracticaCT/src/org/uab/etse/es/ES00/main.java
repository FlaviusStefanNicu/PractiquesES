package org.uab.etse.es.ES00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import org.uab.etse.es.ES00.GestionarCompres; 

public class main {
	
	private static GestionarCompres gestion;

	private static void MostrarCatalog(Collection<Producte> prods){
		System.out.println("Id  Nombre  Cost  Unitats  StockOptim  StockMinim  Descripcio\n");
		Producte[] arrProd = (Producte[])prods.toArray(new Producte[prods.size()]);
		for (int i=0;i<prods.size();i++){
			System.out.println(arrProd[i].getIdProducte() + "  " + arrProd[i].getNombre() + "  " + arrProd[i].getCost() + "  " + arrProd[i].getUnitats() + "  " + arrProd[i].getStockOptim() + "  " + arrProd[i].getStockMinim() + "  " + arrProd[i].getDescripcio());
		}
		
	}
	private static void RegistrarClient(){
		System.out.println("Id client: \n");
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String idClient = "";
		try {
			idClient = teclado.readLine().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Password: \n");
		String password = "";
		try {
			password = teclado.readLine().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (gestion.RegistrarClient(idClient, password))
			System.out.println("Client registrat \n");
		else
			System.out.println("Dades incorrectes \n");
			
	}
	
	private static void AfegirProd(){
		boolean flag = true;
		while (flag){
			flag = false;
			System.out.println("Id del producte: \n");
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			String idProd = "";
			int unitats = 0;
			try {
				idProd = teclado.readLine().toString();
				System.out.println("Unitats: \n");			
				unitats = Integer.parseInt(teclado.readLine());
				if (gestion.AfegirProducte(idProd, unitats)){
					System.out.println("Producte afegit");
					System.out.println("�Voleu continuar?[S/N]: \n");
					flag = (teclado.readLine().toLowerCase().equals("s"));
				}
				else
					System.out.println("Error: dades del producte o del client erronis");
		
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	private static void FinalitzarCompra(){
		if (gestion.FinalitzarCompra())
			System.out.println("Proces de compra finalitzat");
		else
			System.out.println("Error!");
		
	}
	
	private static void MostrarStock(){
		System.out.println("El stock total de tots els productes " + gestion.MostrarStockProductes());
	}
	
	private static void DesconectarClient(){
		System.out.println("Id client: \n");
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String idClient = "";
		try {
			idClient = teclado.readLine().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Password: \n");
		String password = "";
		try {
			password = teclado.readLine().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (gestion.Desconnectar(idClient, password))
			System.out.println("Desconnectat \n");
		else
			System.out.println("Dades incorrectes \n");
			
	}
	private static void PrintMenu(){
		System.out.println("Discon Market \n");
		System.out.println(" ");
		System.out.println("Opcio: \n");
		System.out.println("1- Consultar cataleg \n");
		System.out.println("2- Identificar client \n");
		System.out.println("3- Afegir producte al cistell \n");
		System.out.println("4- Finalitzar compra \n");
		System.out.println("5- Mostrar stock de productes \n");
		System.out.println("6- Desconnectar client \n");
		System.out.println("7- Sortir \n");
		
	}
	/**
	 * @param args
	 * @throws IOException 
	 */	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		PrintMenu();
		//char inOpcio = System.in.read();//Integer.parseInt(System.in.toString());
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		gestion = new GestionarCompres();
		int opcio = 0;
		while (opcio!=7){
			try {
				opcio = Integer.parseInt(teclado.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			switch (opcio){
				case 1: MostrarCatalog(gestion.ConsultarCatalog());
					  	break;
				case 2: RegistrarClient();
					  	break; 
				case 3: AfegirProd();
					  	break;
				case 4: FinalitzarCompra();
					  	break;	
				case 5: MostrarStock();
					  	break;
				case 6: 
				default:
					System.out.println("Opcio no valida");
			}	
			System.out.println("--------------------------------------------------------");
			PrintMenu();
		}
	}
}
