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
public class TarjetaCredito implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numeroTarjeta;
	private String nombreTitular;
	private String fechaCaducidad;
	private String cvv;
	
	@ManyToOne()
	@JoinColumn(name = "Pediod_id")
	private Pedido pedido;

	
	
	
	public TarjetaCredito() {
		
	}




	public TarjetaCredito(int id, String numeroTarjeta, String nombreTitular, String fechaCaducidad, String cvv,
			Pedido pedido) {
		super();
		this.id = id;
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
		this.pedido = pedido;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}




	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}




	public String getNombreTitular() {
		return nombreTitular;
	}




	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}




	public String getFechaCaducidad() {
		return fechaCaducidad;
	}




	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}




	public String getCvv() {
		return cvv;
	}




	public void setCvv(String cvv) {
		this.cvv = cvv;
	}




	public Pedido getPedido() {
		return pedido;
	}




	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "TarjetaCredito [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular
				+ ", fechaCaducidad=" + fechaCaducidad + ", cvv=" + cvv + ", pedido=" + pedido + "]";
	}

	
}

