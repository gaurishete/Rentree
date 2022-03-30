package rent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rent.Service.BooksInterface;
import rent.model.Books;

@RestController
@CrossOrigin("*")
public class BooksController {
	
	@Autowired
	private BooksInterface bkInterface;
	
	@GetMapping("/add/book")
	public boolean addBook(@RequestBody Books b) {
		return bkInterface.addBook(b);
	}
	@PutMapping("/update/book")
	public Books updateBook(@RequestBody Books b) {
		return bkInterface.updateBook(b);
	}
	
	@DeleteMapping("/delete/book")
	public boolean deleteBook(@RequestParam("bookId") int bookId) {
		return bkInterface.deleteBook(bookId);
	}
	
	@GetMapping("/find/book")
	public Books findById(@RequestParam("id") int bookId) {
		return bkInterface.findById(bookId);
	}
	
}
