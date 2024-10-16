package com.krillinator.Enterprise_Lektion_4_Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userPage(Model userModel) {

        List<User> userList = new ArrayList<>(
                List.of(
                        new User("Benny", "123"),
                        new User("Frida", "321"),
                        new User("Lennart", "abc")
                )
        );

        userModel.addAttribute("userList", userList);

        return "user";
    }

}
