package com.ing.cassandrapockotlin.entity

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.UUID

@Table("test_codec")
class CodecTest() {

    @PrimaryKey
    lateinit var mobileAppId: UUID
        private set


    lateinit var status: Status

    lateinit var person: Person


    constructor(mobileAppId: UUID, status: Status, person: Person) : this() {
        this.mobileAppId = mobileAppId
        this.status = status
        this.person = person
    }

    enum class Status {
        ACTIVE, INACTIVE
    }

    class Person() {
        lateinit var lastname: String
        lateinit var firstname: String

        constructor(firstname: String, lastname: String) : this() {
            this.lastname = lastname
            this.firstname = firstname
        }
    }

}