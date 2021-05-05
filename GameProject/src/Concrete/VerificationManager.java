package Concrete;

import Abstract.Verification;
import Entities.User;

public class VerificationManager implements Verification{
	User user;
	
	private String fullName = (" Samir Alizada ");
	private String nationalId = (" 123456789 ");
	private String birthYear = (" 2003 ");
	
	@Override
	public boolean checkIfRealPerson(User user) {
		if ((this.fullName.equals(user.getFullName()))&&(this.nationalId.equals(user.getNationalId()))&&(this.birthYear.equals(user.getBirthYear()))) {
			return true;
		} else {
				return false;
		}
	}
}
