package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//UserDto 객체의 name과 age 값을 읽어오거나 값을 변경하기 위해서 getter, setter의 메소드가 필요하다.
// 이를 자동으로 만들어 주는게 @Getter, @Setter이다.

@Getter
@Setter
@ToString
public class UserDto {

    private String name;
    private Integer age;
}
