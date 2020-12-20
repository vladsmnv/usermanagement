package ru.sberbank.jd.usermanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.sberbank.jd.usermanagement.model.User;
import ru.sberbank.jd.usermanagement.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
