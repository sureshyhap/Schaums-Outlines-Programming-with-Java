import java.io.*;

public class Nineteen {
    public static void main(String[] args) throws IOException {
	double principal = 0, interest_rate = 0, monthly_payment = 0;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Principal: ");
	principal = Double.parseDouble(in.readLine());
	System.out.print("Monthly interest rate: ");
	interest_rate = Double.parseDouble(in.readLine());
	System.out.print("Monthly payment: ");
	monthly_payment = Double.parseDouble(in.readLine());
	do {
	    principal *= (1 + interest_rate);
	    if (principal >= monthly_payment) {
		principal -= monthly_payment;
		System.out.println("Payed: $" + monthly_payment);
	    }

	    else {
		System.out.println("Payed: $" + principal);
		principal = 0;
	    }
	}
	while (principal > 0);
    }
}
