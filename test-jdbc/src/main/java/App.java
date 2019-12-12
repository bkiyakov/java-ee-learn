import dao.UserDAOImpl;
import models.User;

public class App {

	public static void main(String[] args) throws Exception {
		
		
		UserDAOImpl userDao = new UserDAOImpl();
		User user = userDao.getUsernameById(1);
		
		System.out.println(user.getUsername());
		
		userDao.addUser("userfromjava");
	}

}
