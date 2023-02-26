package com.payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubApiDemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(GithubApiDemoApplication.class);

    @Autowired
    private GithubApiService githubApiService;

    public static void main(String[] args) {
        SpringApplication.run(GithubApiDemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public void run(String... args) throws Exception {
        logger.info("Fetching commits from Github API");
        githubApiService.getCommits();
        logger.info("Finished fetching commits");
    }
}
