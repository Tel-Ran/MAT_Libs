package mat;

public interface IFesBes1 {
	int setProfile(mat.Person person);
	int updateProfile(mat.Person person);
	int matLogin(String username, String password);
	String [] getMattNames(String username);
	mat.Matt createMatt(mat.MattData data, String username);
	mat.Matt getMatt(String mattName, String username);
	boolean saveMatt(mat.Matt mattOld,mat.Matt mattNew,String username );
	boolean removeMatt(String mattName, String username);
	mat.Person getProfile(String username);
	void setActive(String username,String hashcode);
	void updateMatCalendarInSN(String username, String snName);
	public int ifEmailExistsInDB(String email);
	void setGuests(String username, String tableName, String [] guestEmails);
	java.util.List<mat.Notification> getNotifications(String guestName);
}
