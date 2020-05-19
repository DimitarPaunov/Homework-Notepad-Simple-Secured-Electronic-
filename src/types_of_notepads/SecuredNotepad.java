package types_of_notepads;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	
	private String password;
	
	public SecuredNotepad(int pages,String password) {
		super(pages);
		if(!securityCheck(password)) {
			throw new IllegalArgumentException("Invalid password.");
		}
		this.password = password;
	}
	
	private boolean securityCheck(String password) {
		if(!(password.length() >=5)) return false;
		if(!password.matches(".*[A-Z].*")) return false;
		if(!password.matches(".*[a-z].*")) return false;
		if(!password.matches(".*[0-9].*")) return false;
		return true;
	}
	protected void checkPass() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter password");
			if(sc.nextLine().equals(this.password)) {
				return;
			}
			System.out.println("Invalid password ! Try again !");
		}
	}

	@Override
	public void addTextToPage(int pageNumber , String text) {
		System.out.println("To add text you have to enter notepad's password");
		checkPass();
		super.addTextToPage(pageNumber,text);	
	}
	
	@Override
	public void replaceTextInPage(int pageNumber, String text) {
		System.out.println("To replace text you have to enter notepad's password");
		checkPass();
		super.replaceTextInPage(pageNumber,text);
		
	}

	@Override
	public void removeText(int pageNumber) {
		System.out.println("To remove text have to enter notepad's password");
		checkPass();
		super.removeText(pageNumber);
		
	}

	@Override
	public void showAllPages() {
		System.out.println("To show the text and the title have to enter notepad's password");
		checkPass();
		super.showAllPages();
		
	}
	
	@Override
	public void searchWord(String word) {
		System.out.println("To search word you have to enter notepad's password");
		checkPass();
		super.searchWord(word);
	}
	
	@Override
	public void printAllPagesWithDigits() {
		System.out.println("To print all pages with digits you have to enter notepad's password");
		checkPass();
		super.printAllPagesWithDigits();
	}
	
	
	
}