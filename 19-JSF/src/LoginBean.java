import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;
	
	public void logar() {
		
		if("felipet".equals(getLogin())&& "1234".equals(getSenha())) {
			System.out.println("Usuário logado: "+ getLogin());
		}
		else {
			System.out.println("Usuário não localizado");
		}
		System.out.println("CheckBox Conectado: " + termo);
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}
	
	public LoginBean() {
		super();
	}
	
	
	
}
