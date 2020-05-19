package types_of_notepads;

public interface INotepad {
	
	void addTextToPage(int pageNumber , String text);
	
	void replaceTextInPage(int pageNumber, String text);
	
	void removeText(int pageNumber);
	
	void showAllPages();
	
	void searchWord(String word);
	
	void printAllPagesWithDigits();

}
