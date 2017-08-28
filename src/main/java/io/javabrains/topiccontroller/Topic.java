package io.javabrains.topiccontroller;

public class Topic {
	private String id;
	private String name;
	private String discreption;

	public Topic(String id, String name, String discreption) {
		super();
		this.id = id;
		this.name = name;
		this.discreption = discreption;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscreption() {
		return discreption;
	}

	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}
}
