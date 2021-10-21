package com.netcracker.sportstats;

import com.netcracker.sportstats.dataloaders.TrainersDataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@SpringBootApplication
@Import({TrainersDataLoader.class})
public class SportStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportStatsApplication.class, args);
	}

}
