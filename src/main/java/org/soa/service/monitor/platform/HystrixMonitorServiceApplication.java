package org.soa.service.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer; 
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by frodo on 2017/8/6.
 */ 
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class HystrixMonitorServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HystrixMonitorServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HystrixMonitorServiceApplication.class, args);
    }
}
