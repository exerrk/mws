package io.github.exerrk.mws.service.server.web;

import io.github.exerrk.mws.service.server.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evan Sidman
 * created in 08.2017
 */
@RestController
@RequestMapping(value = "api")
@EnableAutoConfiguration
@ComponentScan("io.github.exerrk.mws.service.server.service")
public class ApiResource {

    @Autowired
    ApiService apiService;

    @RequestMapping (value = "/ping")
    public ResponseEntity<Void> ping(){
        return ResponseEntity.ok().build();
    }
}
