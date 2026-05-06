FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Implementação/Vetor/Duplamente/VetorVazia.java \
          Implementação/Vetor/Duplamente/VetorDupla.java \
          Implementação/Vetor/Duplamente/No.java \
          Implementação/Vetor/Duplamente/Vetor.java \
          Implementação/Vetor/Duplamente/TestesVetor.java
CMD ["java", "Implementação.Vetor.Duplamente.TestesVetor"]