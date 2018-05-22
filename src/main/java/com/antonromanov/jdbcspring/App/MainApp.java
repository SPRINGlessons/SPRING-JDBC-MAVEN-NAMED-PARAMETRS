package com.antonromanov.jdbcspring.App;

import com.antonromanov.jdbcspring.DAO.Customer;
import com.antonromanov.jdbcspring.DAO.UserDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {



    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");




        UserDAOImpl dataBean = (UserDAOImpl) ctx.getBean("mydatabean");
        dataBean.insert(new Customer());




    }


}
