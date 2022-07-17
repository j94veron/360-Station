package com.ar.ecommerce.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.ar.ecommerce.model.Orders;

public interface OrdersDaoAPI extends CrudRepository<Orders, Long> {

}
