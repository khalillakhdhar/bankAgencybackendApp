package com.elitech.services;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.model.dto.CompteDTO;
import com.elitech.model.dto.UserDTO;

public interface UserService {
	public UserDTO addOneUser(UserDTO userDTO);
	public Page<UserDTO> getAllUsers(Pageable pageable);
	public Optional<UserDTO> getOneUtilisateur(long id);
	public void deleOneUser(long id);
	public UserDTO assignCompteToUser(long idUser,CompteDTO compteDTO);
	public UserDTO assignUserToAgence(long idUser,long idAgence);
	public UserDTO assignResponsableToUser(long idUser,long idResponsable);

}
