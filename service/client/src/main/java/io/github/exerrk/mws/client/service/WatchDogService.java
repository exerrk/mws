package io.github.exerrk.mws.client.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * @author Evan Sidman
 * created in 02.2018
 */
@Service
public class WatchDogService {

    @Scheduled(fixedRate = 10)
    public void startUp () throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "ping.bat");
        File directory = new File("C:/temp/mws/test-bats");
        pb.directory(directory);
        Process p = pb.start();
    }
}
