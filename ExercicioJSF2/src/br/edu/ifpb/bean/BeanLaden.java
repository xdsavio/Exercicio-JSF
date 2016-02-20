package br.edu.ifpb.bean;

import br.edu.ifpb.Entidades.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@RequestScoped
@ManagedBean


public class BeanLaden {
	
			ArrayList<Usuario> usuario;
	

	public BeanLaden() {
		this.usuario = new ArrayList<Usuario>();
	}
	
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}



}


