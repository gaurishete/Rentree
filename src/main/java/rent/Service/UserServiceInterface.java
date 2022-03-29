package rent.Service;

import java.util.List;

import rent.model.Books;
import rent.model.User;

public interface UserServiceInterface {
	
	long addUser(User u);
	boolean updateUser(User u);
	boolean deleteUser(long userId);
	List<Books> addBooksToCart(int bookId);
	List<Books> removeBook(int bookId);
	
}
