package application;

import service.InternetBrowser;
import service.MusicPlayer;
import service.Telephone;

public class Iphone implements InternetBrowser, MusicPlayer, Telephone {

	@Override
	public void call(String cell) {
		 System.out.println("ligando para " + cell);
	}

	@Override
	public void answer() {
		 System.out.println("Atendendo a ligação!");
	}

	@Override
	public void startVoiceMail(String voiceMail) {
		System.out.println("Reproduzindo correio de voz");
	}

	@Override
	public void TouchMusic(String music) {
		System.out.println("Tocando " + music);
	}

	@Override
	public void pauseMusic() {
		 System.out.println("Musica pausada!");
	}

	@Override
	public void selectMusic(String music) {
		System.out.println("Musica " + music + "selecionada!");
	}

	@Override
	public void showPage() {
		System.out.println("Exibindo página");
	}

	@Override
	public void addNewTab() {
		System.out.println("Nova aba!");
	}

	@Override
	public void updatePage() {
		System.out.println("Página atualizada!");
	}

	
}
