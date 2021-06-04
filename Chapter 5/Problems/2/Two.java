class Max_Two {
    public static void main(String[] args) {
	System.out.println(max(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    static int max(int x, int y) {
	return x > y ? x : y;
    }
}
