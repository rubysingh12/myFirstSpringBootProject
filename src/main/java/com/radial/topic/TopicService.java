package com.radial.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topicList= new ArrayList<>(Arrays.asList(
            new Topic("ENGLISH","ENGLISH LANGUAGE","1"),
            new Topic("HINDI","HINDI LANGUAGE","2"),
            new Topic("TAMIL","TAMIL LANGUAGE","3")));

    public List<Topic> getTopics (){
        return topicList;
    }

    public Topic getTopicById(String id) {
        Topic matchectopic=null;
        for (int i=0;i<topicList.size();i++) {
            if (topicList.get(i).getId().equals(id)) {
                matchectopic=  topicList.get(i);
            }
        }
        return matchectopic;
    }

    public void updateTopicById(Topic topic,String id) {
        for (int i=0;i<topicList.size();i++) {
            if (topicList.get(i).getId().equals(id)) {
                topicList.set(i,topic);
                return;
            }
        }
    }

    public void addTopic (Topic topic){
        topicList.add(topic);
    }

    public void deleteTopicById(String id){
        for (int i=0;i<topicList.size();i++) {
            if (topicList.get(i).getId().equals(id)) {
                topicList.remove(i);
                return;
            }
        }
    }
}
