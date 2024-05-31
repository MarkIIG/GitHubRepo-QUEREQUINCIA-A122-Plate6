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
public class Problem6Querequincia extends DiscreteStructures2Querequincia {
    public static void problem6RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #6");
        System.out.println();
        //Simple Undirected Graph
        System.out.println("Case #1");
        List<String> edges1Querequincia = Arrays.asList("0,1", "0,2", "1,2", "2,3");
        constructAndPrintAdjacencyMatrix(edges1Querequincia, 4); //4 vertices
        System.out.println();
        //Graph with Loops and Multiple Edges
        System.out.println("Case #2");
        List<String> edges2Querequincia = Arrays.asList("0,0", "0,1", "1,0", "1,1", "2,3", "3,2");
        constructAndPrintAdjacencyMatrix(edges2Querequincia, 4); //4 vertices
        System.out.println();
        //Directed Graph
        System.out.println("Case #3");
        List<String> edges3Querequincia = Arrays.asList("0,1", "1,2", "2,0", "3,2");
        constructAndPrintAdjacencyMatrix(edges3Querequincia, 4); //4 vertices
        System.out.println();
        //Disconnected Graph
        System.out.println("Case #4");
        List<String> edges4Querequincia = Arrays.asList("0,1", "2,3");
        constructAndPrintAdjacencyMatrix(edges4Querequincia, 4); //4 vertices
        System.out.println();
        //Single Vertex Graph
        System.out.println("Case #5");
        List<String> edges5Querequincia = Arrays.asList("0,0");
        constructAndPrintAdjacencyMatrix(edges5Querequincia, 1); //1 vertex
    }

    public static void constructAndPrintAdjacencyMatrix(List<String> edgesQuerequincia, int numVerticesQuerequincia) {
        int[][] adjacencyMatrix = new int[numVerticesQuerequincia][numVerticesQuerequincia];
        for (String edgeQuerequincia : edgesQuerequincia) {
            String[] verticesQuerequincia = edgeQuerequincia.split(",");
            int uQuerequincia = Integer.parseInt(verticesQuerequincia[0]);
            int vQuerequincia = Integer.parseInt(verticesQuerequincia[1]);
            adjacencyMatrix[uQuerequincia][vQuerequincia] += 1; //Increase count for multiple edges
            if (uQuerequincia != vQuerequincia) {
                adjacencyMatrix[vQuerequincia][uQuerequincia] += 1; //For undirected graphs
            }
        }

        System.out.println("Adjacency Matrix:");
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            for (int jQuerequincia = 0; jQuerequincia < numVerticesQuerequincia; jQuerequincia++) {
                System.out.print(adjacencyMatrix[iQuerequincia][jQuerequincia] + " ");
            }
            System.out.println();
        }
    }
}
