
public class Anchor extends HTMLtagDecorater {

	HTMLtag htmlTag;
	String href = "";
	
	public Anchor(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	public void setHref(String href) {
		this.href = " href=\"" + href + "\"";
	}
	
	@Override
	public String getTag() {
	
		return "<a" + href + ">" + htmlTag.getTag() + "</a>";
	}

}
