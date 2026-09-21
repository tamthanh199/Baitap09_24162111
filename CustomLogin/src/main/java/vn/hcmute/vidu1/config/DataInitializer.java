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
                            .findByNameIgnoreCase(
                                    "ROLE_USER"
                            )
                            .orElseGet(
                                    () -> roleRepository.save(
                                            new Role(
                                                    "ROLE_USER"
                                            )
                                    )
                            );


            if (userRepository
                    .findByUsername("user01")
                    .isEmpty()) {

                User user = new User();

                user.setUsername(
                        "user01"
                );

                user.setEmail(
                        "user01@gmail.com"
                );

                user.setPassword(
                        passwordEncoder.encode(
                                "123456"
                        )
                );

                user.setFullName(
                        "Đoàn Thành Tâm"
                );

                user.setImages(
                        "/images/user.png"
                );

                user.setRole(
                        userRole
                );

                user.setEnabled(
                        true
                );

                userRepository.save(
                        user
                );
            }
        };
    }
}