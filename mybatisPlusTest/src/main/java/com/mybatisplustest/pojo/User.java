package com.mybatisplustest.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId
    private Integer id;
    @TableField("name")
    private String userName;
    @TableField
    private Integer age;
    private String email;
}
