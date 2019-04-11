import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MainTest {

	public static void main(String[] args) {
		Client client = Client.create();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto:");
		int codigo = entrada.nextInt();
		WebResource resource = client.resource("http://localhost:8080/LojaApp/rest/produto/");
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (response.getStatus() == 200) {
			ProdutoTO produtoTO = response.getEntity(ProdutoTO.class);
			System.out.println(produtoTO.getCodigo());
			System.out.println(produtoTO.getDescricao());
			System.out.println(produtoTO.getPreco());
			System.out.println(produtoTO.getQuantidade());
			
			
		} else {
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}

	}
	
}
