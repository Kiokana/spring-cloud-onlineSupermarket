package com.onlineSupermarket.authService.configuration;

import com.onlineSupermarket.authService.bean.MyUser;
import com.onlineSupermarket.authService.bean.MyUserPrinciple;
import com.onlineSupermarket.authService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        System.out.println("???????????");
        MyUser user = userRepository.findByUsername(username);
        if(user == null)
            throw new UsernameNotFoundException(username);
        System.out.println("find use "+ username);

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        MyUserPrinciple principle = new MyUserPrinciple(username, user.getPassword(), authorities);

        return principle;
    }
}
