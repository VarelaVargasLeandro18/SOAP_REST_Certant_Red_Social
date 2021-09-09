package com.restsoap.redsocial.services.interfaces;

import java.util.List;

import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;

public interface IService<T, K> {
	
	public List<T> findAll() throws ReadEntityException;
	public T find ( K key ) throws ReadEntityException;
	public void delete ( K key ) throws ReadEntityException, DeleteEntityException;
	public T update ( T entity ) throws UpdateEntityException;
	public T create( T entity ) throws CreateEntityException;
	
}