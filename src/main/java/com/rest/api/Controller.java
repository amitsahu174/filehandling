package com.rest.api;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	@GetMapping("/get")
	public String home() throws IOException {
		FileWriter myWriter = new FileWriter("filename.txt");
		myWriter.write("Files in Java might be tricky, but it is fun enough!");
		myWriter.close();
		return "Welcome";

	}

}
