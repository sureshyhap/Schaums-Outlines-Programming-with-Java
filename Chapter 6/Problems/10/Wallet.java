class Wallet {
    public Wallet() {
	one = two = five = ten = twenty = fifty = 0;
    }
    public void insert(int dollars) {
	one = total() + dollars;
	reduce();
    }
    public boolean remove(int dollars) {
	if (dollars > total()) {
	    return false;
	}
	one = total() - dollars;
	reduce();
	return true;
    }
    public String toString() {
	return new String(fifty + " fifty + " +
			  twenty + " twenty + " +
			  ten + " ten + " +
			  five + " five + " +
			  two + " two + " +
			  one + " one = $" +
			  total());
    }
    private int total() {
	return one + 2 * two + 5 * five + 10 * ten + 20 * twenty + 50 * fifty;
    }
    private void reduce() {
	fifty = one / 50;
	one %= 50;
	twenty = one / 20;
	one %= 20;
	ten = one / 10;
	one %= 10;
	five = one / 5;
	one %= 5;
	two = one / 2;
	one %= 2;
    }
    private int one, two, five, ten, twenty, fifty;
}
