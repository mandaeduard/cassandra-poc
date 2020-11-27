package com.ing.cassandrapockotlin.repository

import com.ing.cassandrapockotlin.entity.CodecTest
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.data.cassandra.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CodecTestRepository : CrudRepository<CodecTest, UUID> {

    fun findByMobileAppId(mobileAppId: UUID): CodecTest

}