package vn.hcmute.vidu1.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.hcmute.vidu1.entity.User;
import vn.hcmute.vidu1.repository.UserRepository;

@Service
public class CustomUserDetailsService
        implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(
            UserRepository userRepository) {

        this.userRepository =
            userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(
            String email)
            throws UsernameNotFoundException {

        User user =
            userRepository
                .findByEmailWithRole(email)
                .orElseThrow(
                    () -> new UsernameNotFoundException(
                        "Không tìm thấy tài khoản: "
                        + email
                    )
                );

        return org.springframework.security
            .core
            .userdetails
            .User
            .withUsername(
                user.getEmail()
            )
            .password(
                user.getPassword()
            )
            .roles(
                user.getRole().getName()
            )
            .disabled(
                !user.isEnabled()
            )
            .build();
    }
}