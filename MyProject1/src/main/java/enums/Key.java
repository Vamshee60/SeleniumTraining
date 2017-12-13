package enums;

public class Key {

	String symbol;
	public Key(String symbol){
		this.symbol=symbol;
	}
	public String getSymbol(){
		return symbol;
		
	}
	
	public static void main(String[] args) {
		Key k_equals=new Key("=");
		Key k_one=new Key("1");
		Key k_two=new Key("2");
		Key k_three=new Key("3");
		Key k_four=new Key("4");
	} 
}
