package com.example.demoapp;

import com.jessecoyle.JCredStash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;


@Configuration
@PropertySource("classpath:application.properties")
//@Profile("mysql")
public class MysqlConfig {
    private ProfileService profileService;
    private Environment environment;

    @Autowired
    public MysqlConfig(ProfileService profileService){
        this.profileService = profileService;
    }

    public String getProperty(String profile, String prop){
        return profileService.getProperty(String.format("db.%s.%s",profile,prop));
    }

    private DriverManagerDataSource prepDataSource(String profile){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(
                String.format(
                        "jdbc:mysql://%s:3306/%s",
                        getProperty(profile, "host"),
                        getProperty(profile, "db")
                )
        );
        dataSource.setUsername(getProperty(profile,"user"));
        return dataSource;
    }

    @Bean
    public DataSource dataSource() throws SQLException{
        String env = profileService.getEnv();
        DriverManagerDataSource dataSource = prepDataSource(env);
        dataSource.setPassword(
                (env.equals("local")) ? getPassword() : getProperty(env, "pass")
        );

        return dataSource;
    }

    public String getPassword(){
        //JCredStash credStash = new JCredStash();

        //String result = credStash.getSecret(getProperty("local","pass"), new HashMap());

        return "root";
    }
}

