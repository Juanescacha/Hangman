
public class Muneco {
	private String munecoestado;

	public Muneco() {
	}
	
	public void Estado(int fallo) {
		
		switch (fallo) {
			case 1: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      \r\n" + 
					"     |      \r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 2: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (\r\n" + 
					"     |      \r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 3: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_\r\n" + 
					"     |      \r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 4: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 5: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |       |\r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 6: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \\|\r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 7: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \\|/\r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 8: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \\|/\r\n" + 
					"     |       |\r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 9: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \\|/\r\n" + 
					"     |       |\r\n" + 
					"     |      / \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
			case 10: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      |\r\n" + 
					"     |      (_)\r\n" + 
					"     |      \\|/\r\n" + 
					"     |       |\r\n" + 
					"     |      / \\\r\n" + 
					"     |\r\n" + 
					" ____|___\n   PERDISTE!!! ";
			break;
			default: munecoestado= "\r\n" + 
					"      _______\r\n" + 
					"     |/      \r\n" + 
					"     |      \r\n" + 
					"     |      \r\n" + 
					"     |       \r\n" + 
					"     |      \r\n" + 
					"     |\r\n" + 
					" ____|___";
			break;
		}
		
		System.out.println(munecoestado);

	}

}
