package com.segovelo.jpamultipledb.dao.product;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.segovelo.jpamultipledb.model.product.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {


    List<Product> findAllByPrice(double price, Pageable pageable);
}