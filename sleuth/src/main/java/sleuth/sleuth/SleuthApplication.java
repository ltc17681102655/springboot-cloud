package sleuth.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @Auther: ltc
 * @Date: 2019/1/28 18:28
 * @Description: http://localhost:8088/
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }

}

