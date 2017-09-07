package br.com.buscape;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe descreve um submarino e suas açoes
 * 
 * @author viniciusbaptistel
 *
 */
public class Submarine {
	
	int x;
	int y;
	int z;
	int direction;
	
	/**
	 * Move o submarino de acordo com os comandos recebidos
	 * 
	 * @param command - Um ou mais comandos concatenados 
	 */
	public void move(String command) {
		List<Command> commands = this.convertToCommands(command);
		
		for (Command cmd : commands) {
			if (Command.LEFT.equals(cmd)) 
				this.direction--;
			else if (Command.RIGHT.equals(cmd))
				this.direction++;
			else if  (Command.MOVE.equals(cmd))
				this.walk();
			else if (Command.UP.equals(cmd))
				this.z++;
			else if (Command.DOWN.equals(cmd))
				this.z--;
		}
		
	}
	
	/**
	 * O submarino se move para direção apontada
	 */
	private void walk() {
		Direction dir = Direction.getByDirection(this.direction);
		
		if (Direction.N.equals(dir)) 
			this.y++;
		else if (Direction.L.equals(dir)) 
			this.x++;
		else if (Direction.O.equals(dir)) 
			this.x--;
		else if (Direction.S.equals(dir))
			this.y--;
	}
	
	/**
	 * Converte uma {@link String} com comandos em uma lista de {@link Command}
	 * 
	 * @param command - Um ou mais comandos concatenados
	 * @return {@link List} de {@link Command}
	 */
	private List<Command> convertToCommands(String command) {
		char[] chars = command.toUpperCase().toCharArray();
		List<Command> commands = new ArrayList<>();
		for (char c : chars) 
			commands.add(Command.getByValue(c));
		
		return commands;
	}
	
	/**
	 * Retorna a localização do submarino
	 * 
	 * @return {@link String} - localização
	 */
	public String getLocalization() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ", " + 
				Direction.getByDirection(this.direction).getDescription().toUpperCase() + ")";
	}

}
