package com.consumerestusingopenfeign.OpenFeignRestClient.proxy;

import com.consumerestusingopenfeign.OpenFeignRestClient.config.ProjectConfiguration;
import com.consumerestusingopenfeign.OpenFeignRestClient.model.Response;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "employee", url = "http://localhost:8084/employeeService",
        configuration = ProjectConfiguration.class)
public interface EmployeeProxy {

    @RequestMapping(method = RequestMethod.GET, value = "/getAllEmployees")
    @Headers(value = "Content-type: application.json")
    public Response getAllEmployees();
}
