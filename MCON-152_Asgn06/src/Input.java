
public class Input extends HTMLtag {

	String text = "";
	String type = "";
	String event = "";
	String value = "";
	
	public Input(String text) {
		this.text = text;
		setTag();
	}
	public void setType(String type) {
		this.type = " type=\"" + type + "\"";
		setTag();
	}
	public void setEvent(String eventType, String event) {
		this.event = " " + eventType + "=\"" + event + "\"";
		setTag();
	}
	public void setevenValue(String value) {
		this.value = " value=\"" + value + "\"";
		setTag();
	}
	private void setTag() {
		tag = "<input" + name + id + type + value + event + ">" + text + "</input>";
	}
}
