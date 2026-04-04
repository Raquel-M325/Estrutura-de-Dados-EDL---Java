FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Projeto_das_Pilhas/*.java

CMD ["java", "Projeto_das_Pilhas.TestePilhaRP"]