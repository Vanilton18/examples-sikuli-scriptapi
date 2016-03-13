package net.vanilton.PageObjects;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class PaginaPrincipal {

	private Screen screen;
	private String pathPictures = "src//test//resources//pictures//";

	public PaginaPrincipal(Screen screen) {
		this.screen = screen;
	}

	public void clicarNoMenu(String nomeMenu) throws FindFailed {
		screen.wait(pathPictures + "menu//" + nomeMenu + ".png");
		screen.click(pathPictures + "menu//" + nomeMenu + ".png");
	}

	public void clicarNoSubMenu(String nomeSubMenu) throws FindFailed {
		screen.wait(pathPictures + "submenu//" + nomeSubMenu + ".png");
		screen.click(pathPictures + "submenu//" + nomeSubMenu + ".png");
	}
	
}
