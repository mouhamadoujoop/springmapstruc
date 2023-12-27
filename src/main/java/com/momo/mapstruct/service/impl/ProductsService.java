package com.momo.mapstruct.service.impl;

import com.momo.mapstruct.dto.ProductsDto;
import com.momo.mapstruct.entities.ProductsEntity;
import com.momo.mapstruct.mapper.ProductsMapper;
import com.momo.mapstruct.repository.ProductsRepository;
import com.momo.mapstruct.service.IProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductsService implements IProductsService {

    private ProductsMapper productsMapper;
    private ProductsRepository productsRepository;

    public ProductsService(ProductsMapper productsMapper, ProductsRepository productsRepository) {
        this.productsMapper = productsMapper;
        this.productsRepository = productsRepository;
    }

    @Override
    public ProductsDto save(ProductsDto productsDto) {

        log.info("===============INFO DTO================");
        log.info(productsDto.getRef() + "  " + productsDto.getName() + " " + productsDto.getIdUser());
        log.info("===============INFO DTO TO ENTITY================");
        ProductsEntity productsEntity = productsMapper.productsDtoToProductsEntity(productsDto);
        log.info(productsEntity.getRef() + "  " + productsEntity.getName() + " " + productsEntity.getUsersEntity().getId());
        log.info("===============INFO ENTITY TO DTO================");
        productsDto = productsMapper.productsEntityToProductsDto(productsEntity);
        log.info(productsDto.getRef() + "  " + productsDto.getName() + " " + productsDto.getIdUser());

        return productsMapper.productsEntityToProductsDto(
                productsRepository.save(
                        productsMapper.productsDtoToProductsEntity(productsDto)
                )
        );
    }
}
