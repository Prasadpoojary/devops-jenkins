FROM openjdk:21-jdk
WORKDIR /myapp
COPY ./target/DevopsDemo.jar /myapp
EXPOSE 9595
CMD ["java","-jar","DevopsDemo.jar"]