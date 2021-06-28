public class Eight {
    public static void main(String[] args) {
	Person2 ww = new Person2(new Name("William", "Windsor"), 'M');
	Person2 cw = new Person2(new Name("Charles", "Windsor"), 'M');
	Person2 ds = new Person2(new Name("Diana", "Spencer"), 'F');
	Person2 es = new Person2(new Name("Edward", "Spencer"), 'M');
	Person2 ew = new Person2(new Name("Elizabeth", "Windsor"), 'F');
	Person2 pm = new Person2(new Name("Philip", "Mountbatten"), 'M');
	Person2 eb = new Person2(new Name("Elizabeth", "Bowes-Lyon"), 'F');
	Person2 gw = new Person2(new Name("George", "Windsor"), 'M');
	ww.set_father(cw);
	ww.set_mother(ds);
	ds.set_father(es);
	cw.set_mother(ew);
	cw.set_father(pm);
	ew.set_mother(eb);
	ew.set_father(gw);
	System.out.print(ww);
    }
}
