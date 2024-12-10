package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class updationBookController {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/addBook")
    public String addBook()
    {
        return "admin/addBook";
    }

    @PostMapping("/addBook")
    public String processAddBook(@RequestParam String title , @RequestParam(defaultValue = "false") boolean isAvailable , @RequestParam String author)
    {
        logger.info("adding process is started ");
        logger.info(title);
        logger.info(author);
        return "redirect:/admin/adminDashboard";
    }

}
