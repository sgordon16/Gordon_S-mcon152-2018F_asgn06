
public class Italic extends HTMLtagDecorater {

	HTMLtag htmlTag;
	
	public Italic(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
	
		return "<i>" + htmlTag.getTag() + "</i>";
	}

}
