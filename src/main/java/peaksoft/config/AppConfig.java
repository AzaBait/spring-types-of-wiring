package peaksoft.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

//    @Bean
//    public Wood3 getWood3(Rabbit4 rabbit4) {
//        return new Wood3(rabbit4);
//    }
//
//    @Bean
//    public Rabbit4 getRabbit4(Duck5 duck5) {
//        return new Rabbit4(duck5);
//    }
//
//    @Bean
//    public Duck5 getDuck5 (Egg6 egg6) {
//        return new Duck5(egg6);
//    }
//
//    @Bean
//    public Egg6 get () {
//        return ;
//    }
}