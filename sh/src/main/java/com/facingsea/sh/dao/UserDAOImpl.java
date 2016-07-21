package com.facingsea.sh.dao;

import org.springframework.stereotype.Repository;

import com.facingsea.common.core.CommonDAO;
import com.facingsea.sh.domain.User;

@Repository
public class UserDAOImpl extends CommonDAO<User, Integer> implements UserDAO {

}
