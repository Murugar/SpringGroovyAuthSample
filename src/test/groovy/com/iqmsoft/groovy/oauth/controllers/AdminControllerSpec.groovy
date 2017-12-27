package com.iqmsoft.groovy.oauth.controllers

import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get


class AdminControllerSpec extends Specification {

  def adminController = new AdminController()
  MockMvc mockMvc = MockMvcBuilders.standaloneSetup(adminController).build()

  def "Should access admin home page"() {
    when:
    MvcResult result = mockMvc.perform(get('/admin/home'))
        .andReturn()
    then:
    result.response.status == HttpStatus.OK.value()
  }
}
