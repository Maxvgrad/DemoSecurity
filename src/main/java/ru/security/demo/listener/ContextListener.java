package ru.security.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("--init--");
//        new SecurityWebApplicationInitializer();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("--destroy--");
    }
}
