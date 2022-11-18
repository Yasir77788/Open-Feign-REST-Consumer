package com.consumerestusingopenfeign.OpenFeignRestClient.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Employee{

    private int id;
    private String name;
    private String dept;
}
