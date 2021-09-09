package com.restsoap.redsocial.services.interfaces;

public interface IService<T> {
	
	public T findAll();
	public T find ( T entity );
	public T delete ( T entity );
	public T update ( T entity );
	public T create( T entity );
	
}
