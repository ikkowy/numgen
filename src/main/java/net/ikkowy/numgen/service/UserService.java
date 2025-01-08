package net.ikkowy.numgen.service;

import net.ikkowy.numgen.dto.UserDTO;
import net.ikkowy.numgen.model.User;
import net.ikkowy.numgen.repository.UserRepository;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(boolean active, String username, String password) {
        User user = new User();
        user.setActive(active);
        user.setUsername(username);
        Argon2PasswordEncoder argon2PasswordEncoder = new Argon2PasswordEncoder(16, 32, 1, 60000, 10);
        user.setPasswordHash(argon2PasswordEncoder.encode(password));
        return userRepository.save(user);
    }

    public UserDTO convertEntityToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setActive(user.getActive());
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }

}
