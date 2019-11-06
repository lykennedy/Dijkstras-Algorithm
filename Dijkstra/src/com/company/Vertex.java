package com.company;

import java.util.ArrayList;

public class Vertex {
    private String name;
    private int cost = 999;
    private ArrayList<Vertex> Adjacent = new ArrayList<Vertex>();
    private ArrayList<Edge> Edges = new ArrayList<Edge>();
    private String path=""; // This will hold the path taken to get to this node.

    public String getPath() {
        return this.path;
    }

    public String finalPath(Vertex f) //Executed to get the final path for the destination node.
    {
        String prettypath = f.path.replace("","->");
        StringBuilder thePath = new StringBuilder(prettypath);
        thePath.deleteCharAt(0);
        thePath.deleteCharAt(0);
        thePath.deleteCharAt(thePath.length() - 1);
        thePath.deleteCharAt(thePath.length() - 1);
        return thePath.toString();
    }

    public void setPath(String path, boolean First) { //This will only be executed if a cost is changed.
        if (First)
        {
            this.path = this.name;
        }
        else
            {
                this.path = path + this.name;
            }
    }

    public Vertex(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    public ArrayList<Vertex> getAdjacent() {
        return this.Adjacent;
    }

    public ArrayList<Edge> getEdges() {
        return this.Edges;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAdjacent(Vertex adjacent) {
        this.Adjacent.add(adjacent);
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.Edges = edges;
    }
}
