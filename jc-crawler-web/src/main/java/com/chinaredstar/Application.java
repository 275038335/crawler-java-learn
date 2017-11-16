package com.chinaredstar;

//import com.chinaredstar.uc.session.EnableRedstarSession;
//import com.chinaredstar.uc.session.SessionGroup;
//import com.chinaredstar.uc.session.core.RedstarRedisSessionConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {SessionAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ImportResource({"classpath*:spring/applicationContext-*.xml"})
@PropertySource({"classpath:db.properties", "classpath:common.properties"})
//@EnableRedstarSession(
//        group = SessionGroup.USER,
//        connectionFactory = "sessionJedisConnectionFactory",
//        maxInactiveIntervalInSeconds=3600000
//)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("The jc-crawler-web start success ...");
    }

}
