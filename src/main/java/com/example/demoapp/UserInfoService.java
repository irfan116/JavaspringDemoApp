package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.IOException;

@Service
//@Profile("userInfo")
public class UserInfoService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserInfoService(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public UsersContact getUserContact(String universalId) throws IOException{
        String query = "select * from users where universal_id=?";
        return jdbcTemplate.queryForObject(query,
                new Object[]{universalId},
                (resultSet, i) -> new UsersContact(
                        resultSet.getLong("id"),
                        resultSet.getString("universal_id"),
                        resultSet.getString("phone"),
                        resultSet.getString("email"),
                        resultSet.getString("location"),
                        resultSet.getInt("language_id")
                ));
    }

}
