FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Arvore/InvalidPositionExceptionArvore.java \
          Arvore/ArvoreSimples.java \
          Arvore/No.java \
          Arvore/Position.java \
          Arvore/Test.java
CMD ["java", "Arvore.Test"]