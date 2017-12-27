package com.iqmsoft.groovy.oauth.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

 
@RestController
class AuthController {

  @GetMapping("/login")
  ModelAndView login() {
    new ModelAndView("login", [:])
  }

  @GetMapping("/403")
  ModelAndView error403() {
    new ModelAndView("error/403", [:])
  }

  @GetMapping(value = ["/", "/home"])
  ModelAndView home() {
    new ModelAndView("home", [:])
  }
}
