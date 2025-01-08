package net.ikkowy.numgen.controller;

import net.ikkowy.numgen.dto.UserDTO;
import net.ikkowy.numgen.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public void getUsers() {
    }

    @PostMapping("/users")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.convertEntityToDTO(
                userService.createUser(userDTO.getActive(), userDTO.getUsername(), userDTO.getPassword()));
    }

}
