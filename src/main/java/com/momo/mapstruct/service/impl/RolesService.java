package com.momo.mapstruct.service.impl;


import com.momo.mapstruct.dto.RolesDto;
import com.momo.mapstruct.mapper.RolesMapper;
import com.momo.mapstruct.repository.RolesRepository;
import com.momo.mapstruct.service.IRolesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RolesService implements IRolesService {

    private RolesRepository rolesRepository;
    private RolesMapper rolesMapper;
    @Override
    public RolesDto save(RolesDto rolesDto) {
        return rolesMapper.rolesEntityToRolesDto(
                rolesRepository.save(
                        rolesMapper.rolesDtoToRolesEntity(rolesDto)
                )
        );
    }
}
