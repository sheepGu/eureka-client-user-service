package com.example.demo.Indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @Classname CustomHealthIndicator
 * @Description TODO
 * @Date 2019/9/2 19:52
 * @Created by gumei
 * @Author: lepua
 */
//@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.down().withDetail("status",true);
    }
}
