package net.vanilton.PageObjects;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import org.junit.Assert;

public class PaginaInputPaste {

	private Screen screen;
	private String pathPictures = "src//test//resources//pictures//";

	public PaginaInputPaste(Screen screen) {
		this.screen = screen;
	}

	public void clicarNoBotao(String nomeBotao) throws FindFailed {
		screen.wait(pathPictures + "botao//" + nomeBotao + ".png");
		screen.click(pathPictures + "botao//" + nomeBotao + ".png");
	}
	
	public void verificarPaginaFechada(){
		Assert.assertTrue(screen.waitVanish(pathPictures + "botao//Fechar"+".png"));
	}
	
}
