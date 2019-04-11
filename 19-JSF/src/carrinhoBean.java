import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class carrinhoBean {
	
	private List<String> listaSelecionados;

	public List<Produto> getUsuarios(){
		List<Produto> produtos = new ArrayList<Produtos>();
		produtos.add(new Produto("F",1));
		produtos.add(new Produto("Eu",1));
		produtos.add(new Produto("Eu",1));
		
		return produtos;
		}
	
	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}	

}
