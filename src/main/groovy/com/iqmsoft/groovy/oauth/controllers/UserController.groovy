package com.iqmsoft.groovy.oauth.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/user")
class UserController {

  @GetMapping("/hello")
  ModelAndView hello() {
    new ModelAndView("user/hello", [:])
  }

}
