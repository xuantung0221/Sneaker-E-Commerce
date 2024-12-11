package E_commerce.Sneaker.mapper;

import E_commerce.Sneaker.dtos.UserDTO;
import E_commerce.Sneaker.dtos.response.UserResponseDTO;
import E_commerce.Sneaker.model.User.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-11T05:38:02+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserDTO request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( request.getUsername() );
        user.setPassword( request.getPassword() );
        user.setEmail( request.getEmail() );
        user.setCreated_at( request.getCreated_at() );
        user.setPhone( request.getPhone() );
        user.setAddress( request.getAddress() );
        user.setGender( request.isGender() );

        return user;
    }

    @Override
    public UserResponseDTO toUserResponseDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDTO userResponseDTO = new UserResponseDTO();

        userResponseDTO.setUserId( user.getUserId() );
        userResponseDTO.setUsername( user.getUsername() );
        userResponseDTO.setPassword( user.getPassword() );
        userResponseDTO.setEmail( user.getEmail() );
        userResponseDTO.setCreated_at( user.getCreated_at() );
        userResponseDTO.setPhone( user.getPhone() );
        userResponseDTO.setAddress( user.getAddress() );
        userResponseDTO.setGender( user.isGender() );

        return userResponseDTO;
    }

    @Override
    public void updateUser(User user, UserDTO request) {
        if ( request == null ) {
            return;
        }

        user.setUsername( request.getUsername() );
        user.setPassword( request.getPassword() );
        user.setEmail( request.getEmail() );
        user.setCreated_at( request.getCreated_at() );
        user.setPhone( request.getPhone() );
        user.setAddress( request.getAddress() );
        user.setGender( request.isGender() );
    }
}