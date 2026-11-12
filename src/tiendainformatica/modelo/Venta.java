
package tiendainformatica.modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Venta {

    private int idVenta;
    private String numeroFactura;
    private Timestamp fecha;
    private String nombreCliente;
    private String nombreUsuario;
    private String nombreMetodoPago;
    private BigDecimal total;

    public Venta(int idVenta, String numeroFactura,
            Timestamp fecha, String nombreCliente,
            String nombreUsuario, String nombreMetodoPago,
            BigDecimal total) {

        this.idVenta = idVenta;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.nombreUsuario = nombreUsuario;
        this.nombreMetodoPago = nombreMetodoPago;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    public BigDecimal getTotal() {
        return total;
    }
    
}
