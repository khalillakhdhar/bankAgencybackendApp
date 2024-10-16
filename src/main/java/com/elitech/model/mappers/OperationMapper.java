package com.elitech.model.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.model.dto.OperationDTO;
import com.elitech.model.entities.Operation;

public class OperationMapper {
	private static final ModelMapper modelMapper=new ModelMapper();

	public static OperationDTO convertToDto(Operation operation)
	{
	return modelMapper.map(operation, OperationDTO.class);	
	}
	public static Operation convertToEntity(OperationDTO operationDTO)
	{
	return modelMapper.map(operationDTO, Operation.class);	
	}
}
