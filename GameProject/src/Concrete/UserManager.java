package Concrete;

import Abstract.UserService;
import Abstract.Verification;
import Entities.User;

public class UserManager implements UserService{

	Verification verification;
	
    public UserManager(Verification verification) {
		this.verification=verification;
	}
	
	@Override
	public void register(User user) {
		if (verification.checkIfRealPerson(user)) {
			System.out.println("The player has been added to the system. "+"\n"+"\n"+"Player name :"+user.getFullName()+"\n"+"Player identification number :"+user.getNationalId()+"\n"+"Player birth date :"+user.getBirthYear()+"\n"+"The player's identification number in the system :"+user.getId()+"\n");
		} else {
			System.out.println("User information could not be verified. Could not register to the system.");
		}
		
	}

	@Override
	public void updateData(User user) {
		System.out.println( "Player information updated : " + user.getFullName());
		
	}

	@Override
	public void deleteData(User user) {
		System.out.println("Player information has been deleted : " + user.getId() + " " + user.getFullName() + " " + user.getNationalId() + " " + user.getBirthYear());
		
	}
	
}
