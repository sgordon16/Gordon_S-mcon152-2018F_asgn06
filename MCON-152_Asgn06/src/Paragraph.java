
public class Paragraph extends HTMLtag {
	
	String text = "";

	public Paragraph(String text) {
		this.text = text;
		setTag();
	}
	private void setTag() {
		tag = "<p" + name + id + ">" + text + "</p>";
	}
}
