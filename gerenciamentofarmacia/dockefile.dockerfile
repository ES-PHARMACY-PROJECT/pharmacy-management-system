# Etapa de build
FROM ubuntu:latest AS build

# Atualiza a lista de pacotes e instala o OpenJDK e Maven
RUN apt-get update && apt-get install -y openjdk-17-jdk maven

# Define o diretório de trabalho
WORKDIR /app

# Copia o código-fonte e o arquivo pom.xml para o diretório de trabalho
COPY . .

# Verifica o ambiente e versões
RUN java -version
RUN mvn -version

# Executa o Maven para construir o projeto
RUN mvn clean install

# Etapa final
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR construído da etapa anterior
COPY --from=build /app/target/gerenciamentofarmacia-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta que a aplicação vai usar
EXPOSE 8080

# Define o comando para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]