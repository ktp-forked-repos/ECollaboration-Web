package com.general.security;

import com.general.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by joanna on 3/15/17.
 */
@Transactional(readOnly = true)
@Component
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        /*UserDto userDto = userService.findByName(username);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        for(Iterator<String> i=userDto.getRoles().iterator(); i.hasNext(); ){
            grantedAuthorities.add(new SimpleGrantedAuthority(i.next()));
        }
        return new User(
                userDto.getName(),
                userDto.getPassword(),
                true, true, true, true,
                grantedAuthorities);*/
        String password = userService.findByName(username).getPassword();
        List<String> roles = userService.getRoles(username);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        for(String role:roles){
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return new User(username, password, true, true, true, true, grantedAuthorities);

    }
}
