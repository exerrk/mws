package io.github.exerrk.mws.client.boot;

import io.github.exerrk.mws.client.web.ApiResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evan Sidman
 * created in 02.2018
 */
@SpringBootApplication(scanBasePackages = "io.github.exerrk.mws.client")
@EnableScheduling
public class ClientBoot {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(ApiResource.class, args);
    }
}
