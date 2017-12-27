package com.iqmsoft.groovy.oauth.models

import groovy.transform.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

 
@ToString
class Role {
  String role
  String roleDescription
}

@ToString
@Document(collection="user")
class User {
  @Id
  String id
  String username
  String password
  Set<Role> roles

}
