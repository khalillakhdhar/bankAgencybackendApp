package com.elitech.services.implementation;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.model.dto.CompteDTO;
import com.elitech.model.dto.UserDTO;
import com.elitech.model.entities.Agence;
import com.elitech.model.entities.Compte;
import com.elitech.model.entities.User;
import com.elitech.model.mappers.CompteMapper;
import com.elitech.model.mappers.UserMapper;
import com.elitech.repositories.AgenceRepository;
import com.elitech.repositories.CompteRepository;
import com.elitech.repositories.EmployeeRepository;
import com.elitech.repositories.UserRepository;
import com.elitech.services.UserService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

	private final UserRepository userRepository;
	private final CompteRepository compteRepository;
	private final EmployeeRepository employeeRepository;
	
	private final AgenceRepository agenceRepository;
	
	@Override
	public UserDTO addOneUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user=UserMapper.convertToEntity(userDTO);
		User savedUser=userRepository.save(user);
		return UserMapper.convertToDto(savedUser);
	}

	@Override
	public Page<UserDTO> getAllUsers(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<User> users=userRepository.findAll(pageable);
		return users.map(UserMapper::convertToDto);
	}

	@Override
	public Optional<UserDTO> getOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).map(UserMapper::convertToDto);
		
	}

	@Override
	public void deleOneUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public UserDTO assignCompteToUser(long idUser, CompteDTO compteDTO) {
		// TODO Auto-generated method stub
		User user=userRepository.findById(idUser)
				.orElseThrow(()->new EntityNotFoundException("utilisateur avec id "+idUser+ "not found"));
		Compte compte =CompteMapper.convertToEntity(compteDTO);
		compte.setUser(user);
		Compte cp=compteRepository.save(compte);
		user.getComptes().add(cp);
		return UserMapper.convertToDto(user);
		
		
	}

	@Override
	public UserDTO assignUserToAgence(long idUser, long idAgence) {
		// TODO Auto-generated method stub
		User user=userRepository.findById(idUser)
				.orElseThrow(()->new EntityNotFoundException("utilisateur avec id "+idUser+ "not found"));
		Agence agence=agenceRepository.findById(idAgence)
				.orElseThrow(()->new EntityNotFoundException("agence avec id "+idAgence+ "not found"));
		agence.getUsers().add(user);
		user.getAgences().add(agence);
		agenceRepository.save(agence);
		return UserMapper.convertToDto(user);
	}

	@Override
	public UserDTO assignResponsableToUser(long idUser, long idResponsable) {
		// TODO Auto-generated method stub
		return null;
	}

}
