package com.zensar.services;

import java.util.List;

import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

/**
 * @author ram_kalyani
 * @version 1.0
 * @creation_date 21st September 2019 5:59PM
 * @modification_date 21st september 2019 5:59PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Business Service Interface .
 * 				It is used in Business Layer.
 */

public interface UserService {
	void addUser(User user)throws ServiceException;
	void updateUser(User user)throws ServiceException;
	void removeUser(User user)throws ServiceException;
	User findUserByUsername(String username)throws ServiceException;
	List<User> findAllUsers()throws ServiceException;
	
	boolean validateUser(User user)throws ServiceException;
	

}
