package com.iqmsoft.groovy.oauth.configuration.mongo

import com.iqmsoft.groovy.oauth.configuration.mongo.EmMongoConfig;
import com.iqmsoft.groovy.oauth.configuration.mongo.MongoProperties;
import com.mongodb.Mongo
import spock.lang.Specification


class EmMongoConfigSpecification extends Specification {

  def 'Start embedded MongoDB' (){
    given:
    def mongoProperties = Mock(MongoProperties)
    def mongoPort = 11024 + Math.abs(new Random().nextInt() % 600)
    EmMongoConfig embeddedMongoConfiguration = new EmMongoConfig(mongoProperties: mongoProperties)
    when:
    Mongo mongo = embeddedMongoConfiguration.mongo()
    then:
    1 * mongoProperties.port >> mongoPort
    mongo.getAddress().host == "127.0.0.1"
    mongo.getAddress().port == mongoPort
    mongo.close()
  }

}
