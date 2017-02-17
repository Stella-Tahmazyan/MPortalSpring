package am.gitc.service;

import am.gitc.dao.impl.UserDaoImpl;
import am.gitc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gtc-user29 on 2/16/2017.
 */
@Service
@Transactional
public class UserManager {

    @Autowired
    private UserDaoImpl userDao;


    public User getUserByEmailPassword(String email, String password) throws Exception {
       return userDao.getUserByEmailPassword(email,password);
    }
}
