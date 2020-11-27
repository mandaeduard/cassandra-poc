package com.ing.cassandrapockotlin

import com.ing.cassandrapockotlin.codec.PersonCodec
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationClassCassandra {

    @Bean
    fun customize() = CqlSessionBuilderCustomizer {
        it.addTypeCodecs(PersonCodec())
    }
}