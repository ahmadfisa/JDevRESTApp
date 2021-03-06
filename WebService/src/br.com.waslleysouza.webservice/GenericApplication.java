package br.com.waslleysouza.webservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
public class GenericApplication extends Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        // Register root resources.
        classes.add(EmployeesResource.class);

        // Register provider classes.
        // Test commit.

        return classes;
    }
}
