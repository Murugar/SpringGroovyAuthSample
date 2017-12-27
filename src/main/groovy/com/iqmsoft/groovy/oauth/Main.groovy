package com.iqmsoft.groovy.oauth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan

import com.iqmsoft.groovy.oauth.Main;

@EnableConfigurationProperties
@SpringBootApplication
@EnableAutoConfiguration(exclude = [EmbeddedMongoAutoConfiguration.class])
@ComponentScan(['com.iqmsoft.groovy.oauth'])
class Main {

	static void main(String[] args) {
		SpringApplication.run Main, args
	}
}
