package com.geneshop.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 权限服务
 */
@SpringBootApplication
//@EnableFeignClients
@MapperScan(basePackages = "com.geneshop.authority.persistence")
public class MsModAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsModAuthorityApplication.class, args);
	}
}
