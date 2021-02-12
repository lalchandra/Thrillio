package com.semanticsqaure.Thrillio.dao;

import com.semanticsquare.Thrillio.DataStore;
import com.semanticsquare.Thrillio.entities.User;

public class UserDao {
    public User[] getUser() {
    	return DataStore.getUsers();
    }
}
