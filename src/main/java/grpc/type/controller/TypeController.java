package grpc.type.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import grpc.type.dao.TypeRestDao;
import grpc.type.dto.TypeRestDto;

@RestController
@RequestMapping("/type")
public class TypeController {
	Map<String,TypeRestDto> userDB = Collections.synchronizedMap(new HashMap<String, TypeRestDto>());
	
	@Autowired
	TypeRestDao typeRestDao;
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public TypeRestDto getTypeByRest(@PathVariable("id") Long id){
		TypeRestDto typeRestDto=  typeRestDao.getTypeById(id);
		return typeRestDto;
    }
}
