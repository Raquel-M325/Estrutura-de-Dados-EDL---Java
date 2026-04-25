FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Implementação/Vetor/Array/VetorVazia.java \
          Implementação/Vetor/Array/VetorArray.java \
          Implementação/Vetor/Array/TestesVetor.java
CMD ["java", "Implementação.Vetor.Array.TestesVetor"]