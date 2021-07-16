public class Country implements java.io.Serializable {
    public Country(String key, String name, String capital, int area, int population) {
	this.key = key;
	this.name = name;
	this.capital = capital;
	this.area = area;
	this.population = population;
    }
    public String toString() {
	return key + ":\tName: " + name +
	    "\n\tCapital: " + capital +
	    "\n\tArea: " + area +
	    "\n\tPopulation: " + population + '\n';
    }
    
    private String key, name, capital;
    private int area, population;
}
