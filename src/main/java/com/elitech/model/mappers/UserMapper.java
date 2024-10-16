package com.elitech.model.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.model.dto.UserDTO;
import com.elitech.model.entities.User;

public class UserMapper {
private static final ModelMapper modelMapper=new ModelMapper();

public static UserDTO convertToDto(User user)
{
return modelMapper.map(user, UserDTO.class);	
}
public static User convertToEntity(UserDTO userDTO)
{
return modelMapper.map(userDTO, User.class);	
}
}
