package io.github.exerrk.mws.client.web;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evan Sidman
 * created in 02.2018
 */
@RestController
@RequestMapping(value = "client")
@EnableAutoConfiguration
@ComponentScan("io.github.exerrk.mws.client.service")
public class ApiResource {
}
