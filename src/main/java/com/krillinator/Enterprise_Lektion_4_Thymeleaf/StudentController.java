package com.krillinator.Enterprise_Lektion_4_Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController --> Returns a body as response
@Controller // --> Returns DOCUMENTS
public class StudentController {

    @GetMapping("/student")
    public String studentPage(Model studentModel) {

        Student student = new Student("Benny", "benny123@hotmail.com");

        studentModel.addAttribute("myStudent", student);

        return "student";  // Thymeleaf, doesn't require .html
    }

}
