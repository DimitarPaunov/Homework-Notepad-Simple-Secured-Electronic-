package types_of_notepads;

public class InvalidPasswordException extends Exception {
	
	InvalidPasswordException(){
		super("Invalid password !\nThe password should be minimum 5 lenght characters and contain at least one uppercase letter, one numeric character and one lowercase letter. ");
	}
	
	InvalidPasswordException(Throwable cause){
		super("Invalid password !\nThe password should be minimum 5 lenght characters and contain at least one uppercase letter, one numeric character and one lowercase letter." +cause);
	}

}
