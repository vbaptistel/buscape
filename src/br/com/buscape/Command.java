package br.com.buscape;

public enum Command {

	LEFT('L'), RIGHT('R'), MOVE('M'), UP('U'), DOWN('D');

	private final char value;

	private Command(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public static Command getByValue(char value) {
		for (Command cmd : values()) 
			if (cmd.value == value) 
				return cmd;
		
		throw new RuntimeException("Command not found");
	}

}
