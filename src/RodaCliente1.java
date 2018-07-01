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
import java.net.UnknownHostException;

public class RodaCliente1 {
	public static void main(String[] args) 
			throws UnknownHostException,	IOException {
		new Cliente("127.0.0.2", 12345).executa();
	}
}
