package vn.hcmute.vidu1.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import vn.hcmute.vidu1.entity.Role;
import vn.hcmute.vidu1.entity.User;
import vn.hcmute.vidu1.repository.RoleRepository;
import vn.hcmute.vidu1.repository.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(
            RoleRepository roleRepository,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            Role userRole =
                roleRepository
                    .findByNameIgnoreCase("USER")
                    .orElseGet(
                        () -> roleRepository.save(
                            new Role("USER")
                        )
                    );

            Role adminRole =
                roleRepository
                    .findByNameIgnoreCase("ADMIN")
                    .orElseGet(
                        () -> roleRepository.save(
                            new Role("ADMIN")
                        )
                    );


            String adminEmail =
                "admin@gmail.com";


            if (!userRepository
                    .existsByEmailIgnoreCase(
                        adminEmail
                    )) {

                User admin =
                    new User();

                admin.setUsername(
                    "admin"
                );

                admin.setEmail(
                    adminEmail
                );

                admin.setFullName(
                    "System Administrator"
                );

                admin.setPassword(
                    passwordEncoder.encode(
                        "123456"
                    )
                );

                admin.setImages(
                    null
                );

                admin.setRole(
                    adminRole
                );

                admin.setEnabled(
                    true
                );

                userRepository.save(
                    admin
                );
            }
        };
    }
}