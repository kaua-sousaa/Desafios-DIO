package utilizador;

import iphone.aparelho.Iphone;

public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.ligar("111-333-444");
		iphone.atender();
		iphone.inciarCorreioVoz();
		
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina("amazon");
		
		iphone.selecionarMusica("nirvana");
		iphone.tocar();
		iphone.pausar();
	}

}
