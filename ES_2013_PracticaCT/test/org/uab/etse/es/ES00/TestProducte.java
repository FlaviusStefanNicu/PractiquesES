package org.uab.etse.es.ES00;

import junit.framework.TestCase;

public class TestProducte extends TestCase {

	private Producte tproducte = null;
	private final String nombre = "nom";
	private final String idProducte ="55";
	private final int unitats = 20;
	private final float cost = 4.5f;
	private final int stockOptim = 3;
	private final int stockMinim = 6;
	private final String descripcio = "esto es una prova";
	
	protected void setUp() throws Exception {
		super.setUp();
		if(this.tproducte == null){
			this.tproducte = new Producte(this.nombre, this.idProducte, this.unitats, this.cost, this.stockOptim, this.stockMinim, this.descripcio);
		}
	}

	public final void testGetNombre() {
		assertTrue(tproducte.getNombre().equals(nombre));
	}

	public final void testSetNombre() {
		this.tproducte.setNombre("");
		assertTrue(this.tproducte.getNombre().equals(""));
	}

	public final void testGetIdProducte() {
		assertTrue(this.tproducte.getIdProducte().equals(idProducte));
	}

	public final void testSetIdProducte() {
		this.tproducte.setIdProducte("");
		assertTrue(this.tproducte.getIdProducte().equals(""));
	}

	public final void testGetUnitats() {
		assertTrue(this.tproducte.getUnitats() == unitats);
	}

	public final void testSetUnitats() {
		int n = 100;
		this.tproducte.setUnitats(n);
		assertTrue( this.tproducte.getUnitats() == n);
		
	}

	public final void testGetCost() {
		assertTrue(this.tproducte.getCost() == cost);
	}

	public final void testSetCost() {
		this.tproducte.setCost(0);
		assertTrue(this.tproducte.getCost() == 0);
	}

	public final void testGetStockOptim() {
		assertTrue(this.tproducte.getStockOptim() == stockOptim);
	}

	public final void testSetStockOptim() {
		this.tproducte.setStockOptim(0);
		assertTrue(this.tproducte.getStockOptim() == 0);
	}

	public final void testGetStockMinim() {
		assertTrue(this.tproducte.getStockMinim() == stockMinim);
	}

	public final void testSetStockMinim() {
		this.tproducte.setStockMinim(0);
		assertTrue(this.tproducte.getStockMinim() == 0);
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

	public final void testProducteStringStringIntFloatIntIntString() {
		assertTrue(this.tproducte.getNombre() instanceof String);
		assertTrue(this.tproducte.getIdProducte() instanceof String);		
		assertTrue(isInteger(this.tproducte.getUnitats()));
		assertTrue(isFloat(this.tproducte.getCost()));
		assertTrue(isInteger(this.tproducte.getStockMinim()));
		assertTrue(isInteger(this.tproducte.getStockOptim()));
		assertTrue(this.tproducte.getDescripcio() instanceof String);		
		
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

	public final void testGetDescripcio() {
		assertTrue(this.tproducte.getDescripcio().equals(this.descripcio));
	}

	public final void testSetDescripcio() {
		this.tproducte.setDescripcio("");
		assertTrue(this.tproducte.getDescripcio().equals(""));
	}

}
