package Controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Curso;

public class CursoJdbcDao {
	private Connection conn;
	
	public CursoJdbcDao(Connection conn) {
		this.conn=conn;
	}
	public void salvar(Curso c) throws SQLException{
	String SQL="insert into cursos(nome,professor,cargahoraria)values('"+c.getNome()+"','"+c.getProfessor()+"','"+c.getProfessor()+"')'";
	PreparedStatement prepareStatement=this.conn.prepareStatement(SQL);
	prepareStatement.executeUpdate();
	prepareStatement.close();		
	}
	public void alterar(Curso c) throws SQLException{
		String SQL = "update cursos set nome='"+c.getNome()+"',CargaHoraria='"+c.getCargahoraria()+"',Professor='"+c.getProfessor()+"';";
		System.out.println(SQL);
		PreparedStatement prepareStatement;
		try {
			prepareStatement = this.conn.prepareStatement(SQL);
			prepareStatement.executeUpdate();
	        prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
		public void deletar (Curso c) throws SQLException{
			String SQL ="DELETE FROM cursos WHERE id = '"+c.getIdCurso()+"'";
			System.out.println(SQL);
			PreparedStatement prepareStatement = this.conn.prepareStatement(SQL);
			prepareStatement.executeUpdate();
			prepareStatement.close();
		}
		public List<Curso> listar(){
			String SQL = "select * from cursos";
			System.out.println(SQL);
			List<Curso> cursos = new ArrayList<Curso>();
			try {
				PreparedStatement prepareStatement = this.conn.prepareStatement(SQL);
				ResultSet rs = prepareStatement.executeQuery();
				while(rs.next()) {
					int IdCurso = rs.getInt("idCuros");
					String nome = rs.getString("nome");
					
					System.out.println();					
				
				}
				prepareStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return cursos;
			
		}
		
	}
	
	


