
package modelo;

/**
 *
 * @author Yumi
 */
public interface Pagable {
    public Pago GenerarTransaccion(String Idpago, String codigoR, double Total, int Descuento, char FormaPago, double totalPagar);
    
}
