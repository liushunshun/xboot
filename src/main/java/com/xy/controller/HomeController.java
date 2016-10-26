package com.xy.controller;

import com.xy.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Alex on 2016/10/25.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }

    @RequestMapping("/index")
    public ModelAndView index(Map<String,Object> model){
        Person single = new Person("kevin", 28);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.put("singlePerson", single);
        model.put("people", people);
        return new ModelAndView("index",model);
    }
}
