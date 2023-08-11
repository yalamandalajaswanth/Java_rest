# Java_rest
project to enroll a member, demonstrating the understanding of restapis, JPA, and springboot
This project implements a RESTful API for member enrollment using Java and a local H2 database for data storage.

Setup Instructions
Clone the Repository: Clone this repository to your local machine using the following command:git clone <repository_url>
Open the Project: Open the project in your preferred Java IDE (Eclipse, IntelliJ, etc.).

Add Dependencies: Ensure that your project's pom.xml file has the necessary dependencies, including the H2 Database dependency.

Configure the Database:

Open the src/main/resources/application.properties file.
Configure the H2 Database connection by setting the database URL to jdbc:h2:mem:testdb, the username to sa, and leaving the password blank. Make sure the appropriate driver class and Hibernate dialect are set.

Build the Project: Use your IDE's build tools or use the following command to build the project:mvn clean install

Run the Application: Use the following command to run the application: mvn spring-boot:run

API Testing: After running the application, you can test the API endpoints using tools like cURL, Postman, or a web browser. The API endpoints are accessible at http://localhost:8080/api/members.
