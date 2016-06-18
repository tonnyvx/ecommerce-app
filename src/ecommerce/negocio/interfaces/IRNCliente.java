package ecommerce.negocio.interfaces;

import ecommerce.basicas.Cliente;

public interface IRNCliente {

	public void inserirValido(Cliente cliente);

	/**
	 * Verifica se o cliente existe no banco de dados e tenta remov�-lo.
	 * 
	 * @param cliente
	 *            Objeto do tipo Cliente.
	 */
	public void removerExistente(Cliente cliente);

	/**
	 * Verifica se o cliente existe no banco de dados.
	 * 
	 * @param cliente
	 *            Objeto do tipo Cliente.
	 * @return Retorna verdadeiro se o Cliente existir no banco de dados.
	 */

	public boolean verificaExistencia(Cliente cliente);

	/**
	 * Verifica se todos os campos obrigat�rios est�o preenchidos.
	 * 
	 * @param cliente
	 *            Objeto do tipo Cliente.
	 * @return Retorna verdadeiro se todos os campos obrigat�rios estiverem
	 *         preenchidos.
	 */
	public boolean validaObjeto(Cliente cliente);

	public boolean verficaLoginSenha(String login, String senha);
}
