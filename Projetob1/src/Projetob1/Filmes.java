package Projetob1;

import java.util.ArrayList;
import java.util.List;

public class Filmes extends Listas {

	public Filmes() {}
	
	@Override
	public void listaGeneros() {
		System.out.println("\n__________________________________________________________");
		System.out.println("\nDigite o c�digo do g�nero desejado:"
				+ "\n1- A��o"
				+ "\n2- Terror"
				+ "\n3- Romance"
				+ "\n4- Fic��o e Fantasia"
				+ "\n5- Drama"
				+ "\n6- Anima��o"
				+ "\n__________________________________________________________");
	}

	@Override
	public List<String> lista1() {
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("C�digo de Conduta");
		listaAcao.add("Polar");
		listaAcao.add("O Alvo");
		listaAcao.add("Velozes e Furiosos");
		listaAcao.add("Rambo");
		listaAcao.add("O Exterminador do Futuro");
		listaAcao.add("John Wick");
		listaAcao.add("Miss�o Imposs�vel");
		listaAcao.add("Bad Boys");
		listaAcao.add("Dupla Explosiva");
		return listaAcao;
	}

	@Override
	public List<String> lista2() {
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("A Morte do Dem�nio");
		listaTerror.add("O Iluminado");
		listaTerror.add("Annabelle");
		listaTerror.add("Doutor Sono");
		listaTerror.add("Invoca��o do Mal");
		listaTerror.add("It, a Coisa");
		listaTerror.add("O Massacre da Serra El�trica");
		listaTerror.add("Olhos Famintos");
		listaTerror.add("A Bruxa");
		return listaTerror;
	}

	@Override
	public List<String> lista3() {
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Titanic");
		listaRomance.add("Um Dia");
		listaRomance.add("Nasce Uma Estrela");
		listaRomance.add("Como Eu Era Antes de Voc�");
		listaRomance.add("Uma Raz�o Para Viver");
		listaRomance.add("Di�rio de Uma Paix�o");
		listaRomance.add("Quest�o de Tempo");
		listaRomance.add("Uma Linda Mulher");
		listaRomance.add("E O Vento Levou");
		return listaRomance;
	}

	@Override
	public List<String> lista4() {
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Senhor dos An�is");
		listaFiccaoFantasia.add("Harry Potter");
		listaFiccaoFantasia.add("Star Wars");
		listaFiccaoFantasia.add("O Hobbit");
		listaFiccaoFantasia.add("Conven��o das Bruxas");
		listaFiccaoFantasia.add("Animais Fant�sticos e Onde Habitam");
		listaFiccaoFantasia.add("O C�u da Meia Noite");
		listaFiccaoFantasia.add("A Chegada");
		listaFiccaoFantasia.add("Blade Runner");
		listaFiccaoFantasia.add("Van Helsing");
		return listaFiccaoFantasia;
	}

	@Override
	public List<String> lista5() {
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("A Espera De Um Milagre");
		listaDrama.add("Patch Adams");
		listaDrama.add("O Homem Bicenten�rio");
		listaDrama.add("1917");
		listaDrama.add("Green Book");
		listaDrama.add("12 Anos de Escravid�o");
		listaDrama.add("O Pianista");
		listaDrama.add("A Vida � Bela");
		listaDrama.add("Parasita");
		listaDrama.add("Brilho Eterno De Uma Mente Sem Lembran�as");
		return listaDrama;
	}

	@Override
	public List<String> lista6() {
		List<String> listaAnimacao = new ArrayList<String>();
		listaAnimacao.add("Aladdin");
		listaAnimacao.add("Moana");
		listaAnimacao.add("Divertidamente");
		listaAnimacao.add("A Bela E A Fera");
		listaAnimacao.add("A Branca De Neve");
		listaAnimacao.add("Shrek");
		listaAnimacao.add("A Era Do Gelo");
		listaAnimacao.add("Zootopia");
		listaAnimacao.add("Madagascar");
		listaAnimacao.add("Mulan");
		return listaAnimacao;
	}

}
