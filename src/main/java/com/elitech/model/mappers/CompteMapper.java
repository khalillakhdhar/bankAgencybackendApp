package com.elitech.model.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.model.dto.CompteDTO;
import com.elitech.model.entities.Compte;

public class CompteMapper {
	private static final ModelMapper modelMapper=new ModelMapper();

	public static CompteDTO convertToDto(Compte compte)
	{
	return modelMapper.map(compte, CompteDTO.class);	
	}
	public static Compte convertToEntity(CompteDTO compteDTO)
	{
	return modelMapper.map(compteDTO, Compte.class);	
	}
}
