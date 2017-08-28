package io.javabrains.topiccontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring Intro", "A sample book"),
			new Topic("java", "Java Intro", "A Hand book"), new Topic("Sql", "Sql Intro", "A Intro Books"),
			new Topic("Hibernate", "Hibernate Intro", "A hibernate book intro"));
	Topic topic;

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getOneTopic(String id) {
		
		for(Topic topicnames:topics) {
			if(id.equalsIgnoreCase(topicnames.getId())) {
				return topicnames;
			}
		}
		return null;

	}
}
