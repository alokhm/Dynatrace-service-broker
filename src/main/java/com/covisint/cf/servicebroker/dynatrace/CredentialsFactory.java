package com.covisint.cf.servicebroker.dynatrace;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A factory class for creating credential 
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
 *
 */


@Configuration
public class CredentialsFactory {
/**
 * 
 * @param server
 * @param profile
 * @return server and profile name 
 */
    @Bean
    Credentials credentials(@Value("${server}") String server , @Value("${profile}") String profile) {
        return new Credentials(server, profile);
    }

}
