import java.io.*;

class String_Lengths {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s1 = in.readLine();
	String s2 = in.readLine();
	String s3 = in.readLine();
	int first = s1.length(), second = s2.length(), third = s3.length();
	if (first < second) {
	    if (second < third) {
		System.out.println(s1 + ", " + s2 + ", " + s3);
	    }
	    else if (first < third) {
		System.out.println(s1 + ", " + s3 + ", " + s2);
	    }
	    else {
		System.out.println(s3 + ", " + s1 + ", " + s2);
	    }
	}
	else {
	    if (first < third) {
		System.out.println(s2 + ", " + s1 + ", " + s3);
	    }
	    else if (second < third) {
		System.out.println(s2 + ", " + s3 + ", " + s1);
	    }
	    else {
		System.out.println(s3 + ", " + s2 + ", " + s1);
	    }
	}
    }
}
