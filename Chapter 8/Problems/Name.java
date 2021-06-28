public class Name {
    public Name() {
	
    }
    public Name(String first, String last) {
	this.first = first;
	this.last = last;
    }
    public Name(String first, String middle, String last) {
	this(first, last);
	this.middle = middle;
    }
    public Name(String first, String middle, String last, String prefix, String suffix, String nick) {
	this(first, middle, last);
	this.prefix = prefix;
	this.suffix = suffix;
	this.nick = nick;
    }
    public String get_first() {
	return first;
    }
    public String get_middle() {
	return middle;
    }
    public String get_last() {
	return last;
    }
    public String get_prefix() {
	return prefix;
    }
    public String get_suffix() {
	return suffix;
    }
    public String get_nick() {
	return nick;
    }
    public void set_first(String first) {
	this.first = first;
    }
    public void set_middle(String middle) {
	this.middle = middle;
    }
    public void set_last(String last) {
	this.last = last;
    }
    public void set_prefix(String prefix) {
	this.prefix = prefix;
    }
    public void set_suffix(String suffix) {
	this.suffix = suffix;
    }
    public void set_nick(String nick) {
	this.nick = nick;
    }    
    public String toString() {
	String s = new String();
	if (prefix != null) {
	    s += prefix + " ";
	}
	if (first != null) {
	    s += first + " ";
	}
	if (nick != null) {
	    s += "(" + nick + ") ";
	}
	if (middle != null) {
	    s += middle + " ";
	}
	if (last != null) {
	    s += last + " ";
	}
	if (suffix != null) {
	    s += suffix + " ";
	}
	return s.trim();
    }

    protected String first;
    protected String middle;
    protected String last;
    protected String prefix;
    protected String suffix;
    protected String nick;
}
