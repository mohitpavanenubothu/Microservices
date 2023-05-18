#FROM <image>
FROM openjdk:11
#Temp Run location
VOLUME /tmp
#Provide Port Information
EXPOSE 9971
#Jar location to mapping name
ADD target/springboot-githubactions.jar springboot-githubactions.jar
#Jar Execution command
ENTRYPOINT ["java","-jar","/springboot-githubactions.jar"]