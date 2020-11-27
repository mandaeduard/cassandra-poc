package com.ing.cassandrapockotlin

import com.ing.cassandrapockotlin.entity.CodecTest
import com.ing.cassandrapockotlin.repository.CodecTestRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import java.util.UUID

@SpringBootApplication
@EnableScheduling
class CassandraPocKotlinApplication(
	val codecTestRepository: CodecTestRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val mobileAppId = UUID.randomUUID()
        val codecTest = CodecTest(mobileAppId, CodecTest.Status.ACTIVE, CodecTest.Person("f", "l"))

        codecTestRepository.save(codecTest)

        codecTestRepository.findByMobileAppId(mobileAppId)
    }
}

fun main(args: Array<String>) {
    runApplication<CassandraPocKotlinApplication>(*args)
}
