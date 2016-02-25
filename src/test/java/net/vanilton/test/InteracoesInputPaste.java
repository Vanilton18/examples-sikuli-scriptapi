package net.vanilton.test;

import java.io.IOException;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class InteracoesInputPaste {

	static Screen screen = new Screen();
	
	public static void main(String[] args) throws IOException, FindFailed {
		//Comando para definir um caminho padrão para as imagens
		Settings.BundlePath = "src//test//resources//pictures";
		Runtime.getRuntime().exec("java -jar examples-sikuli.jar");
		screen.find("main.png");
		screen.click("menu_funcoes.png");
		screen.click("input_paste.png");
		screen.wait("enter.png",20);
		screen.paste("vanilton");
		screen.click("enter.png");
		screen.find("vanitondiff.png");
		screen.click("limpar.png");
		screen.type("field_text.png", "vanilton.net" );
		screen.click("enter.png");
		screen.find("vaniltoneq.png");
		screen.click("fechar.png");
	}

}
