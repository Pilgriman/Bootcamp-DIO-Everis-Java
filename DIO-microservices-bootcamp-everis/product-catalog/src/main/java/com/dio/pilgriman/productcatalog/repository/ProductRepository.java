package com.dio.pilgriman.productcatalog.repository;

import com.dio.pilgriman.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
