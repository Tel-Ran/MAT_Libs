package mat;

import java.util.*;

public interface IFesBes1 {
	int setProfile(mat.Person person);
	int updateProfile(mat.Person person);
	int matLogin(String userName, String password);
	HashMap<Integer,String> getMattNames(String userName);
	mat.Matt getMatt(int mattId);
	int saveMatt(mat.Matt mattNew,String userName);//return mattId
	boolean removeMatt(int mattId);
	mat.Person getProfile(String userName);
	void setActive(String userName,String hashcode);
	void updateMatCalendarInSN(String userName, String snName);
	public int ifEmailExistsInDB(String email);
	boolean setGuests(int matID, String [] guestEmails);
	java.util.List<Notification> getNotifications(String guestName);
	Matt updateInvitationMatt(int matId,String username,
			HashMap<String, List<String>> calendars);
}
