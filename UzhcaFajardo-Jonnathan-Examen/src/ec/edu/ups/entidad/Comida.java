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
public class Comida  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private String  nombrePlato;
	private double precio;
	@ManyToOne()
	@JoinColumn(name = "Pedido_id")
	private Pedido pedido;
	
	
	
	
	public Comida() {
		super();
	}




	public Comida(int id, String codigo, String nombrePlato, double precio, Pedido pedido) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombrePlato = nombrePlato;
		this.precio = precio;
		this.pedido = pedido;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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




	public Pedido getPedido() {
		return pedido;
	}




	public void setPedido(Pedido ped) {
		this.pedido = ped;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Comida [id=" + id + ", codigo=" + codigo + ", nombrePlato=" + nombrePlato + ", precio=" + precio
				+ ", pedido=" + pedido + "]";
	}
	
	
	
	
	
}
