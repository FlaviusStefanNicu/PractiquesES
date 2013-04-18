/**
 * @author ES-2012.Practiques
 */

package org.uab.etse.es.ES00;

import junit.framework.TestCase;
import java.io.*;
import java.util.*;

public class TestCataleg extends TestCase {

	private final String catalegFilename = "catalegtest.txt";
	private final String initialValues="";
	
	private Vector names;
	private Vector description;
	private Vector prizes;
	
	private void createInitialValues(){
		names = new Vector();
		description = new Vector();
		prizes = new Vector();
		names.add("TVPlasma32"); prizes.add(new Float(500.99f)); description.add("Televisió Plasma 32");
		names.add("TVPlasma24"); prizes.add(new Float(199.99f)); description.add("Televisió Plasma 24");
		names.add("TVPlasma50"); prizes.add(new Float(1450.99f)); description.add("Televisió Plasma 50");
		
	}
	/** Mock Object to test, used to produce a controlled storage file*/
	private class CatalegMock extends Cataleg {
		protected String StorageFilename(){
			return catalegFilename;
		}
	}

	/** Cataleg instance under test */
	private Cataleg tcataleg;
	
	/** 
	 * Test Configuration.
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		createInitialValues();
		
		// Fill a catalog file with known information.

		String initialValues = "";
		for (int i=0; i < names.size(); i++){
			initialValues = initialValues + names.get(i)+"-00"+i+"-10-"
				+prizes.get(i)+"-10-5-"+description.get(i)+"\r";
		}

		FileWriter fr;
		BufferedWriter ficheroRegistro;
		try {
			fr = new FileWriter(new File(catalegFilename), true);
			ficheroRegistro = new BufferedWriter(fr);
			ficheroRegistro.append(initialValues);
			ficheroRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tcataleg = new CatalegMock();
	}

	public void tearDown() throws Exception {
		super.tearDown();
		File f = new File(catalegFilename);
		f.delete();
    }


	public final void testGetProducte() {
		assertTrue(tcataleg.getProducte() != null);
		
		Collection<Producte> c = tcataleg.getProducte();
		
		assertTrue(c.size() == 3);
		Iterator i = c.iterator();

		testProducteIterator(i);
	}

	public final void testProducteIterator() {
		testProducteIterator(tcataleg.producteIterator());
	}

	public final void testIsProducteEmpty() {
		assertFalse(tcataleg.isProducteEmpty());
		assertTrue(tcataleg.producteSize() == 3);
		tcataleg.clearProducte();
		assertTrue(tcataleg.isProducteEmpty());
		assertTrue(tcataleg.producteSize() == 0);
	}

	public final void testContainsProducte() {
		Collection<Producte> c = tcataleg.getProducte();
		
		Iterator i = c.iterator();

		while (i.hasNext()){
			Producte p = (Producte)i.next();
			assertTrue(tcataleg.containsProducte(p));
		}
		
		Producte p2 = new Producte();
		assertFalse(tcataleg.containsProducte(p2));
	}

	public final void testContainsAllProducte() {
		Collection<Producte> c = tcataleg.getProducte();
		assertTrue(tcataleg.containsAllProducte(c));
	}

	public final void testProducteSize() {
		assertTrue(tcataleg.producteSize() == 3);
	}

	public final void testAddProducte() {
		Producte p2 = new Producte();
		tcataleg.addProducte(p2);

		assertTrue(tcataleg.producteSize() == 4);

		assertTrue(tcataleg.containsProducte(p2));
	}

	public final void testSetProducte() {
		fail("Not yet implemented");
	}

	public final void testRemoveProducte() {
		Producte p2 = new Producte();
		tcataleg.addProducte(p2);

		assertTrue(tcataleg.producteSize() == 4);

		assertTrue(tcataleg.containsProducte(p2));
		tcataleg.removeProducte(p2);

		assertTrue(tcataleg.producteSize() == 3);

        Collection<Producte> c = tcataleg.getProducte();
		
		assertTrue(c.size() == 3);
		Iterator i = c.iterator();

		testProducteIterator(i);
	}

	public final void testClearProducte() {
		tcataleg.clearProducte();
		
		assertTrue(tcataleg.producteSize() == 0);
	}

	public final void testAfegirProducte() {
		tcataleg.clearProducte();
		
		for (int i=0; i < names.size(); i++){
			tcataleg.AfegirProducte(names.get(i).toString(), "000", 10, (Float)prizes.get(i), 10, 5, description.get(i).toString());
		}
		
        Collection<Producte> c = tcataleg.getProducte();
		
		assertTrue(c.size() == 3);
		Iterator i = c.iterator();
		testProducteIterator(i);
	}

	public final void testModificarProducte() {
		Collection<Producte> c = tcataleg.getProducte();
		
		Iterator i = c.iterator();

		Producte p = (Producte)i.next();

		names.removeElementAt(0);
		prizes.removeElementAt(0);
		description.removeElementAt(0);
		
		names.add("TVPlasma40"); 
		prizes.add(new Float(501.99f)); 
		description.add("Televisió Plasma 32");

		tcataleg.ModificarProducte(p, names.get(2).toString(), p.getIdProducte(), p.getUnitats(), (Float)prizes.get(2), 
				p.getStockOptim(), p.getStockMinim(), p.getDescripcio());
		
		i = c.iterator();
		testProducteIterator(i);
}

	public final void testEliminarProducte() {

		assertTrue(tcataleg.EliminarProducte("001"));

		assertTrue(tcataleg.producteSize() == 2);

		Collection<Producte> c = tcataleg.getProducte();
		Iterator i = c.iterator();

		Producte p = (Producte)i.next();

		assertTrue(p.getNombre().equals(names.get(0)));
		assertTrue(p.getCost() == (Float)prizes.get(0));
		assertTrue(p.getDescripcio().equals(description.get(0)));

		p = (Producte)i.next();

		assertTrue(p.getNombre().equals(names.get(2)));
		assertTrue(p.getCost() == (Float)prizes.get(2));
		assertTrue(p.getDescripcio().equals(description.get(2)));
		
		assertTrue(tcataleg.EliminarProducte("000"));
	}


	/** Helper method for tests */
	private void testProducteIterator(Iterator i) {
		int idx = 0;
		while (i.hasNext()){
			Producte p = (Producte)i.next();
			assertTrue(p.getNombre().equals(names.get(idx)));
			assertTrue(p.getCost() == (Float)prizes.get(idx));
			assertTrue(p.getDescripcio().equals(description.get(idx)));
			idx ++;
		}	
	}
}
