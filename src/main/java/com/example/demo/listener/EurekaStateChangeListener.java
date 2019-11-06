package com.example.demo.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Classname EurekaStateChangeListener
 * @Description TODO
 * @Date 2019/9/3 13:22
 * @Created by gumei
 * @Author: lepua
 */
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent){
        System.out.println(eurekaInstanceCanceledEvent.getServerId()+"\t"+eurekaInstanceCanceledEvent.getAppName());
    }
}
