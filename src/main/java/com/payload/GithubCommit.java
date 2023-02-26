package com.payload;

import java.time.OffsetDateTime;

public class GithubCommit {

	private GithubCommit commit;
	private String sha;
	private String url;

	public GithubCommit getCommit() {
		return commit;
	}

	public void setCommit(GithubCommit githubCommit) {
		this.commit = githubCommit;
	}

	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static GithubCommit fromGithubResponse(GithubResponse response) {
	    GithubCommit commit = new GithubCommit();
	    commit.setSha(response.getSha());
	    commit.setUrl(response.getUrl());
	    commit.setCommit(response.getCommit());
	    return commit;
	}

	public static class Commit {
	    private String author;
	    private String committer;
	    private String message;
	    private OffsetDateTime timestamp;

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getCommitter() {
	        return committer;
	    }

	    public void setCommitter(String committer) {
	        this.committer = committer;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public OffsetDateTime getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(OffsetDateTime timestamp) {
	        this.timestamp = timestamp;
	    }
	}

	public void setAuthor(String asText) {
		// TODO Auto-generated method stub
		
	}

	public void setMessage(String asText) {
		// TODO Auto-generated method stub
		
	}

	public void setTimestamp(OffsetDateTime parse) {
		// TODO Auto-generated method stub
		
	}

	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
