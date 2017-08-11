package com.anarch1986.tire;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class TrieDataNode {

    private Character data;
    private ArrayList<TrieDataNode> children;
    // TODO add further members as needed

    /**
     * Initializes a TrieDataNode with its data
     * @param data
     */
    public TrieDataNode(char data) {

        this.data = data;
        this.children = new ArrayList<TrieDataNode>();
    }

    /**
     * Getter for data
     * @return data
     */
    public char getData() {
        return data;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }

    public void setData(Character data) {
        this.data = data;
    }

    public ArrayList<TrieDataNode> getChildren() {
        return children;
    }
}
