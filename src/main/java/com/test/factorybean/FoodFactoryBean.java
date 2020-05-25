package com.test.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

@Component
public class FoodFactoryBean implements FactoryBean<Food> {
    @Override
    public Food getObject() throws Exception {
        return new Food("food from factory","1");
    }

    @Override
    public Class<?> getObjectType() {
        return Food.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
