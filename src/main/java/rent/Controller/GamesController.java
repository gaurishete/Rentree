package rent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rent.Service.GamesInterface;

import rent.model.Games;

@RestController
@CrossOrigin("*")
public class GamesController {
	
	@Autowired
	private GamesInterface gamesIf;
	
	@PostMapping("/add/game")
	public Games addGame(@RequestBody Games g) {
		
		return gamesIf.addGame(g);
	}
	
	@PutMapping("/update/game")
	public Games updateGame(@RequestBody Games g) {
		return gamesIf.updateGame(g);
	}
	@DeleteMapping("/delete/game")
	public boolean deleteGame(@RequestParam("gid") int gid) {
		return gamesIf.deleteGame(gid);
	}
	
	@GetMapping("/find/game")
	public Games findById(@RequestParam("id") int gid) {
		return gamesIf.findById(gid);
	}
}
