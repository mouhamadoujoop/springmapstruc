package com.momo.mapstruct.repository;



import com.momo.mapstruct.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
}
