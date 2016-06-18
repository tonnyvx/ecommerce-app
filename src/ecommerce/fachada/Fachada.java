package ecommerce.fachada;

import ecommerce.basicas.Cliente;
import ecommerce.basicas.Produto;
import ecommerce.negocio.RNCliente;
import ecommerce.negocio.RNProduto;

public class Fachada {

	// ------------- M�todos do PRODUTO --------------

	public void incluirProduto(Produto produto) {
		RNProduto rn = new RNProduto();
		rn.inserirValido(produto);
	}

	
	
	// ------------- M�todos do Cliente --------------
	
	public void incluirCliente (Cliente cliente){
		RNCliente rn = new RNCliente();
		rn.inserirValido(cliente);
	}
	
	public void excluirCliente (Cliente cliente){
		RNCliente rn = new RNCliente();
		rn.removerExistente(cliente);
	}
}
