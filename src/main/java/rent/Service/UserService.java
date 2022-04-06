package rent.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rent.dao.UserDao;
import rent.model.Books;
import rent.model.User;

@Service
public class UserService implements UserServiceInterface {
	@Autowired
		UserDao userDao;
	@Override
	public long addUser(User u) {
		// TODO Auto-generated method stub
		User userReceived=userDao.save(u);
		if(userReceived !=  null) {
			return userReceived.getUserId();
		}
		
		return 0;
	}

	

	@Override
	public boolean deleteUser(long userId) {
		userDao.deleteById(userId);
		Optional<User> searchResult= userDao.findById(userId);
		if(searchResult.isPresent())
			return false;
		else
		return true;
	}

	@Override
	public List<Books> addBooksToCart(int bookId) {
		
		return null;
	}

	@Override
	public List<Books> removeBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		 Optional<User> searchResult= userDao.findById(u.getUserId());
		 if(searchResult.isPresent())
		 {
			 User foundUser=searchResult.get();
			 foundUser.setAddress(u.getAddress());
			 foundUser.setContactNumerPrimary(u.getContactNumerPrimary());
			 foundUser.setEmail(u.getEmail());
			 foundUser.setFirstName(u.getFirstName());
			 foundUser.setLastName(u.getLastName());
			 foundUser.setPin(u.getPin());
			 userDao.save(foundUser);
			 return true;
		 }
		return false;
	}

}
