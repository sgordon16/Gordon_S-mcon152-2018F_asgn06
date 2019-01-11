
public class Underline extends HTMLtagDecorater {

	HTMLtag htmlTag;
	
	public Underline(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
	
		return "<u>" + htmlTag.getTag() + "</u>";
	}

}
