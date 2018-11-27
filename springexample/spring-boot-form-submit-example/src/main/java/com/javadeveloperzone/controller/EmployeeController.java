package com.javadeveloperzone.controller;

import java.io.File;

import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@Controller
public class EmployeeController {


    @GetMapping("getForm")
    public String getForm() {
        return "employeeFrom";
    }

    @RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
//    @PostMapping("/saveDetails")                     // it only support port method
    public String saveDetails(@RequestParam("employeeName") String employeeName,
                              @RequestParam("employeeEmail") String employeeEmail,
                              @RequestParam("employeeFile") MultipartHttpServletRequest employeeFile,
                              ModelMap modelMap) {

        // write your code to save details
        modelMap.put("employeeName", employeeName);
        modelMap.put("employeeEmail", employeeEmail);
//        modelMap.put("employeeFile", employeeFile);
        
//        System.out.println("nombre Archivo:  "+employeeFile.getName());
//        System.out.println("tamaño Archivo:  "+employeeFile.getSize());
        
        return "viewDetails";           // welcome is view name. It will call employeeFrom.jsp
    }
}
