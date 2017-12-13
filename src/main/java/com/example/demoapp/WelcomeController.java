package com.example.demoapp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.demoapp.domain.user.Group;
import com.example.demoapp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    //private static final String template = "Welcome, %s!";
    //private final AtomicLong counter = new AtomicLong();
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private BloodPressureEvaluationService bloodPressureEvaluationService;

    @Autowired
    private GroupService groupService;


   /* @RequestMapping("/welcome")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws UsernameNotFoundException {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name),userInfoService,bloodPressureEvaluationService);
    }*/

    @RequestMapping("/userinfo")
    public String getinfo(@RequestParam(value = "universalid",defaultValue = "08453776-1ee3-4365-87db-0817c8320844") String universalId) throws IOException{
        Greeting welcome = new Greeting(userInfoService,bloodPressureEvaluationService);
        return welcome.userInfo(universalId);
    }

    @RequestMapping(value = "/bloodpressure", method = RequestMethod.POST)
    public String bloodpressuer(@RequestParam(value = "universalid",defaultValue = "08453776-1ee3-4365-87db-0817c8320844") String universalId,
                                @RequestParam(value = "systolic",defaultValue = "120") Integer systolic,
                                @RequestParam(value = "diastolic",defaultValue = "90") Integer diastolic) throws IOException{
        BloodPressurePublisher bp = new BloodPressurePublisher(systolic,diastolic);
        Greeting welcome = new Greeting(userInfoService,bloodPressureEvaluationService);
        return welcome.showBP(bp);
    }

    @RequestMapping(value = "/group", method = RequestMethod.GET)
    public Group viewGroup(@RequestParam(value = "id",defaultValue = "1") Integer id){
        System.out.println("the id is===" + id);
        Group group = groupService.find(id);
        return group;
    }

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public List<Group> showGroups(){
        System.out.println("show all groups");
         return  groupService.findAll();
    }




}