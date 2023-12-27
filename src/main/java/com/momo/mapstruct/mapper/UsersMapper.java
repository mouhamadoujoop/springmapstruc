package com.momo.mapstruct.mapper;

import com.momo.mapstruct.dto.UsersDto;
import com.momo.mapstruct.entities.UsersEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper (componentModel = "spring", uses = {RolesMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UsersMapper {

    UsersEntity usersDtoToUsersEntity (UsersDto usersDto);
    //@Mapping(target = "rolesDtos", source = "rolesEntities") //ceci peut marche mais cest a creuser
    UsersDto usersEntityToUsersDto (UsersEntity usersEntity);
}
