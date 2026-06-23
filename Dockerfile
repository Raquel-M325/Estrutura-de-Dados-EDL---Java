FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac hashTable/hashDuplo/InvalidHashTable.java \
          hashTable/hashDuplo/HashTable.java \
          hashTable/hashDuplo/Item.java \
          hashTable/hashDuplo/Position.java \
          hashTable/hashDuplo/Teste.java
CMD ["java", "hashTable.hashDuplo.Teste"]