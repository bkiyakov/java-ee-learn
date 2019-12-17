package com.bknow.test_hibernate;

import com.bknow.test_hibernate.models.TodoItem;
import com.bknow.test_hibernate.models.User;
import com.bknow.test_hibernate.services.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserService userService = new UserService();
        User user = new User("Masha");
        userService.saveUser(user);
        
        TodoItem todo1 = new TodoItem("First todo");
        user.addTodo(todo1);
        
        TodoItem todo2 = new TodoItem("Second todo");
        user.addTodo(todo2);
        
        userService.updateUser(user);
        
        user.removeTodo(todo1);
    }
}
