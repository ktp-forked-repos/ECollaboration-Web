package com.general.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by joanna on 3/31/17.
 */
@Component
public class CustomClientDetailsService implements ClientDetailsService{
    private String clientId="my_trusted_client";
    private String clientSecret="secret";
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        if(clientId.equals(this.clientId)){
            List<String> authorizedGrantTypes=new LinkedList<>();
            authorizedGrantTypes.add("password");
            authorizedGrantTypes.add("authorization_code");
            authorizedGrantTypes.add("refresh_token");
            authorizedGrantTypes.add("implicit");
            List<GrantedAuthority> authorities=new LinkedList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_CLIENT"));
            authorities.add(new SimpleGrantedAuthority("ROLE_TRUSTED_CLIENT"));
            List<String> scopes=new LinkedList<>();
            scopes.add("read");
            scopes.add("write");
            scopes.add("trust");
            BaseClientDetails baseClientDetails=new BaseClientDetails();
            baseClientDetails.setClientId(clientId);
            baseClientDetails.setClientSecret(this.clientSecret);
            baseClientDetails.setAuthorizedGrantTypes(authorizedGrantTypes);
            baseClientDetails.setAuthorities(authorities);
            baseClientDetails.setScope(scopes);
            baseClientDetails.setAccessTokenValiditySeconds(1200);
            baseClientDetails.setRefreshTokenValiditySeconds(6000);
            return baseClientDetails;
        }else{
            throw new NoSuchClientException("");
        }
    }
}
