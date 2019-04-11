import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {

	private List<String> listaSelecionados;
	private List<String> listaSelecionados2;

	public void salvar() {
		for(String item : listaSelecionados2) {
			System.out.println(item);
		}
		for(String item : listaSelecionados) {
			System.out.println(item);
		}
	}
	
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Eu",1));
		usuarios.add(new Usuario("Voce",2));
		usuarios.add(new Usuario("ADAAW",3));
		return usuarios;
		}
	
	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}
	
	public List<String> getListaSelecionados2() {
		return listaSelecionados2;
	}

	public void setListaSelecionados2(List<String> listaSelecionados2) {
		this.listaSelecionados2 = listaSelecionados2;
	}

	public CadastroBean(List<String> listaSelecionados, List<String> listaSelecionados2) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.listaSelecionados2 = listaSelecionados2;
	}

	public CadastroBean() {
		super();
	}
	
	
}
