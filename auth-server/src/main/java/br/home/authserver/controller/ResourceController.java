package br.home.authserver.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping({"/me", "/user", "/profile"})
	public Map<String, String> user(String user) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("name", user);
		return map;
	}

}
