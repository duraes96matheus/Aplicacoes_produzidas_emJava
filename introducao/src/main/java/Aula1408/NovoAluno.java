package Aula1408;

import java.awt.Container;
import java.awt.TextField;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controler.AlunosjdbcDAO;
import Controler.JdbUtil;
import Model.Alunos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


	public class NovoAluno extends JFrame {
		
		JLabel lblnome = new JLabel ("Nome:");
		JLabel lblendereco = new JLabel("Endereço:");
		JLabel lblbairro = new JLabel("Bairro:");
		JLabel lblcep = new JLabel("Cep:");
		
		TextField txtnome = new TextField(); 
		TextField txtendereco= new TextField();
		TextField txtbairro = new TextField();
		TextField txtcep = new TextField();
		
		JButton btnGravar = new JButton("Gravar");
		
		
		
		public NovoAluno() {                  // Definindo parametros da Classe
			super("Novo Aluno ");	
		
		
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
		
		paine.add(lblbairro);
		lblbairro.setBounds(10, 85, 70,30);
		paine.add(txtbairro);
		txtbairro.setBounds(90, 85, 255,30);
		
		paine.add(lblcep);
		lblcep.setBounds(10,120,70,30);
		paine.add(txtcep);
		txtcep.setBounds(90,120,255,30);
		
		

		paine.add(btnGravar);
		btnGravar.setBounds(90, 190, 130, 50);
		
		
		
		btnGravar.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				try {
					Alunos aluno = new Alunos();
					aluno.setNome(txtnome.getText());
					aluno.setEndereco(txtendereco.getText());
					aluno.setBairro(txtbairro.getText());
					aluno.setCep(txtcep.getText());
					
					Connection connection = JdbUtil.getConnection();
					AlunosjdbcDAO alunosjdbcDAO = new AlunosjdbcDAO(connection);
					alunosjdbcDAO.salvar(aluno);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			
		}});
		
		
		
		
		this.setResizable(true);               					 // Possivel redimensionar com o mouse
		this.setVisible(true);				 					 //  Se é visivel 
		this.setSize(600, 300);			    				 	 //  Tamanho da Janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Corta a execusão até em 2°plano
		
		
		}
		 public static void main( String[] args ) {
			 
			NovoAluno novoaluno = new NovoAluno();
			
		}
	

}
