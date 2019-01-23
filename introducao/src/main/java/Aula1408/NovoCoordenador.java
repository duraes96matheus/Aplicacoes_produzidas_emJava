package Aula1408;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controler.CoordenadorjdbcDAO;
import Controler.JdbUtil;
import Controler.ProfessoresjdbcDAO;
import Model.Coordenador;
import Model.Professor;

public class NovoCoordenador extends JFrame {

	JLabel lblnome = new  JLabel("Nome:");
	JLabel lblCursosCoordenados = new JLabel("Cursos Coordenados:");
	JLabel lblIDcurosCoordenados = new JLabel("ID Curos Coordenados:");
	
	JTextField  txtnome = new JTextField();
	JTextField  txtCursosCoordenado = new JTextField();
	JTextField  txtIDcurosCoordenados = new JTextField();		
	
	JButton  btnSalvar = new JButton ("Gravar");
	
	
	public NovoCoordenador()  {                  // Definindo parametros da Classe
		super("Novo Coordenadorr");		
	
	Container paine = this.getContentPane();
	paine.setLayout(null);	
	
	paine.add(lblnome);
	lblnome.setBounds(10, 15, 45, 30);
	paine.add(txtnome);
	txtnome.setBounds(90, 15, 255, 30);
	
	paine.add(lblCursosCoordenados);
	lblCursosCoordenados.setBounds(10, 50, 70, 30);
	paine.add(txtCursosCoordenado);
	txtCursosCoordenado.setBounds(90, 50, 255,30);		

	paine.add(lblIDcurosCoordenados);
	lblIDcurosCoordenados.setBounds(10,85,110,30);
	paine.add(txtIDcurosCoordenados);
	txtIDcurosCoordenados.setBounds(90,85,255,30);
	
	paine.add(btnSalvar);
	btnSalvar.setBounds(90, 120, 130, 50);
	
	btnSalvar.addActionListener(new ActionListener (){
		public void actionPerformed(ActionEvent e) {
			try {
				Coordenador Coordenador = new Coordenador();
				Coordenador.setNome(txtnome.getText());
				Coordenador.setCursosCoordenados(txtCursosCoordenado.getText());
				Coordenador.setIDcurosCoordenados(txtIDcurosCoordenados.getText());
			
				
				Connection connection = JdbUtil.getConnection();
				CoordenadorjdbcDAO coordenadorjdbcDAO = new CoordenadorjdbcDAO(connection);
				coordenadorjdbcDAO.salvar(Coordenador);					
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
	       NovoProfessor NovoCoordenador = new NovoProfessor();
	       
	    }

}
