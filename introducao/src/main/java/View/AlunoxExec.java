package View;

import java.sql.Connection;



import Controler.AlunosjdbcDAO;
import Controler.JdbUtil;
import Model.Alunos;

public class AlunoxExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			alunos.setNome("Matheus Durães da Silva");
			alunos.setEndereco("Rua Catléias,n°48");
			alunos.setBairro("Pantanal");
			alunos.setCep("3811111");
			
	
			Connection connection = JdbUtil.getConnection();
			AlunosjdbcDAO alunosJdbcDao = new AlunosjdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.listar();
			alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.deletar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

