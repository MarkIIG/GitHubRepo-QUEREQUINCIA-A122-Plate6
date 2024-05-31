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
public class Problem7Querequincia extends DiscreteStructures2Querequincia {
    public static void problem7RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #6");
        System.out.println();
        //Simple Undirected Graph
        System.out.println("Case #1");
        List<String> edges1Querequincia = Arrays.asList("0,1", "0,2", "1,2", "2,3");
        int[] edgeCounts1Querequincia = {3, 1, 2, 1};
        constructAndPrintIncidenceMatrixQuerequincia(edges1Querequincia, edgeCounts1Querequincia, 4); //4 vertices
        System.out.println();
        //Graph with Loops and Multiple Edges
        System.out.println("Case #2");
        List<String> edges2Querequincia = Arrays.asList("0,0", "0,1", "1,0", "1,1", "2,3", "3,2");
        int[] edgeCounts2Querequincia = {2, 1, 1, 2, 1, 1};
        constructAndPrintIncidenceMatrixQuerequincia(edges2Querequincia, edgeCounts2Querequincia, 4); //4 vertices
        System.out.println();
        //Disconnected Graph
        System.out.println("Case #3");
        List<String> edges3Querequincia = Arrays.asList("0,1", "2,3");
        int[] edgeCounts3Querequincia = {2, 1};
        constructAndPrintIncidenceMatrixQuerequincia(edges3Querequincia, edgeCounts3Querequincia, 4); //4 vertices
        System.out.println();
        //Single Vertex Graph
        System.out.println("Case #4");
        List<String> edges4Querequincia = Arrays.asList("0,0");
        int[] edgeCounts4Querequincia = {1};
        constructAndPrintIncidenceMatrixQuerequincia(edges4Querequincia, edgeCounts4Querequincia, 1); //1 vertex
        System.out.println();
        //Graph with Multiple Edges and Varying Counts
        System.out.println("Case #5");
        List<String> edges5Querequincia = Arrays.asList("0,1", "0,1", "1,2", "1,2", "2,3");
        int[] edgeCounts5Querequincia = {2, 1, 1, 2, 1};
        constructAndPrintIncidenceMatrixQuerequincia(edges5Querequincia, edgeCounts5Querequincia, 4); //4 vertices
    }

    public static void constructAndPrintIncidenceMatrixQuerequincia(List<String> edgesQuerequincia, 
            int[] edgeCountsQuerequincia, int numVerticesQuerequincia) {
        int numEdgesQuerequincia = edgesQuerequincia.size();
        int[][] incidenceMatrixQuerequincia = new int[numVerticesQuerequincia][numEdgesQuerequincia];
        for (int iQuerequincia = 0; iQuerequincia < numEdgesQuerequincia; iQuerequincia++) {
            String edgeQuerequincia = edgesQuerequincia.get(iQuerequincia);
            String[] verticesQuerequincia = edgeQuerequincia.split(",");
            int uQuerequincia = Integer.parseInt(verticesQuerequincia[0]);
            int vQuerequincia = Integer.parseInt(verticesQuerequincia[1]);
            incidenceMatrixQuerequincia[uQuerequincia][iQuerequincia] = edgeCountsQuerequincia[iQuerequincia]; //Increment count for multiple edges
            if (uQuerequincia != vQuerequincia) {
                incidenceMatrixQuerequincia[vQuerequincia][iQuerequincia] = edgeCountsQuerequincia[iQuerequincia]; //For undirected graphs
            }
        }

        System.out.println("Incidence Matrix:");
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            for (int jQuerequincia = 0; jQuerequincia < numEdgesQuerequincia; jQuerequincia++) {
                System.out.print(incidenceMatrixQuerequincia[iQuerequincia][jQuerequincia] + " ");
            }
            System.out.println();
        }
    }
}
