package com.company;

public class Edge {
    private Vertex left;
    private Vertex right;
    private int weight;

    public Edge(Vertex left, Vertex right, int weight) {
        this.left = left;
        this.right = right;
        this.weight = weight;
    }

    public Vertex getLeft() {
        return left;
    }

    public Vertex getRight() {
        return right;
    }

    public int getWeight() {
        return weight;
    }
}
