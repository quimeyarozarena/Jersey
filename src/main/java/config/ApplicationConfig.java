package config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import resource.PersonResourceImpl;

@ApplicationPath("/*")
public class ApplicationConfig extends Application {
	
	    @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> s = new HashSet<Class<?>>();
	        s.add(PersonResourceImpl.class);
	        return s;
	    }

}
