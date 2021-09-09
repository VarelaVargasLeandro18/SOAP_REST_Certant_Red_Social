package com.restsoap.redsocial.dao.interfaces;

import java.util.List;

import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;

/**
 * Interface que define la funcionalidad de un CRUD standard.
 * @author bapo
 * @param <T> Clase de la entidad.
 * @param <K> Clase del @Id de la entidad.
 */
public interface IDAO<T, K> {
    
    /**
     * Lee una entidad por ID.
     * @param id
     * @return entidad buscada o null si no la encuentra.
     * @throws dao_abstract.exceptions.ReadEntityException
     */
    public T readOne ( K id ) throws ReadEntityException;
    
    /**
     * Lee todas las entidades.
     * @return lista de entidades.
     * @throws dao_abstract.exceptions.ReadEntityException
     */
    public List<T> readAll () throws ReadEntityException;
    
    /**
     * Borra un entidad.
     * @param entity
     * @throws dao_abstract.exceptions.DeleteEntityException
     */
    public void delete ( T entity ) throws DeleteEntityException;
    
    /**
     * Actualiza una entidad.
     * @param updated
     * @return entidad actualizada.
     * @throws dao_abstract.exceptions.UpdateEntityException
     */
    public T update ( T updated ) throws UpdateEntityException;
    
    /**
     * Crea una entidad.
     * @param created 
     * @throws dao_abstract.exceptions.CreateEntityException 
     */
    public T create ( T created ) throws CreateEntityException;
    
}
