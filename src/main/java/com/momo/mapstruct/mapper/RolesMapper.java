package com.momo.mapstruct.mapper;

import com.momo.mapstruct.dto.RolesDto;
import com.momo.mapstruct.dto.UsersDto;
import com.momo.mapstruct.entities.RolesEntity;
import com.momo.mapstruct.entities.UsersEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RolesMapper {

    RolesEntity rolesDtoToRolesEntity (RolesDto rolesDto);
    List<RolesEntity> rolesDtoListToRolesEntityList (List<RolesDto> rolesDtos);
    List<RolesDto> rolesEntityListToRolesDtoList (List<RolesEntity> rolesEntities);
    RolesDto rolesEntityToRolesDto (RolesEntity rolesEntity);
}
