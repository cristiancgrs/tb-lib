package com.upload.file.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UploadFileController {

	@RequestMapping(value="/uploadFile", method=RequestMethod.POST)
	public String uploadFile(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		
		
		
		System.out.println("iniciando UploadFileConroller");
        return "greeting";
				
	}
		
}
	

