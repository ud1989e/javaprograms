package com.example.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Greetings from Spring Boot!")));
	}
	
	@Test
	public void getStudentsTest() throws Exception {
		String jsonContent = "[\n" + 
				"    {\n" + 
				"        \"rollNum\": 1,\n" + 
				"        \"name\": \"'udaya'\",\n" + 
				"        \"address\": \"basrur\",\n" + 
				"        \"grade\": \"A\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"rollNum\": 2,\n" + 
				"        \"name\": \"ganesh\",\n" + 
				"        \"address\": \"kundapur\",\n" + 
				"        \"grade\": \"C\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"        \"rollNum\": 3,\n" + 
				"        \"name\": \"ravi\",\n" + 
				"        \"address\": \"balkoor\",\n" + 
				"        \"grade\": \"A\"\n" + 
				"    }\n" + 
				"]";
		mvc.perform(MockMvcRequestBuilders.get("/list").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(jsonContent));
	}
	
	@Disabled
	public void addTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/add?name=ravi&address=balkoor&grade=A").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Saved")));
	}

}