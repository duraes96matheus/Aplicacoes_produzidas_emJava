package Aula1408;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Controler.AlunosjdbcDAO;
import Controler.JdbUtil;
import Model.Alunos;

public class App extends JFrame {	
	
	JButton  btnCurso = new JButton ("Novo curso");
	JButton  btnProfessor = new JButton ("Novo Professor");
	JButton  btnAluno = new JButton ("Novo Aluno");
	JButton  btnCoordenador = new JButton ("Novo Coordenador");
	
	public App() throws ParseException {                  // Definindo parametros da Classe
		super("Novo Cadastro");
	
		Container paine = this.getContentPane();
		paine.setLayout(null);	
		
		
		paine.add(btnCurso);
		btnCurso.setBounds(0, 20, 130, 50);
		
		paine.add(btnAluno);
		btnAluno.setBounds(140, 20, 130, 50);
		
		paine.add(btnProfessor);
		btnProfessor.setBounds(280, 20, 130, 50);
		
		paine.add(btnCoordenador);
		btnCoordenador.setBounds(420, 20, 130, 50);
		
		btnProfessor.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnProfessor) {			
				NovoProfessor novoprofessor = new NovoProfessor();
								
	
				}
			}
		});
		
		btnAluno.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAluno) {
					NovoAluno novoaluno = new NovoAluno();
				
				
				}
				
			}
		});
		
		btnCurso.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCurso) {			
				NovoCurso novocurso = new NovoCurso();
								
	
				}
			}
		});
		
		btnCoordenador.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCoordenador) {			
				NovoCoordenador novocoordenador = new NovoCoordenador();
								
	
				}
			}
		});
			
				
			
		
	
		this.setResizable(true);               					 // Possivel redimensionar com o mouse
		this.setVisible(true);				 					 //  Se é visivel 
		this.setSize(600, 200);			    				 	 //  Tamanho da Janela5
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Corta a execusão até em 2°plano	
	}

    public static void main( String[] args ) throws ParseException
    {
       App Menu = new App();
    }
}
