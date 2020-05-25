package com.test.autowired;

import com.test.factorybean.FoodFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class AutoWiredBean {
    @Autowired
    private MessageService messageService;

    @Value("${db.driver}")
    private String driverClass;

}
