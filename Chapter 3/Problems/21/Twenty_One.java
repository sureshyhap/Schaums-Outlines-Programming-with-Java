import java.io.*;

class String_Ordering {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s1 = in.readLine();
	String s2 = in.readLine();
	String s3 = in.readLine();
	if (s1.compareTo(s2) < 0) {
	    if (s2.compareTo(s3) < 0) {
		System.out.println(s1 + ", " + s2 + ", " + s3);
	    }
	    else if (s1.compareTo(s3) < 0) {
		System.out.println(s1 + ", " + s3 + ", " + s2);
	    }
	    else {
		System.out.println(s3 + ", " + s1 + ", " + s2);
	    }
	}
	else {
	    if (s1.compareTo(s3) < 0) {
		System.out.println(s2 + ", " + s1 + ", " + s3);
	    }
	    else if (s2.compareTo(s3) < 0) {
		System.out.println(s2 + ", " + s3 + ", " + s1);
	    }
	    else {
		System.out.println(s3 + ", " + s2 + ", " + s1);
	    }
	}	
    }
}
