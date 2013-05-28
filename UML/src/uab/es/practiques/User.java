package uab.es.practiques;

import java.util.Collection;


public abstract class User{

	/**
	 * @uml.property  name="nom"
	 */
	private String nom;

	/**
	 * Getter of the property <tt>nom</tt>
	 * @return  Returns the nom.
	 * @uml.property  name="nom"
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter of the property <tt>nom</tt>
	 * @param nom  The nom to set.
	 * @uml.property  name="nom"
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @uml.property  name="cognom"
	 */
	private String cognom;

	/**
	 * Getter of the property <tt>cognom</tt>
	 * @return  Returns the cognom.
	 * @uml.property  name="cognom"
	 */
	public String getCognom() {
		return cognom;
	}

	/**
	 * Setter of the property <tt>cognom</tt>
	 * @param cognom  The cognom to set.
	 * @uml.property  name="cognom"
	 */
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	/**
	 * @uml.property  name="DNI"
	 */
	private String dni;

	/**
	 * Getter of the property <tt>DNI</tt>
	 * @return  Returns the dni.
	 * @uml.property  name="DNI"
	 */
	public String getDNI() {
		return dni;
	}

	/**
	 * Setter of the property <tt>DNI</tt>
	 * @param DNI  The dni to set.
	 * @uml.property  name="DNI"
	 */
	public void setDNI(String dni) {
		this.dni = dni;
	}

	/**
	 * @uml.property  name="userID"
	 */
	private String userID;

	/**
	 * Getter of the property <tt>userID</tt>
	 * @return  Returns the userID.
	 * @uml.property  name="userID"
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Setter of the property <tt>userID</tt>
	 * @param userID  The userID to set.
	 * @uml.property  name="userID"
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @uml.property  name="password"
	 */
	private String password;

	/**
	 * Getter of the property <tt>password</tt>
	 * @return  Returns the password.
	 * @uml.property  name="password"
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of the property <tt>password</tt>
	 * @param password  The password to set.
	 * @uml.property  name="password"
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @uml.property  name="telefon"
	 */
	private int telefon;

	/**
	 * Getter of the property <tt>telefon</tt>
	 * @return  Returns the telefon.
	 * @uml.property  name="telefon"
	 */
	public int getTelefon() {
		return telefon;
	}

	/**
	 * Setter of the property <tt>telefon</tt>
	 * @param telefon  The telefon to set.
	 * @uml.property  name="telefon"
	 */
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	/**
	 * @uml.property  name="compteBancari"
	 */
	private String compteBancari;

	/**
	 * Getter of the property <tt>compteBancari</tt>
	 * @return  Returns the compteBancari.
	 * @uml.property  name="compteBancari"
	 */
	public String getCompteBancari() {
		return compteBancari;
	}

	/**
	 * Setter of the property <tt>compteBancari</tt>
	 * @param compteBancari  The compteBancari to set.
	 * @uml.property  name="compteBancari"
	 */
	public void setCompteBancari(String compteBancari) {
		this.compteBancari = compteBancari;
	}

		
		/**
		 */
		public void getFactura(){
		}

			
			/**
			 */
			public void getUser(){
			}

				
				/**
				 */
				public void loginUser(){
				}

					
					/**
					 */
					public void registrarUser(){
					}

						
						/**
						 */
						public void setUser(){
						}

						/**
						 * @uml.property  name="factura1"
						 * @uml.associationEnd  multiplicity="(0 -1)" inverse="user:uab.es.practiques.Factura"
						 */
						private Collection<Factura> factura1;

						/**
						 * Getter of the property <tt>factura1</tt>
						 * @return  Returns the factura1.
						 * @uml.property  name="factura1"
						 */
						public Collection<Factura> getFactura1() {
							return factura1;
						}

						/**
						 * Setter of the property <tt>factura1</tt>
						 * @param factura1  The factura1 to set.
						 * @uml.property  name="factura1"
						 */
						public void setFactura1(Collection<Factura> factura1) {
							this.factura1 = factura1;
						}
	
	
	
}
