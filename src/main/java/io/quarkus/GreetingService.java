package io.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Welcome to Quarkus and Azure Function at IstioCon, " + name;
    }
    
}
