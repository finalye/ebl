package org.ebl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.ebl.mapper")
public class EblApplication {

	public static void main(String[] args) {
		SpringApplication.run(EblApplication.class, args);
	}
}
