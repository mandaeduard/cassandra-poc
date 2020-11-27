package com.ing.cassandrapockotlin.consistency;

import com.datastax.oss.driver.api.core.DefaultConsistencyLevel;
import org.springframework.data.cassandra.repository.Consistency;

import java.lang.annotation.*;

//https://jira.spring.io/browse/DATACASS-797

@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Consistency(DefaultConsistencyLevel.SERIAL)
public @interface Serial {}