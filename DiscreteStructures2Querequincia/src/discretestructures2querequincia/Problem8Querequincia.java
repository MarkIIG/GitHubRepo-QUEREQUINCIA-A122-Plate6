/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discretestructures2querequincia;

/**
 *
 * @author Marki Querequincia
 */
import java.util.*;
public class Problem8Querequincia extends DiscreteStructures2Querequincia {
    public static void problem8RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #6");
        System.out.println();
        //Isomorphic Graphs
        System.out.println("Case #1:");
        System.out.println("Edges 1: {0, 1}, {1, 2}, {2, 0}");
        System.out.println("Edges 2: {3, 4}, {4, 5}, {5, 3}");
        int[][] graph1Edges1Querequincia = {{0, 1}, {1, 2}, {2, 0}};
        int[][] graph2Edges1Querequincia = {{3, 4}, {4, 5}, {5, 3}};
        testAndPrintIsomorphismQuerequincia(graph1Edges1Querequincia, graph2Edges1Querequincia, 6);
        System.out.println();
        //Non-Isomorphic Graphs
        System.out.println("Case #2:");
        System.out.println("Edges 1: {0, 1}, {0, 2}, {1, 2}, {1, 3}");
        System.out.println("Edges 2: {0, 1}, {1, 2}, {2, 3}, {0, 3}");
        int[][] graph1Edges2Querequincia = {{0, 1}, {0, 2}, {1, 2}, {1, 3}};
        int[][] graph2Edges2Querequincia = {{0, 1}, {1, 2}, {2, 3}, {0, 3}};
        testAndPrintIsomorphismQuerequincia(graph1Edges2Querequincia, graph2Edges2Querequincia, 4);
        System.out.println();
        //Empty Graphs
        System.out.println("Case #3:");
        System.out.println("Edges 1: {}");
        System.out.println("Edges 2: {}");
        int[][] graph1Edges3Querequincia = {};
        int[][] graph2Edges3Querequincia = {};
        testAndPrintIsomorphismQuerequincia(graph1Edges3Querequincia, graph2Edges3Querequincia, 0);
        System.out.println();
        //Single Vertex Graphs
        System.out.println("Case #4:");
        System.out.println("Edges 1: {0, 0}");
        System.out.println("Edges 2: {0, 0}");
        int[][] graph1Edges4Querequincia = {{0, 0}};
        int[][] graph2Edges4Querequincia = {{0, 0}};
        testAndPrintIsomorphismQuerequincia(graph1Edges4Querequincia, graph2Edges4Querequincia, 1);
        System.out.println();
        //Different Number of Vertices
        System.out.println("Case #5:");
        System.out.println("Edges 1: {0, 1}, {1, 2}, {2, 0}");
        System.out.println("Edges 2: {0, 1}, {1, 2}");
        int[][] graph1Edges5Querequincia = {{0, 1}, {1, 2}, {2, 0}};
        int[][] graph2Edges5Querequincia = {{0, 1}, {1, 2}};
        testAndPrintIsomorphismQuerequincia(graph1Edges5Querequincia, graph2Edges5Querequincia, 3);
    }

    public static void testAndPrintIsomorphismQuerequincia(int[][] edges1Querequincia,
            int[][] edges2Querequincia, int numVerticesQuerequincia) {
        boolean isIsomorphicQuerequincia = isIsomorphicGraphQuerequincia(edges1Querequincia,
            edges2Querequincia, numVerticesQuerequincia);
        System.out.println("Graphs are Isomorphic: " + isIsomorphicQuerequincia);
    }

    public static boolean isIsomorphicGraphQuerequincia(int[][] edges1Querequincia,
            int[][] edges2Querequincia, int numVerticesQuerequincia) {
        if (edges1Querequincia.length != edges2Querequincia.length) {
            return false; //Graphs must have the same number of edges
        }

        Map<Integer, Integer> mapQuerequincia = new HashMap<>();
        Set<Integer> usedQuerequincia = new HashSet<>();
        for (int[] edgeQuerequincia : edges1Querequincia) {
            int u1Querequincia = edgeQuerequincia[0];
            int v1Querequincia = edgeQuerequincia[1];
            int u2Querequincia = -1;
            int v2Querequincia = -1;
            for (int[] edge2Querequincia : edges2Querequincia) {
                if (edge2Querequincia[0] == u1Querequincia && !usedQuerequincia.contains(edge2Querequincia[1])) {
                    u2Querequincia = edge2Querequincia[0];
                    v2Querequincia = edge2Querequincia[1];
                    break;
                } else if (edge2Querequincia[1] == u1Querequincia && !usedQuerequincia.contains(edge2Querequincia[0])) {
                    u2Querequincia = edge2Querequincia[1];
                    v2Querequincia = edge2Querequincia[0];
                    break;
                }
            }
            if (u2Querequincia == -1) {
                return false; //No matching edge found in graph 2
            }
            mapQuerequincia.put(u1Querequincia, u2Querequincia);
            mapQuerequincia.put(v1Querequincia, v2Querequincia);
            usedQuerequincia.add(u2Querequincia);
            usedQuerequincia.add(v2Querequincia);
        }
        return mapQuerequincia.size() == numVerticesQuerequincia * 2;
    }
}
