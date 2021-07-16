import java.io.*;

public class Three {
    public static void main(String[] args) {
	try {
	    Encryptor e = new Encryptor(1);
	    e.encrypt("test.txt", "output.txt");
	    Encryptor d = new Encryptor(-1);
	    d.encrypt("output.txt", "test2.txt");
	    
	} catch (IOException exception) {
	    System.out.println(exception);
	}
    }
}
