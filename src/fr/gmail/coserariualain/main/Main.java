package fr.gmail.coserariualain.main;

import java.io.IOException;

import fr.gmail.coserariualain.server.Server;

public class Main {

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.startServer();
	}

}
