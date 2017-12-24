## Spring Boot - Jasypt Demo App


### Description
This application is showcasing how to use Jasypt spring boot starter project to encrypt/decrypt
properties in spring boot application.


### Steps

1. Add following dependency in your pom.xml

```aidl
        <dependency>
            <groupId>com.github.ulisesbocchio</groupId>
            <artifactId>jasypt-spring-boot-starter</artifactId>
            <version>1.17</version>
        </dependency>
```
2. Add following mandatory property either in your application.properties or as JVM option. 

```aidl
jasypt.encryptor.password=<PASSWORD>
```
3. Encrypt the properties with password you are providing in step. no. 2. You can use jasypt command line tool to encrypt your
properties. Format for the encrypted properties must follow the following example

```aidl
ENC(ENCRYPTED_STRING)
```