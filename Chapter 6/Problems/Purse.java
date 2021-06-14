class Purse {
    public Purse() {
	pennies = nickels = dimes = quarters = half_dollars = 0;
    }
    public double get_dollars() {
	return (double) cents() / 100;
    }
    public void insert(double dollars) {
	pennies = cents() + (int) Math.round(dollars * 100);
	reduce();
    }
    public boolean remove(double dollars) {
	if (dollars > get_dollars()) {
	    return false;
	}
	pennies = cents() - (int) Math.round(dollars * 100);
	reduce();
	return true;
    }
    public String toString() {
	return new String(half_dollars + " half_dollars + " +
			  quarters + " quarters + " +
			  dimes + " dimes + " +
			  nickels + " nickels + " +
			  pennies + " pennies = $" +
			  get_dollars());
    }
    private int cents() {
	return pennies + nickels * 5 + dimes * 10 + quarters * 25 + half_dollars * 50;
    }
    private void reduce() {
	half_dollars = pennies / 50;
	pennies %= 50;
	quarters = pennies / 25;
	pennies %= 25;
	dimes = pennies / 10;
	pennies %= 10;
	nickels = pennies / 5;
	pennies %= 5;
    }
    private int pennies, nickels, dimes, quarters, half_dollars;
}
