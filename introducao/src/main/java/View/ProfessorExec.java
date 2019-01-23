package View;

import java.sql.Connection;


import Controler.JdbUtil;
import Controler.ProfessoresjdbcDAO;
import Model.Professor;

public class ProfessorExec {
	

	public static void main(String[] args) {
		Professor professores = new Professor();
		try {
			
			professores.setNomeProfessor("");
			professores.setEndereco("");
			professores.setSexo("");
	
			Connection connection = JdbUtil.getConnection();
			ProfessoresjdbcDAO  ProfessoresjdbcDAO = new ProfessoresjdbcDAO(connection);
			
			ProfessoresjdbcDAO.salvar(professores);
			//alunosJdbcDao.listar();
			//alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.deletar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
