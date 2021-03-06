package com.jason.hystrix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Jason
 * @date 2020/3/31 14:44
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}

