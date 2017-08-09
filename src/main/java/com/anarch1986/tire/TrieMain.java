package com.anarch1986.tire;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TrieMain {

    public static void main(String[] args) throws IOException {

        Path worldListPath = new File
                ("/home/tomi/gits/java-algorithms/src/" +
                        "main/java/com/anarch1986/tire/smallwords.txt").toPath();
        List<String> wordList = Files.readAllLines(worldListPath);

        AutoComplete ac = new AutoComplete();
        for (String word : wordList) {
            ac.addWord(word);
        }

        System.out.println(ac.autoComplete("spectro"));
        System.out.println("done");
        System.out.println(ac.root);
        System.out.println(ac.root.getChildren());
        System.out.println(ac.root.getChildren().get(0).getChildren());
    }
}