FROM eclipse-temurin:17

WORKDIR /app

COPY . .

# cria pasta de saída organizada
RUN mkdir -p out && javac -d out $(find . -name "*.java")

# roda com classpath correto
CMD ["java", "-cp", "out", "Arvore.Arvore_binaria.TesteArvore"]