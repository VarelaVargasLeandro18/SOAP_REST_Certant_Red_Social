package com.restsoap.redsocial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.restsoap.redsocial.JPAEntityManagerFactory;
import com.restsoap.redsocial.dao.exceptions.CreateEntityException;
import com.restsoap.redsocial.dao.exceptions.DeleteEntityException;
import com.restsoap.redsocial.dao.exceptions.ReadEntityException;
import com.restsoap.redsocial.dao.exceptions.UpdateEntityException;
import com.restsoap.redsocial.dao.interfaces.IDAO;

/**
 * @author Varela Vargas Leandro Gastón
 * @param <T> Clase de la entidad.
 * @param <K> Clase/primitivo de la llave de la entidad.
 */
public abstract class AbstractDAO<T,K> implements IDAO<T,K> {
    
    private final Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    protected final EntityManager getEntityManager() {
        return JPAEntityManagerFactory.getEntityManager();
    }

    @Override
    public final T readOne(K id) throws ReadEntityException {
        
        T findedEntity = null;
        
        try {
            findedEntity = this.getEntityManager().find( this.entityClass , id );
        }
        catch ( Throwable ex ) {
            throw new ReadEntityException(ex);
        }
        
        return findedEntity;
        
    }

    @Override
    public final List<T> readAll() throws ReadEntityException {
        
        List<T> findedEntities;
        EntityManager em = this.getEntityManager();
        
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery();
            Root <T> rootEntity = cq.from(this.entityClass);
            
            cq.select(rootEntity);
            
            findedEntities = em.createQuery(cq).getResultList();
        }
        catch ( Throwable ex ) {
            throw new ReadEntityException(ex);
        }
        
        return findedEntities;
    }

    @Override
    public final void delete(T entity) throws DeleteEntityException  {
        try {
            this.getEntityManager().getTransaction().begin();
            entity = this.getEntityManager().merge(entity);
            this.getEntityManager().remove(entity);
            this.getEntityManager().getTransaction().commit();
        }
        catch ( Throwable ex ) {
            this.rollbackTransactions();
            throw new DeleteEntityException(ex);
        }
    }

    @Override
    public final T update(T updated) throws UpdateEntityException {
        try {
            return this.getEntityManager().merge(updated);
        }
        catch ( Throwable ex ) {
            throw new UpdateEntityException(ex);
        }
    }
    
    @Override
    public final T create( T created ) throws CreateEntityException {
        try {
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().persist(created);
            this.getEntityManager().getTransaction().commit();
            return created;
        } catch ( Throwable ex ) {
            this.rollbackTransactions();
            throw new CreateEntityException(ex);
        }
    }
    
    public final void rollbackTransactions() {
        this.getEntityManager().getTransaction().rollback();
    }
    
    public final void commitTransactions() {
        this.getEntityManager().getTransaction().commit();
    }
    
}
