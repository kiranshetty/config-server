package com.config.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoUpdateController {

	@RequestMapping(value="/payload", method=RequestMethod.POST)
	public String recieveUpdate() {
		return "successfully recieved update from Git Repo";
	}
}
