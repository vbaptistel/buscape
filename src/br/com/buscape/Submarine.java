package br.com.buscape;

import java.util.ArrayList;
import java.util.List;

public class Submarine {
	
	int x;
	int y;
	int z;
	int direction;
	
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
	
	private List<Command> convertToCommands(String command) {
		char[] chars = command.toUpperCase().toCharArray();
		List<Command> commands = new ArrayList<>();
		for (char c : chars) 
			commands.add(Command.getByValue(c));
		
		return commands;
	}
	
	public String getLocalization() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ", " + 
				Direction.getByDirection(this.direction).getDescription().toUpperCase() + ")";
	}

}
