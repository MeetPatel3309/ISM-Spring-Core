package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.AddressController;
import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Spring.xml");
        
        System.out.println(container);
        
        UserController userController1 = container.getBean("UserController", UserController.class);
        
        System.out.println(userController1);
        System.out.println(userController1.getName());
        System.out.println(userController1.getSalary());
        
        AddressController add = container.getBean("AddressController", AddressController.class);
       
        System.out.println(add.getAddressDao().getCity());
        System.out.println(add.getAddressDao().getCountry());
        
        
        
    }
}
