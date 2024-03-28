package hello.springactuator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class TrafficController {

    @Autowired DataSource dataSource;

    private List<String> list = new ArrayList<>();

    @GetMapping("/cpu")
    public String cpu() {
        log.info("CPU");

        long value =0;

        for (long i = 0; i < 100000000L; i++) {
            value++;
        }

        return "OK VALUE: " + value;
    }

    @GetMapping("/jvm")
    public String jvm() {
        log.info("JVM");

        for (int i = 0; i < 1000000; i++) {
            list.add("HELLO JVM!" + i);
        }

        return "OK";
    }

    @GetMapping("/jdbc")
    public String jdbc() throws SQLException {
        log.info("JDBC");

        Connection connection = dataSource.getConnection();
        log.info("connection info={}", connection);
        // conn.close();        // 커넥션을 닫지 않는다.

        return "OK";
    }

    @GetMapping("/error-log")
    public String errorLog() {
        log.error("ERROR LOG");

        return "ERROR";
    }
}
