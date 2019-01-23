package Model;

public class Coordenador {
	private int id;
	private String nome;
	private String CursosCoordenados;
	private String IDcurosCoordenados;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCursosCoordenados() {
		return CursosCoordenados;
	}
	public void setCursosCoordenados(String cursosCoordenados) {
		CursosCoordenados = cursosCoordenados;
	}
	public String getIDcurosCoordenados() {
		return IDcurosCoordenados;
	}
	public void setIDcurosCoordenados(String string) {
		IDcurosCoordenados = string;
	}

}
