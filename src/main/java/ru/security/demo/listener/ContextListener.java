package ru.security.demo.listener;

import ru.security.demo.SecurityWebApplicationInitializer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        new SecurityWebApplicationInitializer();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
