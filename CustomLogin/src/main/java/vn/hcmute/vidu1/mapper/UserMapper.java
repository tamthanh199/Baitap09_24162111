package vn.hcmute.vidu1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import vn.hcmute.vidu1.dto.UserDTO;
import vn.hcmute.vidu1.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(
        target = "roleName",
        source = "role.name"
    )
    UserDTO toDTO(User user);
}