package ExecutaTeste;

import ElementosWeb.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Executa {

		
		Metodos metodos = new Metodos();
		Elementos el = new Elementos();
		
	
		@Given("que estou no site {string}")
		public void que_estou_no_site(String string) {
		
			metodos.abrirNavegador("https://inm-test-app.herokuapp.com/accounts/login/");
			metodos.escrever(el.getCastUser(),"Calebe Augusto Thomas Ferreira");
			metodos.escrever(el.getCastPass(), "CpD0tTdeGA");
			metodos.click(el.getBotnConf());
		  
		}

		@When("realizo o cadastro do funcionario")
		public void realizo_o_cadastro_do_funcionario() {
			metodos.click(el.getCastfunc());
			metodos.escrever(el.getNome(), "Raimundo Noah Pires");
			metodos.escrever(el.getCargo(), "Analista de Teste");
			metodos.escrever(el.getCPF(), "911.874.928-33");
			metodos.escrever(el.getSalario(), "20.000,00");
			metodos.escrever(el.getSexo(), "Masculino");
			metodos.click(el.getTipoCont());
			metodos.escrever(el.getAdmissao(), "02/10/1987");
			metodos.click(el.getEnviar());
		}

		@Then("Valido o cadastro")
		public void valido_o_cadastro() {
		    metodos.fechar();
		}

		@When("atulizo o cadastro do funcionario")
		public void atulizo_o_cadastro_do_funcionario() {
		    metodos.escrever(el.getPesfunc(),"Raimundo Noah Pires");
		    metodos.click(el.getEditcas());
		    metodos.escrever(el.getAdmissao(), "02/10/2010");
		    metodos.click(el.getEnviar());
		}

		@Then("Valido a atualizacao")
		public void valido_a_atualizacao() {
			metodos.fechar();
		    
		}

		@When("excluo o cadastro do funcionario")
		public void excluo_o_cadastro_do_funcionario() {
			 metodos.escrever(el.getPesfunc(),"Raimundo Noah Pires");
			 metodos.click(el.getEditcas());
			 metodos.click(el.getExcluir());
			
		}

		@Then("Valido a exclusao")
		public void valido_a_exclusao() {
		  metodos.fechar();
		}
	}

