package br.com.buscape;

/**
 * Enumerador para comandos de movimento de um {@link Submarine}
 * 
 * @author viniciusbaptistel
 *
 */
public enum Command {

	LEFT('L'), 
	RIGHT('R'), 
	MOVE('M'), 
	UP('U'), 
	DOWN('D');

	private final char value;

	private Command(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	/**
	 * Busca um comando pelo valor
	 * 
	 * @param value - char
	 * @return {@link Command}
	 * @throws RuntimeException se comando não encontrado
	 */
	public static Command getByValue(char value) {
		for (Command cmd : values()) 
			if (cmd.value == value) 
				return cmd;
		
		throw new RuntimeException("Command not found");
	}

}
