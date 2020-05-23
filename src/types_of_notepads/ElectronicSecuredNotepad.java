package types_of_notepads;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	private String announce = "The device has stopped or it hasnt't started yet!";
	
	
	public ElectronicSecuredNotepad(int pages, String password) {
		
		super(pages, password);
		this.isStarted = false;
		
	}

	@Override
	public void start() {
		
		if(!this.isStarted) {
			this.isStarted = true;
		}
		
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {
		
		if(!this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.addTextToPage(pageNumber, text);
		
	}

	@Override
	public void replaceTextInPage(int pageNumber, String text) {
		
		if(!this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.replaceTextInPage(pageNumber, text);
		
	}

	@Override
	public void removeText(int pageNumber) {
		
		if(!this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.removeText(pageNumber);
		
	}

	@Override
	public void showAllPages() {
		
		if(!this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.showAllPages();
		
	}
	
	@Override
	public void searchWord(String word) {
		
		if(!this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.searchWord(word);
		
	}
	
	@Override
	public void printAllPagesWithDigits() {
		
		if(this.isStarted) {
			System.out.println(this.announce);
			return;
		}
		super.printAllPagesWithDigits();
		
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
