package ru.security.demo;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import ru.security.demo.config.WebSecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SecurityWebApplicationInitializer() {
        super(WebSecurityConfig.class);
    }
}
