package com.zensar.daos;

import java.util.List;

import com.zensar.entities.User;

/**
 * @author ram_kal;yani
 * @version 2.0
 * @creation_date 21st September 2019 5:29PM
 * @modification_date 28st september 2019 11:19aM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface.
 *				It is used in persistance layer of application.
 */
public interface UserDao {
	
	void insert(User user);
	void update(User user);
	void delete(User user);
	User getbyUsername(String username);
	List<User> getAll();
}
