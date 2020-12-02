package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping(value = "/demo")
    public DemoVO addSampleView(HttpSession httpSession) throws Exception {

        DemoVO obj = new DemoVO("hong-gil-dong", "1234qwer");

        httpSession.setAttribute("test_1", "data_1");
        httpSession.setAttribute("test_2", "data_2");
        httpSession.setAttribute("test_obj", obj);

        List<String> keysList = new ArrayList<>();

        Iterator<String> it = httpSession.getAttributeNames().asIterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }

        DemoVO ret = (DemoVO)httpSession.getAttribute("test_obj");
        System.out.println(ret.getName());
        System.out.println(ret.getPwd());
        System.out.println(httpSession.getCreationTime());
        System.out.println(httpSession.getLastAccessedTime());
        System.out.print(":" + httpSession.getAttribute("test_1") + ":" + httpSession.getAttribute("test_2") +":");
        return obj;
    }


}
