package com.momo.mapstruct.repository;
import com.momo.mapstruct.entities.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<ProductsEntity, String> {
}
