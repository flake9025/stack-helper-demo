package fr.vvlabs.stackhelper.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Configuration
public class JacksonConfiguration  {
    
    @Autowired(required = true)
    public void configureJackson(ObjectMapper jackson2ObjectMapper) {
        jackson2ObjectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));
    }
}
