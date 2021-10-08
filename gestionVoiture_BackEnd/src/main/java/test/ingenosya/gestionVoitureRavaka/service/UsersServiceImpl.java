package test.ingenosya.gestionVoitureRavaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import test.ingenosya.gestionVoitureRavaka.config.CustomUserDetails;
import test.ingenosya.gestionVoitureRavaka.entity.User;
import test.ingenosya.gestionVoitureRavaka.repository.UsersRepository;
import java.util.*;

@Service
public class UsersServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user =  usersRepository.findByEmail(email);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("Email "+email+" not found.");
        }
        User userValue = user.get();
        return new CustomUserDetails(userValue);
    }
}
