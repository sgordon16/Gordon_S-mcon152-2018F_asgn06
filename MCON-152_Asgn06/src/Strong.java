
public class Strong extends HTMLtagDecorater {

	HTMLtag htmlTag;
	
	public Strong(HTMLtag htmlTag) {
		
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
	
		return "<strong>" + htmlTag.getTag() + "</strong>";
	}

}
