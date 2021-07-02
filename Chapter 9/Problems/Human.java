public class Human implements Swimmer, Driver {
    public Human(int md, int ms, String dl, String[] v) {
	max_depth = md;
	max_speed = ms;
	drivers_license = new String(dl);
	VIN = new String[v.length];
	System.arraycopy(v, 0, VIN, 0, v.length);
    }

    public int get_max_depth() {
	return max_depth;
    }
    public int get_max_speed() {
	return max_speed;
    }
    public String get_drivers_license() {
	return drivers_license;
    }
    public String[] get_VINs() {
	return VIN;
    }
    
    protected int max_depth, max_speed;
    protected String drivers_license;
    protected String[] VIN;
}
