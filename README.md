
# dummy-github-events

# GitHub API and Webhook Integration using Spring Boot

This is a Spring Boot application that integrates with the GitHub API and implements webhooks to track changes in a GitHub account. It allows you to monitor push, pull, and merge events in a GitHub repository, and retrieve the list of commits for the "dummy-github-events" repository. 

## Installation

1. Clone the repository: `git clone https://github.com/yourusername/dummy-github-events.git`
2. Navigate to the project directory: `cd dummy-github-events`
3. Install dependencies: `./gradlew build`

## Usage

To start the application, run the following command:
./gradlew bootRun


The application will start on port 8080. You can access the endpoints by visiting `http://localhost:8080`.

## Testing

To run the test suite, run the following command:

./gradlew test

This will run all of the tests in the project and provide a report of the results.

## Examples

Here's an example of how to use the application to retrieve the list of commits for the "dummy-github-events" repository:

1. Start the application: `./gradlew bootRun`
2. Navigate to `http://localhost:8080/commits` in your web browser.
3. You should see a list of commits for the "dummy-github-events" repository.




# tsx-java-26Feb2023
This repository contains a Spring Boot application that integrates with the GitHub API and implements webhooks to track changes in a GitHub account

