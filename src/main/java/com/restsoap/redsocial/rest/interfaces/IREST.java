package com.restsoap.redsocial.rest.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;

@RequestMapping("/default")
public interface IREST<T,K> {
	
	@GetMapping
	public List<T> getAll() throws ReadEntityException;
	
	@GetMapping("/{id}")
	public T getOne( @PathVariable K id ) throws ReadEntityException;
	
	@PostMapping
	public T post( T object ) throws CreateEntityException;
	
	@DeleteMapping("/{id}")
	public void delete ( @PathVariable K id) throws ReadEntityException, DeleteEntityException;
	
	@PutMapping
	public T put( T entity ) throws UpdateEntityException;
	
}
