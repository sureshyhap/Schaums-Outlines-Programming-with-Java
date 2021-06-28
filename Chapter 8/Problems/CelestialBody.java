public class CelestialBody {
    public CelestialBody(String name, double mass, double diameter, double period) {
	this.name = name;
	this.mass = mass;
	this.diameter = diameter;
	this.period = period;
	next = list;
	list = this;	
    }
    public CelestialBody(String name, double mass, double diameter, double period, CelestialBody orbits) {
	this(name, mass, diameter, period);
	this.orbits = orbits;
    }
    public String toString() {
	String s = name + " ";
	s += mass + " ";
	s += diameter + " ";
	s += period + " ";
	if (orbits != null) {
	    s += orbits + " ";
	}
	return s.trim();
    }
    public static void print() {
	CelestialBody temp = list;
	if (temp == null) {
	    System.out.println("Empty list");
	    return;
	}
	do {
	    System.out.println(temp);
	    temp = temp.next;
	    System.out.println();	    
	} while (temp != null);
    }
    
    private String name;
    // In grams
    private double mass;
    // In kilometers
    private double diameter;
    // In earth days
    private double period;
    private CelestialBody orbits;
    private CelestialBody next;
    static CelestialBody list;
}
