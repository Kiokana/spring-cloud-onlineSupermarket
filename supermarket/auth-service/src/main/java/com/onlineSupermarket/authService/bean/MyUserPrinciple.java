package com.onlineSupermarket.authService.bean;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class MyUserPrinciple extends User implements UserDetails {
    private MyUser user;

    private List<GrantedAuthority> authorities;

    public MyUserPrinciple(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        user = new MyUser(username, password);
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        System.out.println("AAAAAAAAAAAAAA");
        System.out.println(authorities==null);
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities){
        this.authorities = (List)authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
