package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOChat;
import com.restsoap.redsocial.modelo.Chat;

public class ChatDAO extends AbstractDAO<Chat, Long> implements IDAOChat {

	public ChatDAO(Class<Chat> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}