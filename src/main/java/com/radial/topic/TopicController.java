package com.radial.topic;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * Created by gsingh on 2/15/2018.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @ApiOperation(value = "Get a toic")
@RequestMapping(value="/topics")
    public List<Topic> getTopics (){
        return topicService.getTopics();
    }

    @ApiOperation(value = "Get a by id")
    @RequestMapping(value="/topics/{id}")
    public Topic getTopicsById (@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @ApiOperation(value = "Add a toic")
    @RequestMapping(method = RequestMethod.POST ,value="/topics")
    public void addTopic (@RequestBody Topic topic){
        topicService.addTopic(topic);
    }


    @ApiOperation(value = "Udate a toic")
   @RequestMapping(value="/topics/{id}",method = RequestMethod.PUT)
    public void updateTopic (@RequestBody Topic topic,@PathVariable String id){
         topicService.updateTopicById(topic,id);
    }

    @ApiOperation(value = "Delete a toic")
     @RequestMapping(value="/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopicsById (@PathVariable String id){
        topicService.deleteTopicById(id);
    }
@RequestMapping(value="/username")
    public String getName(@RequestParam String name,@RequestParam(required=false) String lastName){
return "This is the" +name+ " lastname " +lastName;
    }

    @RequestMapping(value="/request1")
    public String handler(@RequestParam String name,@RequestParam("age") int age,@RequestParam("gender") boolean gender){
        return name+ "is of" +age+ " of gender type as" +gender;

    }
    @RequestMapping(value="/request2")
    public String handler(@RequestParam Map<String, String> params) {

        StringBuilder builder = new StringBuilder();
        builder.append("URL parameters - <br>");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            builder.append(entry.getKey() + " = " + entry.getValue() + "<br>");
        }
        return builder.toString();
    }

@RequestMapping("/request6")
    @ResponseBody
    public String handler(
            @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("date") LocalDate date,
            @DateTimeFormat(pattern = "HH:mm:ss") @RequestParam("time") LocalTime time) {

        return "URL parameters - <br>"
                + " date = " + date + " <br>"
                + " time = " + time;
    }

/*
@RequestMapping(value="/request7")
    public String handler(@RequestParam(value="10") int code){
        return "The dafault value is" +code;
}

@RequestMapping("request8")
    public String handler(@RequestParam String[] country,@RequestParam List<String> city){
        return "the arraylist is as " +country+ " and " +city;
}
*/

    @RequestMapping("/request7")
    @ResponseBody
    public String handler(@RequestParam("country") String[] country,
                          @RequestParam("city") List<String> city) {

        return "URL parameters - <br>"
                + " country = " + Arrays.asList(country) + " <br>"
                + " city = " + city;
    }

    /*
      * Using default value of a method parameter if request parameter is not
      * provided or has an empty value
      */
    @RequestMapping("/request8")
    @ResponseBody
    public String handler(@RequestParam(name = "code", defaultValue = "10") int code
    ) {

        return "URL parameters - <br>"
                + " code = " + code;
    }
@Value("${friend.name}")
private String name;

    @RequestMapping(value="/getName")
    private  String name(){
        return name;
    }



}
