package com.mca.samples.consumer;


import com.mca.client.annotation.enableMCAClient.EnableMcaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.thepavel.icomponent.InterfaceComponentScan;

@SpringBootApplication
@EnableMcaClient
@ComponentScan({"com.mca.samples", "com.mca.client"})
@InterfaceComponentScan
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
