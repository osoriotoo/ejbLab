package managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.example.LancadorDeDadoBean;

/**
 * @author tosorio
 *
 */

@ManagedBean
public class DadoMB {
	
	@EJB
	private LancadorDeDadoBean lancadorDeDadoBean;
	
	private int resultado;
	
	public void lancaDado(){
		
		resultado = this.lancadorDeDadoBean.lanca();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	

}
