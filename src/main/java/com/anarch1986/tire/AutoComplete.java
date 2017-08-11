package com.anarch1986.tire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoComplete {

    public TrieDataNode root;

    /**
     * Starts a new Trie with dummy root data "-"
     */
    public AutoComplete() {
        root = new TrieDataNode('*');
    }

    /**
     * Adds a word to the Trie.
     *
     * @param wordToAdd
     */
    public void addWord(String wordToAdd) {
        char[] lettersToAdd = wordToAdd.toCharArray();
        TrieDataNode node = root;
        for (int i=0;i<lettersToAdd.length;i++) {
            ArrayList<Character> oldLetters = new ArrayList<Character>();
            for (int j=0;j<node.getChildren().size();j++) {
                oldLetters.add(node.getChildren().get(j).getData());
            }
            if (oldLetters.contains(lettersToAdd[i])==false){
                TrieDataNode nodeToAdd=new TrieDataNode(lettersToAdd[i]);
                node.getChildren().add(nodeToAdd);
            }
            node = node.getChildren().get(node.getChildren().size()-1);
        }
    }

    public void addEnding(TrieDataNode node) {
        if (node.getChildren().size()==0){
            node.getChildren().add(new TrieDataNode('*'));
        }
        else {
            for (int i = 0;i<node.getChildren().size();i++) {
                addEnding(node.getChildren().get(i));
            }
        }
    }


    /**
     * Returns the possible completions of baseChars String from the Trie.
     *
     * @param baseChars The String to autocomplete.
     * @return possible completions. An empty list if there are none.
     */
    public List<String> autoComplete(String baseChars) {
        char[] letters = baseChars.toCharArray();
        List<String> words = new ArrayList<String>();
        TrieDataNode node = root;
        StringBuilder builder = new StringBuilder();
        int counter=0;
        for (int i = 0;i<letters.length;i++) {
            for (int j=0;j<node.getChildren().size();j++) {
                if (node.getChildren().get(j).getData()==letters[i]){
                    builder.append(node.getChildren().get(j).getData());
                }
                if (j==letters.length-1) {

                }
            }
        }
        words.add(builder.toString());
        return words;
    }


    /**
     * Removes a word from the Trie
     *
     * @param wordToRemove
     * @return true if the removal was successful
     */
    public boolean removeWord(String wordToRemove) {
        // TODO -- Optional homework
        return false;
    }

}
