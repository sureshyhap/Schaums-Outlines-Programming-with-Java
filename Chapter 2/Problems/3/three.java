class MobyDick {
    public static void main(String[] args) {
	String s = "Call me Ishmael";
	System.out.println(s);
	System.out.println("Length: " + s.length());
	System.out.println("The first character is: " + s.charAt(0));
	System.out.println("The last character is: " + s.charAt(s.length() - 1));
	System.out.println("The first word is: " + s.substring(0, s.indexOf(' ')));
    }
}
