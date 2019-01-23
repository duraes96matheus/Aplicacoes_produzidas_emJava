package model;

public class Alunos {

 private int cep=0;
 private String bairro;
 private Integer id;
 private String nome;
 private String endereco;
 
 public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
 public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public int getCep() {
	return cep;
}
public void setCep(int cep) {
	this.cep = cep;
}
}
