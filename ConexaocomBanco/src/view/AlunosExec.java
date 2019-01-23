package view;

import java.sql.Connection;

import controller.AlunosjdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			alunos.setNome("Matheus Durães da Silva");
			alunos.setEndereco("Rua Catléias,n°48");
			alunos.setBairro("Pantanal");
			alunos.setCep(3811111);
			
	
			Connection connection = JdbUtil.getConnection();
			AlunosjdbcDAO alunosJdbcDao = new AlunosjdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.listar();
			//alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.deletar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
