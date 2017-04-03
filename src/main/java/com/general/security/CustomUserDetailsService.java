package com.huhang.security;

import com.huhang.entity.UsersEntity;
import com.huhang.entity.UserRolesEntity;
import com.huhang.model.UserDto;
import com.huhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by joanna on 3/15/17.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserService userService;
    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = userService.findByName(username);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        for(Iterator<String> i=userDto.getRoles().iterator(); i.hasNext(); ){
            grantedAuthorities.add(new SimpleGrantedAuthority(i.next()));
        }
        return new User(
                userDto.getName(),
                userDto.getPassword(),
                true, true, true, true,
                grantedAuthorities);
    }
}
