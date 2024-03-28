package hello.springactuator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class TrafficController {

    @GetMapping("/cpu")
    public String cpu() {
        log.info("CPU");

        long value =0;

        for (long i = 0; i < 100000000L; i++) {
            value++;
        }

        return "OK VALUE: " + value;
    }

    private List<String> list = new ArrayList<>();

    @GetMapping("/jvm")
    public String jvm() {
        log.info("JVM");

        for (int i = 0; i < 1000000; i++) {
            list.add("HELLO JVM!" + i);
        }

        return "OK";
    }
}
