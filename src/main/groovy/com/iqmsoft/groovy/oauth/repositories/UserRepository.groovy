package com.iqmsoft.groovy.oauth.repositories

import com.iqmsoft.groovy.oauth.models.User
import org.springframework.data.mongodb.repository.MongoRepository


interface UserRepository extends MongoRepository<User, String>{

  User findByUsername(String username)
}