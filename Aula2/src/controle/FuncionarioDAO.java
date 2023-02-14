package controle;

import java.util.ArrayList;

public class FuncionarioDAO {

	private static ArrayList<Funcionario> listaFuncionarios;
	
	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList();
	}
	
	
	public boolean inserir(Funcionario func) {
		
		return false;
	}
	
	public ArrayList<Funcionario> listar(){
		return listaFuncionarios;
	}


	public static FuncionarioDAO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
