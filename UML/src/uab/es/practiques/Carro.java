package uab.es.practiques;

import java.util.Collection;




public class Carro {

	/**
		 */
		public void AfegirLineaCompra(){
		}

			
			/**
			 */
			public void EliminarLineaCompra(){
			}

				
				/**
				 */
				public void ModificarLineaCompra(){
				}


				/**
				 * @uml.property  name="factura"
				 * @uml.associationEnd  inverse="carro:uab.es.practiques.Factura"
				 */
				private Factura factura;

				/**
				 * Getter of the property <tt>factura</tt>
				 * @return  Returns the factura.
				 * @uml.property  name="factura"
				 */
				public Factura getFactura() {
					return factura;
				}

				/**
				 * Setter of the property <tt>factura</tt>
				 * @param factura  The factura to set.
				 * @uml.property  name="factura"
				 */
				public void setFactura(Factura factura) {
					this.factura = factura;
				}


				/**
				 * @uml.property  name="lineaCompra"
				 * @uml.associationEnd  inverse="carro:uab.es.practiques.LineaCompra"
				 */
				private LineaCompra lineaCompra;

				/**
				 * Getter of the property <tt>lineaCompra</tt>
				 * @return  Returns the lineaCompra.
				 * @uml.property  name="lineaCompra"
				 */
				public LineaCompra getLineaCompra() {
					return lineaCompra;
				}

				/**
				 * Setter of the property <tt>lineaCompra</tt>
				 * @param lineaCompra  The lineaCompra to set.
				 * @uml.property  name="lineaCompra"
				 */
				public void setLineaCompra(LineaCompra lineaCompra) {
					this.lineaCompra = lineaCompra;
				}


				/** 
				 * @uml.property name="lineaCompra1"
				 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="carro:uab.es.practiques.LineaCompra"
				 */
				private Collection<LineaCompra> lineaCompra1;

				/** 
				 * Getter of the property <tt>lineaCompra1</tt>
				 * @return  Returns the lineaCompra1.
				 * @uml.property  name="lineaCompra1"
				 */
				public Collection<LineaCompra> getLineaCompra1() {
					return lineaCompra1;
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
				 * Setter of the property <tt>lineaCompra1</tt>
				 * @param lineaCompra1  The lineaCompra1 to set.
				 * @uml.property  name="lineaCompra1"
				 */
				public void setLineaCompra1(Collection<LineaCompra> lineaCompra1) {
					this.lineaCompra1 = lineaCompra1;
				}

	
}
