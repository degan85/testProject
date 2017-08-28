package enumEx;

enum Direction2 {
	EAST(1,">") , SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public static Direction of(int num) {
		if(num < 1 || num > 4) {
			throw new IllegalArgumentException("Invalid value : "+num);
		}
		return DIR_ARR[num-1];
	}
	
	public Direction rotate(int num) {
		num = num % 4;
		
		if(num < 0) num +=4;
		
		return DIR_ARR[(value-1+num) % 4];
	}
}

public class EnumEx2 {
	public static void main(String[] args) {
		Direction2 d1 = Direction2.EAST;
		System.out.println(d1.getSymbol());
		
		System.out.println(Direction2.EAST.rotate(2));
	}
}
