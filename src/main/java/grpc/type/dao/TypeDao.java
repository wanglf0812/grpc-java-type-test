package grpc.type.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import grpc.type.dto.TypeDto;

@Component
@Mapper
public interface TypeDao {
	
	public TypeDto getTypeById(Long id);

}
