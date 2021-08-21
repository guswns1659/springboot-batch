package com.titanic.springbootbatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        String firstName = person.getFirstName().toUpperCase();
        String lastName = person.getLastName().toUpperCase();

        Person transformedPerson = new Person(firstName, lastName);
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
