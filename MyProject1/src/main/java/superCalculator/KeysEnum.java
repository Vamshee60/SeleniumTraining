package superCalculator;

public enum KeysEnum {
	ZERO("0"), One("1"), Plus("+"), Two("2"), Three("3"), Four("4"), Five("5"), Six("6"), Seven("7"), Eight("8"), Nine(
			"9"), Minus("-"), Multiply("*"), Divide("/"), Percentage("%"),ON("ON"),OFF("OFF"),AC("AC"),C("C");

	String symbol;

	KeysEnum(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;

	}

}
