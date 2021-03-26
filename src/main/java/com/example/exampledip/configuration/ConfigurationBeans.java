package com.example.exampledip.configuration;

import com.example.exampledip.implementations.Car;
import com.example.exampledip.implementations.Truck;
import com.example.exampledip.interfaces.Vehicle;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBeans {
    @Bean
    @ConditionalOnExpression("${dip.use.car:false}")
    public Vehicle vehicleCar(){
        return new Car();
    }

    @Bean
    @ConditionalOnExpression("not ${dip.use.car:false}")
    public Vehicle vehicleTruck(){
        return new Truck();
    }
}
