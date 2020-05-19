package types_of_notepads;

public class Page {
	
	private String title;
	private String text;
	
	public Page(String title) {
		this.title = title;
		this.text = "";
	}
	
	void addText(String text) {
		if(text != null) {
			if(this.text != null) {
				this.text += text;
			}
			else {
				this.text = text;
			}
		}
	}
	void replaceText(String text) {
		if(text != null && (!text.isEmpty())) {
			this.text = text;
		}
	}
	void removeText() {
		this.text = "";
		
	}
	void showPage() {
		System.out.println(title);
		System.out.println();
		System.out.println(text);
		System.out.println();
	}
	
	public String getText() {
		return this.text;
	}
	public String getTitle() {
		return this.title;
	}
	boolean searchWord(String word) {
		if(word != null) {
			this.text = this.text.replaceAll("[.!?\\-]", "");
			String [] textArr = this.text.split(" ");
			for(int i = 0; i < textArr.length; i++) {
				if(textArr[i].equals(word)) {
					return true;
				}
			}
		}
		return false;
	}
	boolean containsDigits() {
		if(this.text.matches(".*[0-9].*")) {
			return true;
		}
		return false;
	}
	

}
