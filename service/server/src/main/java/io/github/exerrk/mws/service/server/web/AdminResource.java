package io.github.exerrk.mws.service.server.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evan Sid (a.k.a exerrk)
 * created in 08.2017
 */
@RestController
@RequestMapping(value = "admin")
@EnableAutoConfiguration
@ComponentScan("io.github.exerrk.mws.service.server.service")
public class AdminResource {


}
