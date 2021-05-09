package verynice.thefinalproject.user;

import verynice.thefinalproject.user.Users1;
import verynice.thefinalproject.user.UserPrincipal;
import verynice.thefinalproject.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users1 user1 = userRepository.findByUsername(username);

        if(user1 == null) {
            throw new UsernameNotFoundException("User not found!");
        }

        return new UserPrincipal(user1);
    }
}
