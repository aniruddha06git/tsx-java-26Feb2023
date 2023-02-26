package com.payload;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GithubCommitDeserializer extends JsonDeserializer<GithubCommit> {

    @Override
    public GithubCommit deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(p);
        GithubCommit commit = new GithubCommit();
        commit.setSha(node.get("sha").asText());
        commit.setUrl(node.get("url").asText());
        commit.setAuthor(node.get("commit").get("author").get("name").asText());
        commit.setMessage(node.get("commit").get("message").asText());
        String dateString = node.get("commit").get("author").get("date").asText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        commit.setTimestamp(OffsetDateTime.parse(dateString, formatter));
        return commit;
    }

}
