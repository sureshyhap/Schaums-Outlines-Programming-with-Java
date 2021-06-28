public class Seven {
    public static void main(String[] args) {
	CelestialBody sun = new CelestialBody("Sun", 1.989 * Math.pow(10, 33), 1392396.42, 0);
	CelestialBody earth = new CelestialBody("Earth", 5.972 * Math.pow(10, 27), 12739.4184, 365, sun);
	CelestialBody moon = new CelestialBody("Moon", 7.34767309 * Math.pow(10, 25), 3473.5092, 27, earth);
	CelestialBody.print();
    }
}
