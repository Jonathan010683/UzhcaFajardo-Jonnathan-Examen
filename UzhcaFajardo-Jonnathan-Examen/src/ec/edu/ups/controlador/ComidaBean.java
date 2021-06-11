package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.entidad.Comida;

@Named(value="comidaBean")
@SessionScoped
public class ComidaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ComidaFacade ejbComidaFacade;
	
	private String codigo;
	private String  nombrePlato;
	private double precio;
	

	@PostConstruct
	public void init() {
		
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void guardarComida() {
		
		Comida com = new Comida();
		
		
		com.setCodigo(String.valueOf(ejbComidaFacade.generarCodigo()));
		com.setNombrePlato(this.nombrePlato);
		com.setPrecio(this.precio);
		//com.setPedido(ped);
		ejbComidaFacade.create(com);
	}
	
}
