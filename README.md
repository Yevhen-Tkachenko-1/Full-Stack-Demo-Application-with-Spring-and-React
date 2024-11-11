# Full-Stack demo application with Spring and React
Learn and play with Full-Stack development using Spring and React

Topics covered:
- Setting up the JPA repository
- Building the endpoints for the HTTP class controller
- Creating the front-end components
- Styling components
- Connecting component to the server

Implemented based on LinkedIn learning course: 
[Building Full-Stack Apps with React and Spring](https://www.linkedin.com/learning/building-full-stack-apps-with-react-and-spring)

### Tech stack

- Java 17
- Maven
- Spring Boot 3.1.1 (data-jpa, web, test)
- H2 database
- Lombok
- Node.js 18.16.1
- React 18.2.0

### Local run

- Run backend app using [application](src/main/java/com/yevhent/fullstackdemo/FullStackDemoApplication.java) class.<br>
  This will run Spring Boot server with access on `http://localhost:8083`
- Optionally, check backend REST API using postman with [this](postman/backend-requests.json) collection
- Install `nvm` to manage `npm` installations
- Install `npm` using command `nvm install latest`
- Run `nvm use latest` to enable `npm` on your machine
- Go to `client` directory 
- Run `npm install`
- Run `npm start`.<br>
  This will run React app with access on `http://localhost:3000`.<br>
  Open this in browser and play with UI page.
