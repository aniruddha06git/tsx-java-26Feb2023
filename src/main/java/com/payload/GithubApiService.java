package com.payload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GithubApiService {

    private final Logger logger = LoggerFactory.getLogger(GithubApiService.class);

    private final RestTemplate restTemplate;

    public GithubApiService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void getCommits() {
        String url = "https://api.github.com/repos/{owner}/{repo}/commits";
        String owner = "aniruddha06git";
        String repo = "dummy-github-events";

        logger.info("Fetching commits from GitHub API for owner: {} and repo: {}", owner, repo);

        GithubCommit[] commits = restTemplate.getForObject(url, GithubCommit[].class, owner, repo);

        logger.info("Retrieved {} commits", commits.length);

        for (GithubCommit commit : commits) {
            logger.info("Commit message: {}", commit.getMessage());
        }
    }
}
