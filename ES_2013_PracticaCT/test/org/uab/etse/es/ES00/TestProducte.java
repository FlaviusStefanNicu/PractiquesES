package org.uab.etse.es.ES00;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;

public class TestProducte extends TestCase {

	private ProducteTest tproducte = null;
	private final String nombre = "nom";
	private final String idProducte ="55";
	private final int unitats = 20;
	private final float cost = 4.5f;
	private final int stockOptim = 3;
	private final int stockMinim = 6;
	private final String descripcio = "esto es una prova";
	
	private class ProducteTest extends Producte {
		public ProducteTest(String nombre, String idProducte, int unitats, float cost, int stockOptim, int stockMinim, String descripcio) {
			super(nombre, idProducte, unitats, cost, stockOptim, stockMinim, descripcio);
		}

		protected String rutaFitxer(){
			return ConstantesTests.RutaProductes;
		}
		
		@SuppressWarnings("finally")
		private boolean comprobarUpdate(String id){
			String nomRegistro = tproducte.rutaFitxer();
			FileReader fReader;
			BufferedReader bReader;
			boolean comprobar = false;

			try {
				
				fReader = new FileReader (new File(nomRegistro));
				bReader = new BufferedReader(fReader);
				String linea, idLinea = "";
				
				while ((linea = bReader.readLine())!=null && !comprobar) {
					idLinea = tproducte.IdProdStr(linea);
					
					if (idLinea.equals(id)){
						comprobar = true;
					}
				}
				fReader.close();
				bReader.close();
				return comprobar;
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}finally{
				return comprobar;
			}
		}
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		
		tproducte = new ProducteTest(this.nombre, this.idProducte, this.unitats, this.cost, this.stockOptim, this.stockMinim, this.descripcio);
		
	}

	public final void testGetNombre() {
		assertTrue(tproducte.getNombre().equals(nombre));
	}

	public final void testSetNombre() {
		this.tproducte.setNombre("producte");
		assertTrue(this.tproducte.getNombre().equals("producte"));
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetIdProducte() {
		assertTrue(this.tproducte.getIdProducte().equals(idProducte));
	}

	public final void testSetIdProducte() {
		this.tproducte.setIdProducte("23");
		assertTrue(this.tproducte.getIdProducte().equals("23"));
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetUnitats() {
		assertTrue(this.tproducte.getUnitats() == unitats);
	}

	public final void testSetUnitats() {
		int n = 100;
		this.tproducte.setUnitats(n);
		assertTrue( this.tproducte.getUnitats() == n);
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetCost() {
		assertTrue(this.tproducte.getCost() == cost);
	}

	public final void testSetCost() {
		this.tproducte.setCost(10.5f);
		assertTrue(this.tproducte.getCost() == 10.5);
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetStockOptim() {
		assertTrue(this.tproducte.getStockOptim() == stockOptim);
	}

	public final void testSetStockOptim() {
		this.tproducte.setStockOptim(10);
		assertTrue(this.tproducte.getStockOptim() == 10);
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetStockMinim() {
		assertTrue(this.tproducte.getStockMinim() == stockMinim);
	}

	public final void testSetStockMinim() {
		this.tproducte.setStockMinim(15);
		assertTrue(this.tproducte.getStockMinim() == 15);
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testGetDescripcio() {
		assertTrue(this.tproducte.getDescripcio().equals(this.descripcio));
	}

	public final void testSetDescripcio() {
		this.tproducte.setDescripcio("prova set");
		assertTrue(this.tproducte.getDescripcio().equals("prova set"));
		assertTrue(this.tproducte.comprobarUpdate(tproducte.getIdProducte()));
	}

	public final void testProducteStringStringIntFloatIntIntString() {
		assertTrue(this.tproducte.getNombre() instanceof String);
		assertTrue(this.tproducte.getIdProducte() instanceof String);		
		assertTrue(isInteger(this.tproducte.getUnitats()));
		assertTrue(isFloat(this.tproducte.getCost()));
		assertTrue(isInteger(this.tproducte.getStockMinim()));
		assertTrue(isInteger(this.tproducte.getStockOptim()));
		assertTrue(this.tproducte.getDescripcio() instanceof String);		
	}
	
	public final void testProducte() {
		Producte tempproducte = new Producte(this.nombre, this.idProducte, this.unitats, this.cost, this.stockOptim, this.stockMinim, this.descripcio);
		
		boolean n = this.tproducte.getNombre().equals(tempproducte.getNombre());
		boolean d = this.tproducte.getDescripcio().equals(tempproducte.getDescripcio());
		boolean i = this.tproducte.getIdProducte().equals(tempproducte.getIdProducte());
		boolean u = this.tproducte.getUnitats() == tempproducte.getUnitats();
		boolean c = this.tproducte.getCost() == tempproducte.getCost();
		boolean sm = this.tproducte.getStockMinim() == tempproducte.getStockMinim();
		boolean so = this.tproducte.getStockOptim() == tempproducte.getStockOptim();
		
		assertTrue(n && d && i && u && c && sm && so);
	}
	
	private boolean isInteger(int num){
		try{
		Integer.parseInt(num + "");
		return true;
		}catch (Exception e) {
			return false;
		}
	}
	private boolean isFloat(float num){
		try{
		Float.parseFloat(num + "");
		return true;
		}catch (Exception e) {
			return false;
		}
	}

}
