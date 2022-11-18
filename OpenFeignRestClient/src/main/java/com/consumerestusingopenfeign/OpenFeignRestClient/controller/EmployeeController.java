package com.consumerestusingopenfeign.OpenFeignRestClient.controller;

import com.consumerestusingopenfeign.OpenFeignRestClient.model.Response;
import com.consumerestusingopenfeign.OpenFeignRestClient.proxy.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeProxy employeeProxy;

    @GetMapping("/getAllEmployees")
    public Response getAllEmployees(){
        return employeeProxy.getAllEmployees();
    }


}
