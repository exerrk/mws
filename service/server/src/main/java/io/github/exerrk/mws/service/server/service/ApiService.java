package io.github.exerrk.mws.service.server.service;

import org.springframework.stereotype.Service;

/**
 * @author Evan Sid (a.k.a exerrk)
 * created in 08.2017
 */
@Service
public class ApiService {

    public HttpEntityDTO<Void> ping(){
        return new HttpEntityDTO<Void>();
    }
}
