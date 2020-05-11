package SimpleNotepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	
	public ElectronicSecuredNotepad(int pages, String password) {
		super(pages, password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		if(!isStarted) {
			isStarted = true;
		}
		
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {
		if(isStarted) {
			super.addTextToPage(pageNumber, text);
		}
	}

	@Override
	public void replaceTextInPage(int pageNumber, String text) {
		if(isStarted) {
			super.replaceTextInPage(pageNumber, text);
		}	
	}

	@Override
	public void removeText(int pageNumber) {
		if(isStarted) {
			super.removeText(pageNumber);
		}
	}

	@Override
	public void showAllPages() {
		if(isStarted) {
			super.showAllPages();
		}
	}
	@Override
	public void searchWord(String word) {
		if(isStarted) {
			super.searchWord(word);
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(isStarted) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void stop() {
		if(isStarted) {
			isStarted = false;
		}
		
	}

	@Override
	public boolean isStarted() {
		System.out.println(this.isStarted);
		return this.isStarted;
	}

}
