package com.momo.mapstruct.repository;


import com.momo.mapstruct.entities.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RolesEntity, Integer> {
}
