package io.github.exerrk.mws.service.server.boot;

import io.github.exerrk.mws.service.server.service.ApiService;
import io.github.exerrk.mws.service.server.web.ApiResource;
import org.springframework.boot.SpringApplication;

/**
 * @author Evan Sid (a.k.a exerrk)
 * created in 08.2017
 */
public class ServerBoot {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(ApiResource.class, args);
    }
}
