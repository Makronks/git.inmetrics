package ElementosWeb;

import org.openqa.selenium.By;

public class Elementos {
	
	
	By castUser = By.xpath("//input[@class='input100']");
	private	
	By castPass = By.xpath("//*[@name='pass']");
	private
	By confPass = By.xpath("//*[@name='confirmpass']");
	private
	By castfunc = By.xpath("//a [@href=\"/empregados/new_empregado\"]");
	private
	By nome = By.xpath("//*[@id=\"inputNome\"]");
	private
	By cargo = By.xpath("//*[@id=\"inputCargo\"]");
	private
	By CPF = By.xpath("//*[@id=\"cpf\"]");
	private
	By Salario = By.xpath("//*[@id=\"dinheiro\"]");
	private
	By Sexo = By.xpath("//*[@id=\"slctSexo\"]");
	private
	By Admissao = By.xpath("//*[@id=\"inputAdmissao\"]"); 
	private
	By TipoCont = By.xpath("//*[@id=\"clt\"]");
	private
	By Enviar = By.xpath("//*[@class=\"cadastrar-form-btn\"]");
	private 
	By pesfunc = By.xpath("//*[@id=\"tabela_filter\"]");
	private
	By editcas = By.xpath("//*[@class=\"btn btn-warning\"]");
	private
	By excluir = By.xpath("//*[@id=\"delete-btn\"]");
	
	public By getCastPass() {
		return castPass;
	}

	public By getConfPass() {
		return confPass;
	}

	public By getBotnConf() {
		return botnConf;
	}

	private
	By botnConf = By.xpath("//*[@class='login100-form-btn']");



	public By getCastUser() {
		return castUser;
	}

	public By getCastfunc() {
		return castfunc;
	}

	public By getCastnome() {
		return getCastnome();
	}

	public By getNome() {
		return nome;
	}

	public By getCargo() {
		return cargo;
	}

	public By getCPF() {
		return CPF;
	}

	public By getSalario() {
		return Salario;
	}

	public By getSexo() {
		return Sexo;
	}

	public By getAdmissao() {
		return Admissao;
	}

	public By getTipoCont() {
		return TipoCont;
	}

	public By getEnviar() {
		return Enviar;
	}

	public By getPesfunc() {
		return pesfunc;
	}

	public By getEditcas() {
		return editcas;
	}

	public By getExcluir() {
		return excluir;
	}
	
	
	
}
