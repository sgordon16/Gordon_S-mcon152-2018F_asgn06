
public class Header extends HTMLtag {

	String text = "";
	
	public Header(String text, int num) {
		this.text = text;
		setTag();
	}
	private void setTag() {
		tag = "<h" + name + id + ">" + text + "</h>";
	}
}
