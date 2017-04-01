package com.zgf.dubbo.core.service;

import com.zgf.dubbo.core.model.Person;

/**
 * Created by zgf on 17/3/31.
 */
public interface IPersonServcie {
    Person getPersonInfo(String personId);
}
