package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
//        Vertex f = new Vertex("f");
//        Vertex g = new Vertex("g");
//        Vertex h = new Vertex("h");
//        Vertex i = new Vertex("i");
//        Vertex j = new Vertex("j");
        Vertex z = new Vertex("z");

        Graph graph = new Graph();
//        graph.addVertex(a,b,c,d,e,f,g,h,i); //Graph 1
//
//        graph.connect(a,c,8);
//        graph.connect(a,h,11);
//
//        graph.connect(b,a,4);
//        graph.connect(b,h,8);
//
//        graph.connect(h,i,7);
//        graph.connect(h,g,1);
//
//        graph.connect(c,i,2);
//        graph.connect(c,f,4);
//        graph.connect(c,d,7);
//
//        graph.connect(i,g,6);
//
//        graph.connect(g,f,2);
//
//        graph.connect(d,f,14);
//        graph.connect(d,e,9);
//
//        graph.connect(f,e,10);


//        graph.addVertex(a,b,c,d,e,f,g,h,i,j,z); //Adding the vertices onto the graph graph 2
//        graph.connect(a, b, 3);
//        graph.connect(a, e, 5);
//        graph.connect(a, h, 4);
//
//        graph.connect(b, e, 5);
//        graph.connect(b, c, 2);
//        graph.connect(b, f, 7);
//
//        graph.connect(e, h, 7);
//        graph.connect(e, f, 4);
//
//        graph.connect(h, f, 5);
//        graph.connect(h, i, 2);
//
//        graph.connect(c, f, 2);
//        graph.connect(c, g, 6);
//        graph.connect(c, d, 3);
//
//        graph.connect(f, g, 4);
//        graph.connect(f, j, 3);
//        graph.connect(f, i, 4);
//
//        graph.connect(i, j, 6);
//
//        graph.connect(d, g, 7);
//        graph.connect(d, z, 2);
//
//        graph.connect(g, z, 6);
//        graph.connect(g, j, 4);
//
//        graph.connect(j, z, 5);


//        graph.connect(a,b,4);  graph 3
//        graph.connect(a,h,8);
//
//        graph.connect(b,h,11);
//        graph.connect(b,c,8);
//
//        graph.connect(h,i,7);
//        graph.connect(h,g,1);
//
//        graph.connect(i,c,2);
//        graph.connect(i,g,6);
//
//        graph.connect(g,f,2);
//
//        graph.connect(c,f,4);
//        graph.connect(c,d,7);
//
//        graph.connect(f,d,14);
//        graph.connect(d,e,9);
//
//        graph.connect(f,e,10);
//
//        graph.addVertex(a,b,c,d,e,f,g,h,i);


        graph.connect(a,b,4);
        graph.connect(a,c,2);

        graph.connect(b,c,1);
        graph.connect(b,d,5);
        graph.connect(c,d,8);
        graph.connect(c,e,10);
        graph.connect(d,z,6);
        graph.connect(e,z,3);
        graph.connect(d,e,2);

        graph.addVertex(a,b,c,d,e,z);
        graph.setStart(a);
        graph.setFinish(z);
        graph.dijkstra();

    }
}
