package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Author;
import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Book;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.AuthorService;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.BookService;

@Controller
@RequestMapping("/admin")
public class updationBookController {


    @Autowired
    AuthorService authorService;

    @Autowired
    BookService bookService;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/addBook")
    public String addBook()
    {
        return "admin/addBook";
    }

    @PostMapping("/addBook")
    public String processAddBook(@RequestParam String title , @RequestParam(defaultValue = "false") boolean isAvailable , @RequestParam String author) throws Exception
    {
        logger.info("adding process is started ");
        logger.info(title);
        logger.info(author);

        Author details = authorService.findAuthorbyname(author);
        Book book = new Book();
        book.setTittle(title);
        book.setAuthor(details);
        book.setAvailable(isAvailable);
       logger.info( bookService.saveBook(book).toString());
        return "redirect:/admin/adminDashboard";
    }

    @GetMapping("/updatebook")
    public String updateBookDetails(Model model) {
        return "admin/updateBook";
    }

    @PostMapping("/update-book-details")
    public String fetchBookDetails(@RequestParam String bookName, Model model) {
        logger.info("method is recahing here ");
        Book book = bookService.findBTitle(bookName);

        if (book != null) {
            model.addAttribute("book", book);
            model.addAttribute("authors", book.getAuthor());
            return "admin/updateBook"; // This will display the form with the book details
        } else {
            model.addAttribute("message", "Book not found");
            return "admin/updateBook";
        }
    }

    @PostMapping("/update-book-action")
    public String updateBookDetails(@RequestParam String bookId, @RequestParam String title, 
                                    @RequestParam boolean isAvailable, @RequestParam String authorId, 
                                    Model model) throws Exception {
       Book book = bookService.findById(bookId);
        
        if (book != null) {
            book.setTittle(title);
            book.setAvailable(isAvailable);
            Author author = authorService.findById(authorId);
            book.setAuthor(author);
            
            logger.info(bookService.saveBook(book).toString());
            model.addAttribute("message", "Book details updated successfully");
            return "updateBook";
        } else {
            model.addAttribute("message", "Error updating book details");
            return "updateBook";
        }
    }
    

}
