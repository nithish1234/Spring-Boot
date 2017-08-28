package io.javabrains.topiccontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	TopicService topicService;

	@RequestMapping("/books")
	public List<Topic> listAllBooks() {
		return topicService.getAllTopics();

	}

	@RequestMapping("/books/{id}")
	public Topic getOneBook(@PathVariable String id) {
	
		return topicService.getOneTopic(id);
	}
}
