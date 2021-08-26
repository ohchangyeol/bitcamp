package shop.service.user.test;

import shop.service.user.Client;

public class ClientTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("오창열", 27, "양쥬", false);
		System.out.println("이름 : "+ client.getName());
		System.out.println(client);
		
		
	}

}
