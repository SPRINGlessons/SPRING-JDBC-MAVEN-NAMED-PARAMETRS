package com.antonromanov.jdbcspring.DAO;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO{



    //insert example
    public void insert(Customer customer){
        final  char dm = (char) 34;
        String sql = "INSERT INTO public." + dm + "Test" + dm + "  (id, name) VALUES (:id, :name)";

      //  private static final String query = "INSERT INTO public." + dm + "Test" + dm + " (name) VALUES (?)";


        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("id", customer.getCustId());

        System.out.println("Имя - " + customer.getName());
        parameters.put("name", customer.getName());




        getNamedParameterJdbcTemplate().update(sql, parameters);



    }

}
