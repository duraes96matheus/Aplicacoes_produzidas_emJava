package Aula1408;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.sql.Connection;


import Controler.JdbUtil;
import Controler.ProfessoresjdbcDAO;
import Model.Professor;


public class NovoProfessor extends JFrame {
	
		
		JLabel lblnome = new  JLabel("Nome:");
		JLabel lblendereco = new JLabel("Endereço :");
		JLabel lblsexo = new JLabel("Professor:");
		
		JTextField  txtnome = new JTextField();
		JTextField  txtendereco = new JTextField();
		JTextField  txtsexo = new JTextField();		
		
		JButton  btnSalvar = new JButton ("Gravar");
		
		
		public NovoProfessor()  {                  // Definindo parametros da Classe
			super("Novo Professor");		
		
		Container paine = this.getContentPane();
		paine.setLayout(null);	
		
		paine.add(lblnome);
		lblnome.setBounds(10, 15, 45, 30);
		paine.add(txtnome);
		txtnome.setBounds(90, 15, 255, 30);
		
		paine.add(lblendereco);
		lblendereco.setBounds(10, 50, 70, 30);
		paine.add(txtendereco);
		txtendereco.setBounds(90, 50, 255,30);		

		paine.add(lblsexo);
		lblsexo.setBounds(10,85,110,30);
		paine.add(txtsexo);
		txtsexo.setBounds(90,85,255,30);
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(90, 120, 130, 50);
		
		btnSalvar.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				try {
					Professor professor = new Professor();
					professor.setNomeProfessor(txtnome.getText());
					professor.setEndereco(txtendereco.getText());
					professor.setSexo(txtsexo.getText());
				
					
					Connection connection = JdbUtil.getConnection();
					ProfessoresjdbcDAO professoresjdbcDAO = new ProfessoresjdbcDAO(connection);
					professoresjdbcDAO.salvar(professor);					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		
				this.setResizable(true);               					 // Possivel redimensionar com o mouse
				this.setVisible(true);				 					 //  Se é visivel 
				this.setSize(600, 300);			    				 	 //  Tamanho da Janela5
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Corta a execusão até em 2°plano	
			}

		    public static void main( String[] args )
		    {
		       NovoProfessor novoprofessor = new NovoProfessor();
		       
		    }
	
}
		