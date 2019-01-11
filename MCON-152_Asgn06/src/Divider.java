
public class Divider extends HTMLtag {

	String text = "";
	
	public Divider(String text) {
		this.text = text;
		setTag();
	}
	private void setTag() {
		tag = "<div" + name + id + ">" + text + "</div>";
	}
}
