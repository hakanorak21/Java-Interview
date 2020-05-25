package hakan;

/**
Write a return method that can verify if a password is valid or not.

Requirements:
 1. Password MUST be at least have 6 characters and should not contain space.
 2. Password should at least contain one upper case letter.
 3. Password should at least contain one lowercase letter.
 4. Password should at least contain one special characters.
 5. Password should at least contain a digit (number).

If all requirements above are met, the method returns true, 
otherwise returns  false.
 */
public class PasswordValidation {
	
	public static void main(String[] args) {
		
		boolean a = PassWordValidation("Houston@2019");
		System.out.println(a);
		
	}
	
	public static boolean PasswordValidation(String password) {
		boolean valid = true;
		int countUpperCase = 0;
		int countLowerCase = 0;
		int countSpecialCharacter = 0;
		int countDigit = 0;
		
		if (password.contains(" "))
			valid = false;
		else if (password.length() < 6)
			valid = false;	
		else {
			for (int i = 0; i < password.length(); i++) {
				//Upper case
				if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
					countUpperCase++;
				//Lower case
				else if (password.charAt(i) >= 97 && password.charAt(i) <= 122)
					countLowerCase++;
				//Special character
				else if (password.charAt(i) >= 33 && password.charAt(i) <= 47)
					countSpecialCharacter++;
				//Special character 2
				else if (password.charAt(i) >= 58 && password.charAt(i) <= 64)
					countSpecialCharacter++;
				//Special character 3
				else if (password.charAt(i) >= 91 && password.charAt(i) <= 96)
					countSpecialCharacter++;
				//Special character 4
				else if (password.charAt(i) >= 123 && password.charAt(i) <= 126)
					countSpecialCharacter++;
				//Digit
				else if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
					countDigit++;
				
			}
			
		}
			
		return valid && countUpperCase > 0 && countLowerCase > 0
				&& countSpecialCharacter > 0 && countDigit > 0;
	}
	
	//Muhtar's solution
	public static boolean PassWordValidation(String password) {

		String lowercase = "(.*[a-z].*)";
		String uppercase = "(.*[A-Z].*)";
		String numbers = "(.*[0-9].*)";
		String specialchars = "(.*[ -/, :-@].*)";  

		boolean HasLower = password.matches(lowercase),
				HasUpper = password.matches(uppercase),
				HasDigits = password.matches(numbers),
				HasSpecial = password.matches(specialchars),
				Valid = false;

		if(password.length() >= 6 && !password.contains(" "))
			if( HasLower && HasUpper && HasDigits && HasSpecial)
				Valid = true;      

		return Valid;

	}

}
