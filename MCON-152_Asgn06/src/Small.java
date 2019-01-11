
public class Small extends HTMLtagDecorater {

	HTMLtag htmlTag;
	
	public Small(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
	
		return "<small>" + htmlTag.getTag() + "</small>";
	}

}
