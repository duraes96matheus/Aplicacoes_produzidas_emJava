package view;

import java.awt.Container;

import javax.swing.JFrame;        //Importa a classe JFrame(janela)
import javax.swing.JLabel;        //Imprta a classe Label(Campos para preenchimento)
import javax.swing.JTextField;   // importa a classe text fiel(Texto)

import  javax.swing.JComboBox;

import javax.swing.JButton;


public class JanelaPrincipal extends JFrame {   // Definindo a classe
	
	JLabel lblNome = new JLabel("Nome: ");      //Instaciando a clase
	JLabel lblEndereco = new JLabel("Endereço: ");   
	JLabel lblBAirro = new JLabel("Bairro: ");   
	JLabel lblEstado = new JLabel("Estado: ");   
	JLabel lblTelefone = new JLabel("Telefone: ");   
	JLabel lblCelular = new JLabel("Celular: ");
	JLabel lblEmail = new JLabel("Email: ");   
	JLabel lblinicio =new JLabel("Preencha os campos e clique em Gravar Dados");
	
	
	
	
	JTextField  txtnome      = new JTextField();
	JTextField  txtEndereco  = new JTextField();
	JTextField  txtBairro    = new JTextField();
	JComboBox   cbEstado 	 = new JComboBox();		
	JTextField  txtTelefone  = new JTextField();
	JTextField  txtCelular	 = new JTextField();
	JTextField  txtEmail 	 =  new JTextField();
	JButton gravarCadastro   =  new  JButton ( " Gravar Cadastro " );
	JButton novoCadastro     =  new  JButton ( " Novo Cadastro " );
	JButton verCadastros     =  new  JButton ( " Ver cadastros " );
	
	
	public JanelaPrincipal() {                  // Definindo parametros da Classe
		super("MINHA JANELA");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);	
		
		lblNome.setBounds(20,30,100,25);  //1°Distância letra da Margem, 2 ° Altura, 3°
		paine.add(lblNome);
		
		lblEndereco.setBounds(20,60,100,25);
		paine.add(lblEndereco);
		
		lblBAirro.setBounds(20,90,100,25);
		paine.add(lblBAirro);
		
		lblEstado.setBounds(20,120,100,25);
		paine.add(lblEstado);
		
		lblTelefone.setBounds(20,150,100,25);
		paine.add(lblTelefone);
		
		lblCelular.setBounds(20,180,100,25);
		paine.add(lblCelular);
		
		lblEmail.setBounds(20,210,100,25);
		paine.add(lblEmail);
		
		lblinicio.setBounds(50, 5, 300, 15);
		paine.add(lblinicio);
		
		
	
		txtnome.setBounds(100,30,250,25);
		paine.add(txtnome);
		
		txtEndereco.setBounds(100, 60, 250, 25);
		paine.add(txtEndereco);
		
		txtBairro.setBounds(100,90,250,25);
		paine.add(txtBairro);
		
		
		cbEstado.setBounds ( 100, 120 , 120 , 25 );		
		paine.add (cbEstado);
		cbEstado.addItem("SP");
		cbEstado.addItem("AC");
		cbEstado.addItem("AL");
		cbEstado.addItem("AP");
		cbEstado.addItem("AM");
		cbEstado.addItem("BA");
		cbEstado.addItem("CE");
		cbEstado.addItem("DF");
		cbEstado.addItem("ES");
		cbEstado.addItem("GO");
		cbEstado.addItem("MA");
		cbEstado.addItem("MT");
		cbEstado.addItem("MS");
		cbEstado.addItem("MG");
		cbEstado.addItem("PA");
		cbEstado.addItem("PB");
		cbEstado.addItem("PR");
		cbEstado.addItem("PE");
		cbEstado.addItem("PI");
		cbEstado.addItem("RJ");
		cbEstado.addItem("RN");
		cbEstado.addItem("RS");
		cbEstado.addItem("RO");
		cbEstado.addItem("RO");
		cbEstado.addItem("RJ");
		cbEstado.addItem("SE");
		cbEstado.addItem("TO");
				
		
		txtTelefone.setBounds(100,150,150,25);
		paine.add(txtTelefone);
	
		txtCelular.setBounds(100,180,150,25);
		paine.add(txtCelular);
		
		
		txtEmail.setBounds(100,210,250,25);
		paine.add(txtEmail);
		
		gravarCadastro.setBounds (20,280,150,30);
		paine.add (gravarCadastro);
	
		novoCadastro.setBounds (200,280,150,30);
		paine.add (novoCadastro);
		
		verCadastros.setBounds (380,280,150,30);
		paine.add (verCadastros);
		
					
			
		
		this.setResizable(true);               					 // Possivel redimensionar com o mouse
		this.setVisible(true);				 					 //  Se é visivel 
		this.setSize(800, 600);			    				 	 //  Tamanho da Janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Corta a execusão até em 2°plano
	
	}
	
	
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();

	}
}