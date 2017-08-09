package com.anarch1986.tire;

import java.util.ArrayList;
import java.util.List;

public class AutoComplete {

    public TrieDataNode root;

    /**
     * Starts a new Trie with dummy root data "-"
     */
    public AutoComplete() {
        root = new TrieDataNode('-');
    }

    /**
     * Adds a word to the Trie.
     * @param wordToAdd
     */
    public void addWord(String wordToAdd) {
        char[] letters = wordToAdd.toCharArray();
        TrieDataNode node = root;
        int counter = 0;
        while (counter < letters.length) {
            addLetter(letters[counter],node);
            node = node.getChildren().get(0);
            counter++;
        }
    }

    public void addLetter(Character charToAdd, TrieDataNode node) {
        ArrayList<Character> letters = new ArrayList<Character>();
            for (TrieDataNode childNode : node.getChildren()) {
                letters.add(childNode.getData());
                }
            if (letters.contains(charToAdd)==false) {
                node.getChildren().add(new TrieDataNode(charToAdd));
            }
        }


    /**
     * Returns the possible completions of baseChars String from the Trie.
     * @param baseChars The String to autocomplete.
     * @return possible completions. An empty list if there are none.
     */
    public List<String> autoComplete(String baseChars) {
        char[] letters = baseChars.toCharArray();
        List<String> words = new ArrayList<String>();
        // TODO
        return words;
    }

    /**
     * Removes a word from the Trie
     * @param wordToRemove
     * @return true if the removal was successful
     */
    public boolean removeWord(String wordToRemove) {
        // TODO -- Optional homework
        return false;
    }

}
