package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Graph {
    private ArrayList<Vertex> vertices = new ArrayList<Vertex>(); //Holds all the vertices inside the graph.
    private ArrayList<Edge> edges = new ArrayList<Edge>(); //Holds all the edges inside the graph.
    private Vertex start; //Starting node
    private Vertex finish; //Node we want to end at.

    public void addVertex(Vertex ...vertex)
    {
        this.vertices.addAll(Arrays.asList(vertex));
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void connect(Vertex a, Vertex b, int weight)
    {
        Edge edge = new Edge(a, b, weight);
        a.setAdjacent(b);
        b.setAdjacent(a);
        this.edges.add(edge);
    }

    public void setStart(Vertex a)
    {
        this.start = a;
        this.start.setPath(this.start.getName(), true);
        this.start.setCost(0);
    }

    public void setFinish(Vertex a)
    {
        this.finish = a;
    }

    public void dijkstra()
    {
        while (this.vertices.contains(this.finish)) // Keep looping while the list still holds the destination node.
        {
            this.vertices.remove(this.start); //Removes the current node. Removing it from the set.
            ArrayList<Vertex> adjacent_nodes = this.start.getAdjacent(); //Will return a list of adjacent nodes of the current node.
            int dist = 0; // Used to calculate the weights.
            Edge e = new Edge(null, null, 0); //Used to determine which edge is incident to the two vertices.
            for (Vertex vertex : adjacent_nodes) //Looking at each adjacent node to the current node
            {
                if (!this.vertices.contains(vertex)) // If the adjacent nodes are not in the vertices list, move onto the next adjacent node.
                {
                    continue;
                }
                for (Edge edge: this.edges)
                {
                    if (edge.getLeft().equals(this.start) && edge.getRight().equals(vertex))
                    {
                        e = edge;
                        break;
                    } //end if
                }// end for

                dist = this.start.getCost() + e.getWeight(); //Calculating the weight and then comparing it
                if (vertex.getCost() > dist)
                {
                    vertex.setCost(dist); //Updating the cost
                    vertex.setPath(this.start.getPath(), false); //Updating the path.
                }


            } // end for

            if (this.start.equals(this.finish)) // Break out of the loop if start = finish.
            {
                System.out.println("Reached the final node...");
                System.out.println(this.start.finalPath(this.start));
                System.out.println(this.start.getCost());
                break;
            } //end if

            ArrayList<Integer> costs = new ArrayList<>(); //Used to find the smallest cost inside the cost table
            for (Vertex vertex : this.vertices)
            {
                costs.add(vertex.getCost()); //Looping through and adding costs of each vertex.
            }

            this.start = this.vertices.get(costs.indexOf(Collections.min(costs))); // Looks for the smallest number in the integer type costs and returns the index of that cheapest node.

        } // end while
    }
}
