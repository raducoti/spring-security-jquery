package demo.service;

import demo.domain.dto.UserDto;
import demo.domain.entity.User;
import demo.domain.transform.UserToUserDto;
import demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(user -> new UserToUserDto().apply(user))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<UserDto> findByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        UserDto userDto = null;
        if (user.isPresent()) {
            userDto = new UserToUserDto().apply(user.get());
        }
        return Optional.ofNullable(userDto);
    }
}