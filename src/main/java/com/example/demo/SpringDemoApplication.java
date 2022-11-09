package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController는 Restful Web API를 좀 더 쉽게 만들기 위해 도입된 @Controller, @ResponseBody를 합쳐놓은 어노테이션이다.
 @Controller : 선언된 해당 클래스를 요청을 처리하는 컨트롤러로 사용.
 @ResponseBody : 자바 객체를 HTTP 응답 본문의 객체로 변환해 클라이언트에게 전송. -> 따로 http 파일을 안 만들어도 됨 !
* */
@RestController
@SpringBootApplication
public class SpringDemoApplication {

public static void main(String[] args) {
	SpringApplication.run(SpringDemoApplication.class, args);
}

@GetMapping(value = "/")
	public String HelloWorld(){
	return "Hello World";
}

}
