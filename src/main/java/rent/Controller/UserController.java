package rent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rent.Service.UserServiceInterface;
import rent.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserServiceInterface userService;
	
	@PostMapping("/add/user")
	public long addUser(@RequestBody User u) {
		return userService.addUser(u);
	}
	
	@PutMapping("/update/user")
	public boolean updateUser(@RequestBody User u) {
		return userService.updateUser(u);
	}
	
	@DeleteMapping("/delete/user")
	public boolean deleteUser(@RequestParam("uid") long userId) {
		return userService.deleteUser(userId);
	}

}
