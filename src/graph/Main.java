/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        int[][] adjMatrix = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0}
        };
        String[] labels = {"A", "B", "C", "D", "E"};

        graph.setAMatrix(adjMatrix, 5);
        graph.setLabel(labels);

       
        System.out.println("Breadth First Traversal từ đỉnh A:");
        graph.breadthFirstTraverse(0); 

        
        System.out.println("Depth First Traversal từ đỉnh A:");
        graph.depthFirstTraverse(0); 
    }
    
    
}
