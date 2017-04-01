package com.zgf.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgf.dubbo.core.model.Person;
import com.zgf.dubbo.core.service.IPersonServcie;

/**
 * Created by zgf on 17/3/31.
 */
@Service(version = "1.0.0")
public class PersonServiceImpl implements IPersonServcie {

    public Person getPersonInfo(String personId) {
        Person person = new Person();
        person.setId(personId);
        person.setAge(20);
        person.setName("JACK");
        return person;
    }
}
