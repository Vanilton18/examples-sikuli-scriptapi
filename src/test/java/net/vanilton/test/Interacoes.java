package net.vanilton.test;

import java.io.IOException;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Interacoes {

	static Screen screen = new Screen();
	
	public static void main(String[] args) throws IOException, FindFailed {
		//Comando para definir um caminho padrão para as imagens
		Settings.BundlePath = "src//test//resources//pictures";
		Runtime.getRuntime().exec("java -jar examples-sikuli.jar");
		screen.find("mainVanilton.png");
		screen.click("menu_funcoes.png");
		screen.click("find_click.png");
		screen.click("linux.png");
		screen.hover("ico_linux.png");
		screen.click("macintosh.png");
		screen.hover("ico_mac.png");
		screen.click("fechar.png");
	}

}
