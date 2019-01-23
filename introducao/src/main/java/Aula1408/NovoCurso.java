package Aula1408;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Container;
import java.sql.Connection;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controler.CursoJdbcDao;
import Controler.JdbUtil;
import Model.Curso;

public class NovoCurso extends JFrame {
		
		JLabel lblnome = new  JLabel("Nome:");
		JLabel lblcargahoraria = new JLabel("Carga Horaria:");
		JLabel lblprofessor = new JLabel("Professor:");
		
		
		JTextField  txtnome = new JTextField();
		JTextField  txtcargahoraria = new JTextField();
		JTextField  txtprofessor = new JTextField();		
		
		JButton  btnSalvar = new JButton ("Gravar");

		
		public NovoCurso() {                 
			super("Novo Curso");
			
			Container paine = this.getContentPane();
			paine.setLayout(null);	
			
			paine.add(lblnome);
			lblnome.setBounds(10, 15, 45, 30);
			paine.add(txtnome);
			txtnome.setBounds(100, 15, 255, 30);
			
			paine.add(lblcargahoraria);
			lblcargahoraria.setBounds(10, 50, 90, 30);
			paine.add(txtcargahoraria);
			txtcargahoraria.setBounds(100, 50, 255,30);			

			paine.add(lblprofessor);
			lblprofessor.setBounds(10,85,110,30);
			paine.add(txtprofessor);
			txtprofessor.setBounds(100,85,255,30);
			
			paine.add(btnSalvar);
			btnSalvar.setBounds(90, 130, 130, 50);
			
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Curso cursos = new Curso();
						cursos.setNome(txtnome.getText());
						cursos.setCargahoraria(txtcargahoraria.getText());
						cursos.setProfessor(txtprofessor.getText());
					
						
						Connection connection = JdbUtil.getConnection();
						CursoJdbcDao CursoJdbcDao = new CursoJdbcDao(connection);
						CursoJdbcDao.salvar(cursos);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					
				}
			});		
		
		
	
		this.setResizable(true);               					 // Possivel redimensionar com o mouse
		this.setVisible(true);				 					 //  Se é visivel 
		this.setSize(600, 300);			    				 	 //  Tamanho da Janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Corta a execusão até em 2°plano
	}
		
		public static void main( String[] args ) {
			NovoCurso novocurso = new NovoCurso();
		}
		  
	

}
