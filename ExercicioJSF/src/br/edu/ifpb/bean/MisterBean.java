package br.edu.ifpb.bean;
import br.edu.ifpb.entidade.MaskChange;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@RequestScoped
@ManagedBean
public class MisterBean {
	
	private MaskChange reverses;
	
	String suporte;
	
	public MisterBean(){
		this.reverses = new MaskChange();
	}

	public MaskChange getReverses() {
		return reverses;
	}

	public void setReverses(MaskChange reverses) {
		this.reverses = reverses;
	}
	
	public String trocar(){
		
		
		suporte = reverses.getCampo1();
		reverses.setCampo1(reverses.getCampo2());
		reverses.setCampo2(suporte);		
		
		return null;
	}
	
}
