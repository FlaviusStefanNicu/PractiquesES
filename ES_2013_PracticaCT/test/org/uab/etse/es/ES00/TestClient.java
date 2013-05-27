/**
 * @author ES-2012.Practiques
 */
package org.uab.etse.es.ES00;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

public class TestClient extends TestCase {
	
	/** Client instance under test */
	private Client tclient;
	
	/** Expected Client information*/
	private final String tidclient = "1234";
	private final String tdni = "53549411S";
	private final String tnom = "Juan";
	private final String tcognom = "Soldevila";
	private final String tpassword = "JuanSOLde#Vila";
	private final String ttelefon = "938663452";
	private final String tcomptebancari = "1234-22-34-34556";

	/** 
	 * Test Configuration.
	 */
	protected void setUp() throws Exception {
		super.setUp();

		this.tclient = new Client(this.tidclient, this.tdni, this.tnom, this.tcognom, 
				this.tpassword, this.ttelefon, this.tcomptebancari);
	
		testDefaultClient();
		testFull();
		testModifiers();
		testIdentificar();
		testCompra();
	}

	/** 
	 * Test clients built with default constructor
	 */
	public void testDefaultClient(){
		Client client = new Client();
		assertTrue(client.getNom().equals(""));
		assertTrue(client.getCognom().equals(""));
		assertTrue(client.getIdClient().equals(""));
		assertTrue(client.getDNI().equals(""));
		assertTrue(client.getPassword().equals(""));
		assertTrue(client.getTelefon().equals(""));
		assertTrue(client.getCompteBancari().equals(""));
		assertTrue(client.getCompra() == null);
	}

	/** 
	 * Test clients built with overwritten constructor with full information
	 */
	public void testFull(){
		assertTrue(this.tclient.getNom().equals(this.tnom));
		assertTrue(this.tclient.getCognom().equals(this.tcognom));
		assertTrue(this.tclient.getIdClient().equals(this.tidclient));
		assertTrue(this.tclient.getDNI().equals(this.tdni));
		assertTrue(this.tclient.getPassword().equals(this.tpassword));
		assertTrue(this.tclient.getTelefon().equals(this.ttelefon));
		assertTrue(this.tclient.getCompteBancari().equals(this.tcomptebancari));
	}

	/** 
	 * Test clients modifiers and check that not indirect modifications are present
	 */
	public void testModifiers(){
		final String tString = "blabla";
		
		this.tclient.setNom(tString);
		assertTrue(this.tclient.getNom().equals(tString));

		// Restore and full check
		this.tclient.setNom(this.tnom);
		testFull();

		this.tclient.setCognom(tString);
		assertTrue(this.tclient.getCognom().equals(tString));

		// Restore and full check
		this.tclient.setCognom(this.tcognom);
		testFull();

		this.tclient.setIdClient(tString);
		assertTrue(this.tclient.getIdClient().equals(tString));

		// Restore and full check
		this.tclient.setIdClient(this.tidclient);
		testFull();
		
		this.tclient.setDNI(tString);
		assertTrue(this.tclient.getDNI().equals(tString));

		// Restore and full check
		this.tclient.setDNI(this.tdni);
		testFull();

		this.tclient.setPassword(tString);
		assertTrue(this.tclient.getPassword().equals(tString));

		// Restore and full check
		this.tclient.setPassword(this.tpassword);
		testFull();

		this.tclient.setTelefon(tString);
		assertTrue(this.tclient.getTelefon().equals(tString));

		// Restore and full check
		this.tclient.setTelefon(this.ttelefon);
		testFull();

		this.tclient.setCompteBancari(tString);
		assertTrue(this.tclient.getCompteBancari().equals(tString));

		// Restore and full check
		this.tclient.setCompteBancari(this.tcomptebancari);
		testFull();
	}

	/** 
	 * Test clients identification
	 */
	public void testIdentificar(){
		assertTrue(this.tclient.Identificarse(this.tidclient, this.tpassword));
		assertFalse(this.tclient.Identificarse(this.tidclient, this.tcognom));
		assertFalse(this.tclient.Identificarse(this.tcognom, this.tpassword));
		assertFalse(this.tclient.Identificarse(this.tcognom, this.tcognom));
		}

	/** 
	 * Test clients "compra" methods
	 */
	public void testCompra(){
		Collection<Compra> compra = new ArrayList<Compra>();
		tclient.setCompra(compra);
		assertTrue(this.tclient.getCompra().equals(compra));
		tclient.setCompra(null);
		assertTrue(this.tclient.getCompra() == null);
		}
}
