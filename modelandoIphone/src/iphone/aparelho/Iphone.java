package iphone.aparelho;

import iphone.funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import iphone.funcionalidades.navegadorInternet.NavegadorInternet;
import iphone.funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("https://"+ url+".com.br/");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando pagina");
		
	}

	@Override
	public void tocar() {
		System.out.println("tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("pausando musica");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando "+ musica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para "+ numero);
	}

	@Override
	public void atender() {
		System.out.println("atendendo telefone");
		
	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
		
	}


}
