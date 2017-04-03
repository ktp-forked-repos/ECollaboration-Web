package com.general.security;

import com.general.dao.entity.UserEntity;
import com.general.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
        UserEntity userEntity = userService.findByName(username);
        List<String> roles = userService.getRoles(username);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        for(Iterator<String> i=roles.iterator(); i.hasNext(); ){
            grantedAuthorities.add(new SimpleGrantedAuthority(i.next()));
        }
        return new User(
                userEntity.getGithub(),
                userEntity.getPassword(),
                true, true, true, true,
                grantedAuthorities);
    }
}
