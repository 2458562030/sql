package com.example.sql.modules.service.mapper;

import com.example.sql.modules.domain.TestUserEntity;
import com.example.sql.modules.service.Dto.UserDto;
import com.example.sql.utils.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends EntityMapper<UserDto, TestUserEntity> {

}
