package com.example.sql.modules.service.Dto;

import com.example.sql.annotation.Query;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserQueryCriteria implements Serializable {

    @Query
    private Long id;


    @Query(type = Query.Type.INNER_LIKE)
    private String username;

}

