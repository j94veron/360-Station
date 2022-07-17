package com.ar.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ar.ecommerce.commons.GenericServiceImpl;
import com.ar.ecommerce.dao.api.OrdersDaoAPI;
import com.ar.ecommerce.model.Orders;
import com.ar.ecommerce.service.api.OrdersServiceAPI;


@Service
public class OrdersServiceImpl extends GenericServiceImpl<Orders, Long> implements OrdersServiceAPI {

	@Autowired
	private OrdersDaoAPI ordersDaoAPI;
	
	@Override
	public CrudRepository<Orders, Long> getDao() {
		return ordersDaoAPI;
	}

}