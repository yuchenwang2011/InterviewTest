# InterviewTest
This project is a Maven projected created by IntelliJ Idea. 

To open the project, you can either import it from IntelliJ IDE

or you can open use IntelliJ / Eclipse to open the pom.xml file


Source code is under:
YuchenInteviewTest/src/main/java/StringProcessor.java

Test code is under: (11 unit tests)
YuchenInteviewTest/src/test/java/StringProcessorTest.java

The project is written based on assumption that:
 1. input can be null
 2. input length can be 0
 3. input may have one or many empty spaces, at start, end or middle positions (worst case, whole string)
 4. there might be more than one words have the longest length, in this case, return first one
 5. word has punctuations, underscores will be considered as a space, the word will become 2 words
 6. numbers 0-9 will be considered as part of the string as a regular letter