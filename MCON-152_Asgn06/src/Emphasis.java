
public class Emphasis extends HTMLtagDecorater {

	HTMLtag htmlTag;
	
	public Emphasis(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
	
		return "<em>" + htmlTag.getTag() + "</em>";
	}

}
