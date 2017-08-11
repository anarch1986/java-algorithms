package com.anarch1986.tire;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutoCompleteTest {

    @Test
    void autoComplete() throws IOException {
        Path worldListPath = new File
                ("/home/tomi/gits/java-algorithms" +
                        "/src/main/java/com/anarch1986/tire/wordlist.txt").toPath();
        List<String> wordList = Files.readAllLines(worldListPath);
        AutoComplete ac = new AutoComplete();
        for (String str : wordList) {
            ac.addWord(str);
        }
        ac.addEnding(ac.root);

        List<String> results = ac.autoComplete("spectro");
        List<String> expected = Arrays.asList(new String[]{"spectrogram", "spectrograph", "spectrographic", "spectrographically",
                "spectrometric", "spectrophotometer", "spectroscope", "spectroscopic", "spectroscopy"});
        assertIterableEquals(expected, results);
    }

}