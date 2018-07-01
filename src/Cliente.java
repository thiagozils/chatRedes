/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;




/**
 *
 * @author Thiago
 */
public class Cliente {
    
    private String host;
	private int porta;

	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}

	public void executa() throws UnknownHostException, IOException {
		try(Socket cliente = new Socket(this.host, this.porta); 
				Scanner teclado = new Scanner(System.in); 
				PrintStream saida = new PrintStream(cliente.getOutputStream())) {
			System.out.println("O cliente se conectou ao servidor!");
	
			RecebedorDeMensagemDoServidor r = new RecebedorDeMensagemDoServidor(cliente.getInputStream());
			new Thread(r).start();
                   
			while (teclado.hasNextLine()) {
				saida.println(teclado.nextLine());
			}
		}
	}
    
    
}
