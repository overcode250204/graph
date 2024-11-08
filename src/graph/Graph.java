/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class Graph {
    int[][] a; // adjacency matrix
    String[] label; // labels of vertices
    int n; // number of vertices

    public Graph(int size) {
        n = size;
        a = new int[n][n];
        label = new String[n];
    }

    // Method to set adjacency matrix
    public void setAMatrix(int[][] b, int m) {
        n = m;
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(b[i], 0, a[i], 0, n);
        }
    }

    // Method to set vertex labels
    public void setLabel(String[] c) {
        label = new String[n];
        System.arraycopy(c, 0, label, 0, n);
    }

    // Breadth First Traversal
    public void breadthFirstTraverse(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(label[v] + " ");

            for (int i = 0; i < n; i++) {
                if (a[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    // Depth First Traversal
    public void depthFirstTraverse(int start) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        visited[start] = true;
        stack.push(start);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            System.out.print(label[v] + " ");

            for (int i = 0; i < n; i++) {
                if (a[v][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
}
