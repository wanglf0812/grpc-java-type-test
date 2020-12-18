package grpc.type.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import grpc.type.dto.TypeRestDto;

@Component
@Mapper
public interface TypeRestDao {
	
	public TypeRestDto getTypeById(Long id);

}
