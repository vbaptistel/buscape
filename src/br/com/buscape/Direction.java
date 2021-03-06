package br.com.buscape;

/**
 * Enumerador utilizado para conversão de direções
 * 
 * @author viniciusbaptistel
 *
 */
public enum Direction {

	N(0, "Norte"),
	L(1, "Leste"),
	S(2, "Sul"),
	O(3, "Oeste");

	private final int direction;
	private final String description;

	private Direction(int direction, String description) {
		this.direction = direction;
		this.description = description;
	}

	public int getDirection() {
		return direction;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * Busca uma direção por um valor inteiro
	 * 
	 * @param direction - {@link Integer}
	 * @return {@link Direction}
	 * @throws RuntimeException se direção não encontrado
	 */
	public static Direction getByDirection(Integer direction) {
		while (direction < 0)
			direction += 4;
		
		while (direction > 3)
			direction -= 4;
		
		for (Direction dir : values()) 
			if (dir.direction == direction)
				return dir;
		
		throw new RuntimeException("Direction not found");
	}

}
