package com.studentlink.studentlink.configuration;


import com.studentlink.studentlink.features.authentication.model.AuthenticationUser;
import com.studentlink.studentlink.features.authentication.repository.AuthenticationUserRepository;
import com.studentlink.studentlink.features.authentication.utilities.Encoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabaseConfiguration {
    private final Encoder encoder;

    public LoadDatabaseConfiguration(Encoder encoder) {
        this.encoder = encoder;
    }

    @Bean
    public CommandLineRunner initDatabase(AuthenticationUserRepository authenticationUserRepository){
        return args -> {
            AuthenticationUser authenticationUser = new AuthenticationUser("vedant@gmail.com",encoder.encode("1234"));
            authenticationUserRepository.save(authenticationUser);
        };
    }
}
