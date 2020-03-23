package springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springmvc.model.User;
import springmvc.service.UserService;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService service;

    private static final Log logger = LogFactory.getLog(UserController.class);

    @GetMapping("/userForm")
    public String showUsers(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userForm";
    }

    @PostMapping("/insert")
    public String addUser(@ModelAttribute("user") User user) {
        service.add(user);
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String showFromForUpdate(@RequestParam("id") Long id, Model model) {
        User user = service.getUserById(id);
        model.addAttribute("user", user);
        return "editForm";
    }

    @GetMapping("/upgrade")
    public String saveUser(@ModelAttribute("user") User user) {
        service.updateUser(user);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") Long id) {
        User user = service.getUserById(id);
        service.delete(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<User> users = service.getUsers();
        model.addAttribute("users", users);
        return "list";
    }

    @GetMapping("/deleteAll")
    public String deleteUsers() {
        service.deleteAll();
        return "redirect:/list";
    }

}
