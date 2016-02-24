package net.vanilton.test;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class HelloWorldSikuliXIDE {
	
	static Screen screen = new Screen();

	public static void main(String[] args) throws FindFailed, IOException {
		// Comente o Runtime para o app não ser aberto
		Runtime.getRuntime().exec("java -jar examples-sikuli.jar");
		if (screen.exists("src//test//resources//pictures//main.png") != null) {
			JOptionPane.showMessageDialog(null, "Uhuu! Encontrei o app aberto!", null, 1);
		} else {
			JOptionPane.showMessageDialog(null, "Oops! Não encontrei o app aberto", null, 1);
		}

	}

}