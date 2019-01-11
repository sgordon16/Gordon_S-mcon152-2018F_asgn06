
public class Progarn {

	public static void main(String[] args) {
		
		HTMLtag myTag1 = new Divider("Hello");
		myTag1.setID("message1");
		myTag1.setName("hello");
		myTag1 = new Underline(myTag1);
		myTag1 = new Emphasis(myTag1);
		Anchor anchor = new Anchor(myTag1);
		anchor.setHref("www.HelloWorld.com");
		myTag1 = anchor;
		System.out.println(myTag1.getTag());
		
		HTMLtag myTag2;
		Input input = new Input("Goodbye");
		input.setType("button");
		input.setEvent("onClick", "makeMove");
		myTag2 = input;
		myTag2 = new Italic(myTag2);
		myTag2 = new Small(myTag2);
		System.out.println(myTag2.getTag());
		
		HTMLtag myTag3 = new Header("Hello again", 1);
		myTag3 = new Strong(myTag3);
		myTag1.setID("message3");
		myTag1.setName("helloAgain");
		System.out.println(myTag3.getTag());
	}

}
 