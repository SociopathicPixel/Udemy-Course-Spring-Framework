package nl.capgemini.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

Record Person (String name, int age) { };
Record Adress (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public Person person() {
        var person1 = new Person("Albert", 42);
        return person1;
    }

    @Bean
    public Adress adress() {
        var adress1 = new Adress("SomeStreet", "SomeCity");
        return adress1;
    }

    @Bean
    public String name() {
        return "Bean: name";
    }

    @Bean
    public int age() {
        return 404;
    }

    @Bean
    public String firstLing() {
        return "Bean: firstLine";
    }

    @Bean
    public String city() {
        return "Bean: city";
    }
}

