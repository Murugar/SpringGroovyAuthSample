package com.iqmsoft.groovy.oauth.controllers

import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

 
class UserControllerSpec extends Specification {

  def userController = new UserController()
  MockMvc mockMvc = MockMvcBuilders.standaloneSetup(userController).build()

  def "Should access user hello page"() {
    when:
    MvcResult result = mockMvc.perform(get('/user/hello'))
        .andReturn()
    then:
    result.response.status == HttpStatus.OK.value()
  }
}
