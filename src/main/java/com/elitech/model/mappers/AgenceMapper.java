package com.elitech.model.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.model.dto.AgenceDTO;
import com.elitech.model.entities.Agence;

public class AgenceMapper {
	private static final ModelMapper modelMapper=new ModelMapper();

	public static AgenceDTO convertToDto(Agence agence)
	{
	return modelMapper.map(agence, AgenceDTO.class);	
	}
	public static Agence convertToEntity(AgenceDTO agenceDTO)
	{
	return modelMapper.map(agenceDTO, Agence.class);	
	}
}
