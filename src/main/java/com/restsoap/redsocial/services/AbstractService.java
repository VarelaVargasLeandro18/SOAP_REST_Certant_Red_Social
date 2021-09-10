package com.restsoap.redsocial.services;

import java.util.List;

import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;
import com.restsoap.redsocial.dao.interfaces.IDAO;
import com.restsoap.redsocial.services.interfaces.IService;

public abstract class AbstractService<T, K> implements IService<T, K> {
	
	private final IDAO<T, K> dao;
	
	public AbstractService( IDAO<T, K> dao ) {
		this.dao = dao;
	}
	
	protected IDAO<T,K> getDao() {
		return this.dao;
	}

	@Override
	public List<T> findAll() throws ReadEntityException {
		return this.dao.readAll();
	}

	@Override
	public T find(K key) throws ReadEntityException {
		return this.dao.readOne(key);
	}

	@Override
	public void delete(K key) throws ReadEntityException, DeleteEntityException {
		T entity = this.find(key);
		this.dao.delete(entity);
	}

	@Override
	public T update(T entity) throws UpdateEntityException {
		return this.dao.update(entity);
	}

	@Override
	public T create(T entity) throws CreateEntityException {
		return this.dao.create(entity);
	}
}