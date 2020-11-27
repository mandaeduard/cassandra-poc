package com.ing.cassandrapockotlin.codec

import com.datastax.oss.driver.api.core.ProtocolVersion
import com.datastax.oss.driver.api.core.type.DataType
import com.datastax.oss.driver.api.core.type.DataTypes
import com.datastax.oss.driver.api.core.type.codec.TypeCodec
import com.datastax.oss.driver.api.core.type.reflect.GenericType
import com.ing.cassandrapockotlin.entity.CodecTest
import com.ing.cassandrapockotlin.entity.CodecTest.Person
import org.springframework.data.cassandra.core.mapping.CassandraType
import java.nio.ByteBuffer

class PersonCodec : TypeCodec<Person> {
    override fun getJavaType(): GenericType<Person> {
        return GenericType.of(Person::class.java)
    }

    override fun getCqlType(): DataType {
        return DataTypes.BLOB
    }

    override fun encode(p0: Person?, p1: ProtocolVersion): ByteBuffer? {
        return ByteBuffer.wrap(p0!!.firstname.toByteArray())
    }

    override fun decode(p0: ByteBuffer?, p1: ProtocolVersion): Person? {
        return Person()
    }

    override fun format(p0: Person?): String {
        return ""
    }

    override fun parse(p0: String?): Person {
        return Person()
    }
}