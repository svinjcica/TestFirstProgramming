/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.HashMap;

/**
 *
 * @author MAJA
 */
public class DataBase {
    HashMap<String, User> users = new HashMap<String, User>();

    public User getUserByNickname(String nickname) {
        return users.get(nickname);
    }
}
