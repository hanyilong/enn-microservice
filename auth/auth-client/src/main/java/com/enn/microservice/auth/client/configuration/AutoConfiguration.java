package com.enn.microservice.auth.client.configuration;

import com.enn.microservice.auth.client.config.ServiceAuthConfig;
import com.enn.microservice.auth.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ace on 2017/9/15.
 */
@Configuration
@ComponentScan({"com.enn.microservice.auth.client","com.enn.microservice.auth.common.event"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
