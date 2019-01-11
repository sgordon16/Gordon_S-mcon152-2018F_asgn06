
public abstract class HTMLtag {
	
	String name = "";
	String id = "";
	String tag = null;
	public String getTag() {
		return tag;
	}
	public void setName(String name) {
		this.name = " name=\"" + name + "\"";
	}
	public void setID(String id) {
		this.id = " id=\"" + id + "\"";
	}

}
