package com.example.sql.modules.service.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private long id;
    private String name;
    private Timestamp birthTime;
    private byte sex;
    private String idNum;
    private String createBy;
    private String updateBy;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte dr;
}
