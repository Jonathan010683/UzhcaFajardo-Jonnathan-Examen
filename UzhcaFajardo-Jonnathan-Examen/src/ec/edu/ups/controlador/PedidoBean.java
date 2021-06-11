package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.entidad.Comida;
import ec.edu.ups.entidad.Pedido;

@Named(value="pedidoBean")
@SessionScoped
public class PedidoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PedidoFacade ejbPedidoFacade;
	
	@EJB
	private ComidaFacade ejbComidaFacade;
	
	
	private String numero="12";
	private String fecha="11/06/2021";
	private String nombreCliente="jonathan";
	private double subTotal=12;
	private double iva=12;
	private double total=12;
	private String observaciones="no tiene observacion";
	
	
	private String codigo;
	private String  nombrePlato;
	private double precio;

	@PostConstruct
	public void init() {
		
	}

	public PedidoFacade getEjbPedidoFacade() {
		return ejbPedidoFacade;
	}

	public void setEjbPedidoFacade(PedidoFacade ejbPedidoFacade) {
		this.ejbPedidoFacade = ejbPedidoFacade;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public ComidaFacade getEjbComidaFacade() {
		return ejbComidaFacade;
	}

	public void setEjbComidaFacade(ComidaFacade ejbComidaFacade) {
		this.ejbComidaFacade = ejbComidaFacade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String guadarPedidoComida() {
		Pedido ped= new Pedido();
		Comida com=  new Comida();
		/*
		 * private String numero;
	private String fecha;
	private String nombreCliente;
	private double subTotal;
	private double iva;
	private double total;
	private String observaciones;
	
	private String codigo;
	private String  nombrePlato;
	private double precio;
	
	
	
		 */
		
		ped.setNumero(this.numero);
		ped.setFecha(this.fecha);
		ped.setNombreCliente(this.nombreCliente);
		ped.setSubTotal(this.subTotal);
		ped.setIva(this.iva);
		ped.setTotal(this.total);
		ped.setObservaciones(this.observaciones);
		
		System.out.println(this.numero);
		System.out.println(this.fecha);
		System.out.println(this.nombreCliente);
		System.out.println(this.subTotal);
		System.out.println(this.iva);
		System.out.println(this.total);
		System.out.println(this.observaciones);
		ejbPedidoFacade.create(ped);
	return null;
		
	}

	@Override
	public String toString() {
		return "PedidoBean [ejbPedidoFacade=" + ejbPedidoFacade + ", ejbComidaFacade=" + ejbComidaFacade + ", numero="
				+ numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", subTotal=" + subTotal + ", iva="
				+ iva + ", total=" + total + ", observaciones=" + observaciones + ", codigo=" + codigo
				+ ", nombrePlato=" + nombrePlato + ", precio=" + precio + "]";
	}
	
	
}
