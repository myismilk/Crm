package com.wangkaiping.crm.settings.service.impl;

import com.wangkaiping.crm.settings.dao.UserDao;
import com.wangkaiping.crm.settings.service.UserService;
import com.wangkaiping.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

}
