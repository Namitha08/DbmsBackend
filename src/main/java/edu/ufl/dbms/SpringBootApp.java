package edu.ufl.dbms;

import edu.ufl.dbms.conf.AppPropertyConfig;
import edu.ufl.dbms.conf.SpringBeans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.Instant;
import java.util.Arrays;

/***
 *
 */
@Configuration
@ComponentScan(basePackages = {"edu.ufl.dbms"})
@SpringBootApplication
@Import({
        AppPropertyConfig.class, SpringBeans.class
})
public class SpringBootApp extends SpringBootServletInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(SpringBootApp.class);
    public static void main (final String[] args) {
        LOG.info("CmdLine Args {}", Arrays.asList(args));
        try {
            new SpringApplicationBuilder()
                    .sources(SpringBootApp.class)
                    .run(args);
            LOG.info("Service started on: {}, Its Ready to use, have fun.", Instant.now());
        } catch (Exception e) {
            System.out.println("What's wrong"+e.getMessage());
            LOG.error("Unexpected error", e);
        }
    }
}
