FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac hashTable/InvalidHashTable.java \
          hashTable/HashTable.java \
          hashTable/Item.java \
          hashTable/Position.java \
          hashTable/Teste.java
CMD ["java", "hashTable.Teste"]