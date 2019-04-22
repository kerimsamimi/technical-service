package com.tr.kerimsamimi.technicalservice.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerPortCustomizer 
  implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
  
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(8086);//8080 portunu 8086'ya çektim
    }
}

