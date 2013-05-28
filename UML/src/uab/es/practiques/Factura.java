package uab.es.practiques;

/**
 * @uml.dependency   supplier="uab.es.practiques.User"
 */
public class Factura {

	/**
	 * @uml.property  name="data"
	 */
	private String data;

	/**
	 * Getter of the property <tt>data</tt>
	 * @return  Returns the data.
	 * @uml.property  name="data"
	 */
	public String getData() {
		return data;
	}

	/**
	 * Setter of the property <tt>data</tt>
	 * @param data  The data to set.
	 * @uml.property  name="data"
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @uml.property  name="Import"
	 */
	private float import1;

	/**
	 * Getter of the property <tt>Import</tt>
	 * @return  Returns the import1.
	 * @uml.property  name="Import"
	 */
	public float getImport() {
		return import1;
	}

	/**
	 * Setter of the property <tt>Import</tt>
	 * @param Import  The import1 to set.
	 * @uml.property  name="Import"
	 */
	public void setImport(float import1) {
		this.import1 = import1;
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
		 */
		public void GenerarPDF(){
		}

			
			/**
			 */
			public void VeureFactura(){
			}

			/**
			 * @uml.property  name="carro"
			 * @uml.associationEnd  inverse="factura:uab.es.practiques.Carro"
			 */
			private Carro carro;

			/**
			 * Getter of the property <tt>carro</tt>
			 * @return  Returns the carro.
			 * @uml.property  name="carro"
			 */
			public Carro getCarro() {
				return carro;
			}

			/**
			 * Setter of the property <tt>carro</tt>
			 * @param carro  The carro to set.
			 * @uml.property  name="carro"
			 */
			public void setCarro(Carro carro) {
				this.carro = carro;
			}

			/**
			 * @uml.property  name="compraID"
			 */
			private String compraID;

			/**
			 * Getter of the property <tt>compraID</tt>
			 * @return  Returns the compraID.
			 * @uml.property  name="compraID"
			 */
			public String getCompraID() {
				return compraID;
			}

			/**
			 * Setter of the property <tt>compraID</tt>
			 * @param compraID  The compraID to set.
			 * @uml.property  name="compraID"
			 */
			public void setCompraID(String compraID) {
				this.compraID = compraID;
			}

			/**
			 * @uml.property  name="user"
			 * @uml.associationEnd  inverse="factura1:uab.es.practiques.User"
			 */
			private User user;

			/**
			 * Getter of the property <tt>user</tt>
			 * @return  Returns the user.
			 * @uml.property  name="user"
			 */
			public User getUser() {
				return user;
			}

			/**
			 * Setter of the property <tt>user</tt>
			 * @param user  The user to set.
			 * @uml.property  name="user"
			 */
			public void setUser(User user) {
				this.user = user;
			}
	
	
	
}
