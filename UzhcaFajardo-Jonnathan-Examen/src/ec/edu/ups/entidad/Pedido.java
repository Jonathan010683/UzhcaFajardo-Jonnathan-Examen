package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numero;
	private String fecha;
	private String nombreCliente;
	private double subTotal;
	private double iva;
	private double total;
	private String observaciones;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comida> comidaPedido;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TarjetaCredito> tarjetaCredito;
	
	
	

	public Pedido() {
		
	}




	public Pedido(int id, String numero, String fecha, String nombreCliente, double subTotal, double iva, double total,
			String observaciones, List<Comida> comidaPedido, List<TarjetaCredito> tarjetaCredito) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subTotal = subTotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
		this.comidaPedido = comidaPedido;
		this.tarjetaCredito = tarjetaCredito;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public String getFecha() {
		return fecha;
	}




	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




	public String getNombreCliente() {
		return nombreCliente;
	}




	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}




	public double getSubTotal() {
		return subTotal;
	}




	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}




	public double getIva() {
		return iva;
	}




	public void setIva(double iva) {
		this.iva = iva;
	}




	public double getTotal() {
		return total;
	}




	public void setTotal(double total) {
		this.total = total;
	}




	public String getObservaciones() {
		return observaciones;
	}




	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}




	public List<Comida> getComidaPedido() {
		return comidaPedido;
	}




	public void setComidaPedido(List<Comida> comidaPedido) {
		this.comidaPedido = comidaPedido;
	}




	public List<TarjetaCredito> getTarjetaCredito() {
		return tarjetaCredito;
	}




	public void setTarjetaCredito(List<TarjetaCredito> tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente
				+ ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total + ", observaciones=" + observaciones
				+ ", comidaPedido=" + comidaPedido + ", tarjetaCredito=" + tarjetaCredito + "]";
	}
	
	

}
