# Cloud Functions with Java Getting Started

Java 11 works on Cloud Functions.

## Description

## Demo
### Functions Framework for Java

- [Functions Framework for Java](https://github.com/GoogleCloudPlatform/functions-framework-java/)
- [Google Cloud Platform repository tools for Java® (shared-configuration)](https://github.com/GoogleCloudPlatform/java-repo-tools)

#### Functions Framework Dependency

```xml
<dependency>
  <groupId>com.google.cloud.functions</groupId>
  <artifactId>functions-framework-api</artifactId>
  <version>1.0.1</version>
  <scope>provided</scope>
</dependency>
```

#### Specify Application Entry point

```xml
<plugin>
    <groupId>com.google.cloud.functions</groupId>
    <artifactId>function-maven-plugin</artifactId>
    <version>0.9.3</version>
    <configuration>
        <functionTarget>com.google.shinyay.HelloFunction</functionTarget>
    </configuration>
</plugin>
```
### HTTP Function

```java
public class HelloFunction implements HttpFunction {
    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception { }
}
```
## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
