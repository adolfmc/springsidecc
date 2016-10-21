/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.kzhong.huamu.quickstart.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kzhong.huamu.quickstart.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
