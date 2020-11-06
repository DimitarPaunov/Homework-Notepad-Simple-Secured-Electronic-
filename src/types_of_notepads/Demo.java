package types_of_notepads;

public class Demo {
	
	public static void main(String[] args) {
		
		ElectronicSecuredNotepad myDiary;
		
		try {
			
			myDiary = new ElectronicSecuredNotepad(5,"Dimitar");
			
			myDiary.isStarted();
			
			myDiary.start();
			
			myDiary.stop();
			
			myDiary.start();
			
			myDiary.addTextToPage(1, "Real Madrid is the best footbal club!");
			myDiary.addTextToPage(2, "LA Lakers is the best basketball club!");
			myDiary.addTextToPage(3, "LeBron James is one of the greatest athletes.");
			myDiary.addTextToPage(4, "Basketball is the most interesting sport!");
			myDiary.addTextToPage(5, "Football is the most popular sport in the world.");
			
			myDiary.showAllPages();
			
			myDiary.stop();
			
		}
		catch(InvalidPasswordException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
