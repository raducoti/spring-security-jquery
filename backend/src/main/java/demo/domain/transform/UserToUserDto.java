package demo.domain.transform;

import demo.domain.dto.UserDto;
import demo.domain.entity.Role;
import demo.domain.entity.User;

import java.util.function.Function;

public class UserToUserDto implements Function<User, UserDto> {

    @Override
    public UserDto apply(User user) {
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        for (Role role : user.getRoles()) {
            userDto.addRole(role.getRole());
        }
        return userDto;
    }
}