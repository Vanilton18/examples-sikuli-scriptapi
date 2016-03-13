package net.vanilton.PageObjectsTest;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import net.vanilton.PageObjects.PaginaInputPaste;
import net.vanilton.PageObjects.PaginaPrincipal;

public class AppExampleTestPage {

	PaginaPrincipal paginaPrincipal;
	PaginaInputPaste paginaInputPaste;
	static Screen screen;
	
	
	@BeforeClass
	public static void setUp() throws IOException{
		screen = new Screen();
		Runtime.getRuntime().exec("java -jar examples-sikuli.jar");
	}
	
	@Test
	public void test() throws FindFailed {
		paginaPrincipal = new PaginaPrincipal(screen);
		paginaPrincipal.clicarNoMenu("Funções");
		paginaPrincipal.clicarNoSubMenu("Input e Paste");
		paginaInputPaste = new PaginaInputPaste(screen);
		paginaInputPaste.clicarNoBotao("Fechar");
		paginaInputPaste.verificarPaginaFechada();
	}

}
