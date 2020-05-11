package SimpleNotepad;

import java.util.ArrayList;

public class SimpleNotepad implements INotepad {
	
	private ArrayList<Page> pages;
	
	public SimpleNotepad(int pages) {
		this.pages = new ArrayList<Page>();
		if(pages > 0) {
			for(int i = 0; i < pages; i++) {
				Page p = new Page("Page " + (i+1));
				this.pages.add(p);
				
			}
		}
	}
	
	protected boolean checkPage(int pageNumber) {
		if(pageNumber > 0 && pageNumber < this.pages.size()){
			return true;
		}
		System.out.println("Invalid number of page");
		return false;
	}
	@Override
	public void addTextToPage(int pageNumber, String text) {
		if(checkPage(pageNumber)) {
			this.pages.get(pageNumber-1).addText(text);
		}
	}	

	@Override
	public void replaceTextInPage(int pageNumber, String text) {
		if(checkPage(pageNumber)) {
			Page p = this.pages.get(pageNumber-1);
			p.removeText();
			p.addText(text);
		}
		
	}

	@Override
	public void removeText(int pageNumber) {
		if(checkPage(pageNumber)) {
			Page p = this.pages.get(pageNumber-1);
			p.removeText();
		}
	}

	@Override
	public void showAllPages() {
		for (int i = 0; i < this.pages.size(); i++) {
			this.pages.get(i).showPage();
		}	
	}
	
	@Override
	public void searchWord(String word) {
		
		boolean hasWord = false;
		
		for(int i = 0; i < this.pages.size(); i++) {
			if(this.pages.get(i).searchWord(word) != false) {
				hasWord = true;
				break;
			}
		}
		if(hasWord) {
			System.out.println("there is such word");
		}
		else {
			System.out.println("There is NOT such word!");
		}
		
	}

	@Override
	public void printAllPagesWithDigits() {
		
		boolean contains = false;
		
		for(int i = 0; i < pages.size(); i++) {
			if(!(this.pages.get(i).containsDigits())) {
				continue;
			}
			else {
				contains = true;
				this.pages.get(i).showPage();
				
			}
		}
		
		if(!contains) {
			System.out.println("No such page !");
		}


		
	}
	
	
}
