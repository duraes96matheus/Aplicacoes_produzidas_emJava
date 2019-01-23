package Controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Coordenador;


public class CoordenadorjdbcDAO {
		
	private Connection conn;
	
	public CoordenadorjdbcDAO(Connection conn) {
		this.conn=conn;	
	
	}		public void salvar(Coordenador c) throws SQLException{
			String SQL="insert into Coordenadores (nome,professor,cargahoraria)values('"+c.getNome()+"','"+c.getId()+"','"+c.getCursosCoordenados()+"','"+c.getIDcurosCoordenados()+"')'";
			PreparedStatement prepareStatement=this.conn.prepareStatement(SQL);
			prepareStatement.executeUpdate();
			prepareStatement.close();		
			}
			public void alterar(Coordenador c) throws SQLException{
				String SQL = "update Coordenadores set nome='"+c.getNome()+"',CursosCoordenados='"+c.getCursosCoordenados()+"',IDCursosCoordenados='"+c.getIDcurosCoordenados()+"')'";
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
				public void deletar (Coordenador c) throws SQLException{
					String SQL ="DELETE FROM Coordenadores WHERE id = '"+c.getId()+"'";
					System.out.println(SQL);
					PreparedStatement prepareStatement = this.conn.prepareStatement(SQL);
					prepareStatement.executeUpdate();
					prepareStatement.close();
				}
				public List<Coordenador> listar() {
					String sql = "select * from alunos";
			        System.out.println(sql);		
			        List<Coordenador> coordenadores = new ArrayList<Coordenador>();
					try {
						PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
						ResultSet rs = prepareStatement.executeQuery();
						while(rs.next()) {
						 /* id = rs.getInt("id");
							String nome = rs.getString("nome");
							String endereco = rs.getString("endereco");
							String bairro = rs.getString("bairro");
							Alunos aluno = new Alunos();
							System.out.println();**/
						}
						prepareStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return coordenadores;
				}	

}
	

	

