package com.iqmsoft.groovy.oauth.services

import com.iqmsoft.groovy.oauth.models.User
import com.iqmsoft.groovy.oauth.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomMongoSecurityService implements UserDetailsService {

  @Autowired
  UserRepository userRepository

  @Override
  UserDetails loadUserByUsername(String username)
      throws UsernameNotFoundException {

    User user = userRepository.findByUsername(username)

    if (user) {
      return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user))
    }

    throw new UsernameNotFoundException("No user found for $username")
  }

  private static Collection<? extends GrantedAuthority> getAuthorities(User user) {
    List authorities = new ArrayList()
    user.roles.each {authorities.add(new SimpleGrantedAuthority(it.getRole()))}
    authorities
  }
}
