package org.uab.etse.es.ES00;

import java.util.Collection;
import java.util.HashSet;

import junit.framework.TestCase;

public class TestLiniaCompra extends TestCase { 
	
	private LiniaCompra tliniaCompra = null;
	private final int unitat = 5;
	private final String IDLinea = "1";
	private final Compra compra = new Compra();
	
	protected void setUp() throws Exception {
		super.setUp();
		if(this.tliniaCompra == null){
			this.tliniaCompra = new LiniaCompra(this.unitat,this.IDLinea);
			this.tliniaCompra.setCompra(compra);
		}
	}
	
	public final void testGetProducte(){
		assertTrue(this.tliniaCompra.getProducte().equals(GestionarCompres.getInstancia().getCataleg().GetProd(this.IDLinea)));	
	}
	
	public final void testSetProducte(){
		this.tliniaCompra.setProducte(GestionarCompres.getInstancia().getCataleg().GetProd("2"));
		assertTrue(this.tliniaCompra.getProducte().equals(GestionarCompres.getInstancia().getCataleg().GetProd("2")));
	}
	
	public final void testGetCompra(){
		assertTrue(this.tliniaCompra.getCompra().equals(this.compra));
	}
	
	public final void testSetCompra(){
		Client setClient = new Client();
		Collection<LiniaCompra> setLiniaCompra = new HashSet<LiniaCompra>();
		setLiniaCompra.add(this.tliniaCompra);
		Compra setCompra = new Compra(setLiniaCompra, 25, "1", setClient);
		this.tliniaCompra.setCompra(setCompra);
		assertTrue(this.tliniaCompra.getCompra().equals(setCompra));
	}
	
	public final void testGetUnitats() {
		assertTrue(this.tliniaCompra.getUnitats() == this.unitat);
	}
	
	public final void testSetUnitats() {
		this.tliniaCompra.setUnitats(10);
		assertTrue(this.tliniaCompra.getUnitats()==10);
	}
	
	public final void testGetIdLineaCompra() {
		assertTrue(this.tliniaCompra.getIdLineaCompra().equals(this.IDLinea));
	}
	
	public final void testsetIdLineaCompra() {
		this.tliniaCompra.setIdLineaCompra("45");
		assertTrue(this.tliniaCompra.getIdLineaCompra().equals("45"));
	}
	
	public final void testGetPreu(){
		assertTrue(this.tliniaCompra.GetPreu() == this.unitat * GestionarCompres.getInstancia().getCataleg().GetProd(this.IDLinea).getCost());
	}
	
}