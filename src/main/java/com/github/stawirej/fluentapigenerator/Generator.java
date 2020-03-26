package com.github.stawirej.fluentapigenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Piotr Stawirej
 */
final class Generator {

    public static void main(String[] args) throws IOException {

        String wordsFilePath = "src/main/resources/complexPrepositions.txt";
        String packageName = "com.github.stawirej.fluentapi.prepositions.complex";
        String templateConsumerFilePath = "src/main/resources/Consumer.template";
        String templateFunctionFilePath = "src/main/resources/Function.template";
        String outputFolder = "src/main/output";

        List<String> words = Files.readAllLines(Paths.get(wordsFilePath));
        String templateConsumer = readTemplate(templateConsumerFilePath);
        String templateFunction = readTemplate(templateFunctionFilePath);

        createInterfaceFile(templateConsumer, packageName, words, outputFolder, FunctionType.Consumer);
        createInterfaceFile(templateFunction, packageName, words, outputFolder, FunctionType.Function);
    }

    private static void createInterfaceFile(
            String template,
            String packageName,
            List<String> words,
            String outputFolder,
            FunctionType functionType) throws IOException {

        for (String word : words) {
            String interfaceName = firstLetterAsCapitalLetter(word);
            String filledTemplate = String.format(template, packageName, word, interfaceName, word);
            Files.write(Paths.get(outputFolder, interfaceName + functionType + ".java"), filledTemplate.getBytes());
        }
    }

    private static String readTemplate(String templateFilePath) throws IOException {

        List<String> templateLines = Files.readAllLines(Paths.get(templateFilePath));
        StringBuilder template = new StringBuilder();

        for (String line : templateLines) {
            template.append(line).append("\n");
        }

        return template.toString();
    }

    private static String firstLetterAsCapitalLetter(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
