/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugastiga;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author dhil
 */
public class TugasTiga {
    
    static class SoalSatu {
        class Graph {
            private int V;
            private LinkedList<Integer> adj[];
            
            Graph(int v){
                V = v;
                adj = new LinkedList[v];
                
                for (int i = 0; i < v; i++) {
                    adj[i] = new LinkedList();
                }
            }
            
            void addEdge(int v, int w){
                adj[v].add(w);
            }
            
            void DFSUtil(int v, boolean visited[]){
                visited[v] = true;
                System.err.print(v+" ");
                Iterator<Integer> i = adj[v].listIterator();
                
                while (i.hasNext()) {
                    Integer next = i.next();
                    if(!visited[next]){
                        DFSUtil(next, visited);
                    }
                }
                
            }
            
            void DFS(int v){
                boolean[] visited = new boolean[V];
                DFSUtil(v, visited);
            }
            
        }
        
        void print(){
            Graph graph = new Graph(7);
        
            int[] a1 = {0,1};
            int[] a2 = {1,2};
            int[] a3 = {1,3};
            int[] a4 = {2,3};
            int[] a5 = {2,4};
            int[] a6 = {3,5};
            int[] a7 = {3,6};
            
            int[][] edges = {
                a1,
                a2,
                a3,
                a4,
                a5,
                a6,
                a7
            };
            
            for (int[] e : edges)
            {
                graph.addEdge(e[0], e[1]);
            }
            
            graph.DFS(0);
        }
    }
    
    static class SoalDua {
        class Graph {
            private int V;
            private LinkedList<Integer> adj[];
            
            Graph(int v){
                V = v;
                adj = new LinkedList[v];
                
                for (int i = 0; i < v; i++) {
                    adj[i] = new LinkedList();
                }
            }
            
            void addEdge(int v, int w){
                adj[v].add(w);
            }
            
            void BFS(int s){
                boolean[] visited = new boolean[V];
                LinkedList<Integer> queue = new LinkedList();
                
                visited[s] = true;
                queue.add(s);
                
                while(queue.size() != 0){
                    s = queue.poll();
                    System.err.print(s+" ");
                    Iterator<Integer> i = adj[s].listIterator();
                    
                    while(i.hasNext()){
                        int n = i.next();
                        if(!visited[n]){
                            visited[n] = true;
                            queue.add(n);
                        }
                    }
                }
            }
        }
        
        void print(){
            Graph graph = new Graph(7);
        
            int[] a1 = {0,1};
            int[] a2 = {1,2};
            int[] a3 = {1,3};
            int[] a4 = {2,3};
            int[] a5 = {2,4};
            int[] a6 = {3,5};
            int[] a7 = {3,6};
            
            int[][] edges = {
                a1,
                a2,
                a3,
                a4,
                a5,
                a6,
                a7
            };
            
            for (int[] e : edges)
            {
                graph.addEdge(e[0], e[1]);
            }
            
            graph.BFS(0);
        }
        
    }

    public static void main(String[] args) {
        SoalSatu soal1 = new SoalSatu();
        
        System.out.println("Soal 1:");
        soal1.print();
        
        System.out.println("------------------------");
        
        SoalDua soal2 = new SoalDua();
        System.out.println("Soal 2:");
        soal2.print();
    }
}
