package RunApp;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("RunApp")
public class App {

    public static void main(String[] args) {
        //ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
        SpringApplication springApplication = new SpringApplication(App.class);
        ApplicationContext container = springApplication.run();
        Computer computer = container.getBean(Computer.class);
        computer.start();
    }
}
