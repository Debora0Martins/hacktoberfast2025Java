# hacktoberfast2025Java — Calculadora Interativa

Este repositório contém uma pequena calculadora interativa em Java.

Estrutura recomendada (já aplicada):
- src/main/java/InteractiveCalculator.java

Como compilar e executar

Opção A — sem Gradle (javac + java)
1. Compile:
   javac -d out src/main/java/InteractiveCalculator.java
2. Execute:
   java -cp out InteractiveCalculator

Opção B — com Gradle (se tiver o Gradle instalado)
1. No diretório do projeto:
   gradle run

Observações
- O projeto usa package padrão (sem package) para manter simples.
- Se quiser executar sem ter o Gradle instalado, eu posso adicionar o Gradle Wrapper (arquivos `gradlew`), assim qualquer usuário pode rodar `./gradlew run` (Unix) ou `gradlew.bat run` (Windows).

Melhorias possíveis
- Adicionar testes unitários com JUnit.
- Empacotar como JAR executável.
- Adicionar Gradle Wrapper para rodar sem instalar Gradle.
