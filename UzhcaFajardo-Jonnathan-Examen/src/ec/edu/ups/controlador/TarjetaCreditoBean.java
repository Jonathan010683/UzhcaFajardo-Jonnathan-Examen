package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaCreditoFacade;

@Named(value="tarjetaCreditoBean")
@SessionScoped
public class TarjetaCreditoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private TarjetaCreditoFacade ejbTarjetaCreditoFacade;
	
	
	

	@PostConstruct
	public void init() {
		
	}

	
}
