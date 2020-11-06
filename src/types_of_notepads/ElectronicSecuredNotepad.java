package types_of_notepads;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	private String announce = "The device has stopped or it hasnt't started yet!";
	
	
	public ElectronicSecuredNotepad(int pages, String password) throws InvalidPasswordException {
		
		super(pages, password);
		this.isStarted = false;
		
	}

	@Override
	public void start() {
		
		if(!this.isStarted) {
			
			this.isStarted = true;
			System.out.println("The device has started !");
		}
		
	}
	
	@Override
	public void stop() {
		
		if(isStarted) {
			
			isStarted = false;
			System.out.println("The device has stopped!");
		}
		
	}
	
	@Override
	public boolean isStarted() {
		
		if(isStarted) {
			
			System.out.println("The device is working right now");
			return true;
		}
		else {
			
			System.out.println(this.announce);
			return false;
		}
		
	}

	@Override
	public void addTextToPage(int pageNumber, String text) {
		
		if(this.isStarted) {
			super.addTextToPage(pageNumber, text);
		}
		
	}

	@Override
	public void replaceTextInPage(int pageNumber, String text) {
		
		if(this.isStarted) {
			super.replaceTextInPage(pageNumber, text);
		}
			
	}

	@Override
	public void removeText(int pageNumber) {
		
		if(this.isStarted) {
			super.removeText(pageNumber);
		}
		
	}

	@Override
	public void showAllPages() {
		
		if(this.isStarted) {
			super.showAllPages();
		}
		
	}
	
	@Override
	public void searchWord(String word) {
		
		if(this.isStarted) {
			super.searchWord(word);
		}
		
	}
	
	@Override
	public void printAllPagesWithDigits() {
		
		if(this.isStarted) {
			super.printAllPagesWithDigits();
		}
		
	}

}
