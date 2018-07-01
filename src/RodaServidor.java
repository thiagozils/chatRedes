/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
import java.io.IOException;

public class RodaServidor {

	public static void main(String[] args) 
			throws IOException {
		new Servidor(12345).executa();
	}
}
