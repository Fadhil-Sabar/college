/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalsatu;

import java.io.*;
import java.util.*;

/**
 *
 * @author dhil
 */
public class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    
    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        
        for (int i = 0; i < v; ++i) 
            adj[i] = new LinkedList();
    }
    
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    
    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]) 
                DFSUtil(n, visited);
        }
    }
    
    void DFS(int v){
        boolean[] visited = new boolean[V];
        System.out.print(v + " ini v ");
        for (int i = 0; i < visited.length; i++) {
            System.out.println(visited[i] + " visited ");
        }
        DFSUtil(v, visited);
    }
    
    public static void main(String[] args) {
        Graph g = new Graph(7);
        
        int a1 = 0;
        int a2 = 1;
        int a3 = 2;
        int a4 = 3;
        int a5 = 4;
        int a6 = 5;
        int a7 = 6;
                
        g.addEdge(a1, a3);
        g.addEdge(a1, a2);
        g.addEdge(a1, a4);
        g.addEdge(a2, a6);
        g.addEdge(a3, a4);
        g.addEdge(a4, a5);
        g.addEdge(a5, a6);
        g.addEdge(a5, a7);
        g.addEdge(a7, a7);
        
        System.out.println("DFS"+"(vertex awal 0)");
        g.DFS(0);
    }
}
