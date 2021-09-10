package com.restsoap.redsocial.rest;

import java.util.List;

import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;
import com.restsoap.redsocial.rest.interfaces.IREST;
import com.restsoap.redsocial.services.interfaces.IService;

public abstract class AbstractREST<T,K> implements IREST<T,K>{
	
	private IService<T,K> service;
	
	public AbstractREST ( IService<T,K> service ) {
		this.service = service;
	}
	
	protected IService<T,K> getService() {
		return this.service;
	}
	
	@Override
	public List<T> getAll() throws ReadEntityException {
		return this.getService().findAll();
	}

	@Override
	public T getOne(K id) throws ReadEntityException {
		return this.getService().find(id);
	}

	@Override
	public T post(T object) throws CreateEntityException {
		return this.getService().create(object);
	}

	@Override
	public void delete( K id ) throws ReadEntityException, DeleteEntityException {
		this.getService().delete(id);
	}

	@Override
	public T put(T entity) throws UpdateEntityException {
		return this.getService().update(entity);
	}
	
	
	
}
