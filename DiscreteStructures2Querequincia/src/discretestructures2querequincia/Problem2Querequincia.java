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
public class Problem2Querequincia extends DiscreteStructures2Querequincia {
    public static void problem2RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #2");
        System.out.println();
        System.out.println("Case #1"); //Cycle Graph
        int[][] adjacencyMatrix1Querequincia = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0}
        };
        listEdgesAndCountQuerequincia(adjacencyMatrix1Querequincia);
        System.out.println();
        System.out.println("Case #2:"); //Fully Connected Graph
        int[][] adjacencyMatrix2Querequincia = {
            {0, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 0}
        };
        listEdgesAndCountQuerequincia(adjacencyMatrix2Querequincia);
        System.out.println();
        System.out.println("Case #3:"); //Linear Graph
        int[][] adjacencyMatrix3Querequincia = {
            {0, 1, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {0, 0, 1, 0}
        };
        listEdgesAndCountQuerequincia(adjacencyMatrix3Querequincia);
        System.out.println();
        System.out.println("Case #4:"); //Star Graph
        int[][] adjacencyMatrix4Querequincia = {
            {0, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        listEdgesAndCountQuerequincia(adjacencyMatrix4Querequincia);
        System.out.println();
        System.out.println("Case #5:"); //Graph With Isolated Nodes
        int[][] adjacencyMatrix5Querequincia = {
            {0, 1, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 1, 0}
        };
        listEdgesAndCountQuerequincia(adjacencyMatrix5Querequincia);
    }

    public static void listEdgesAndCountQuerequincia(int[][] matrixQuerequincia) {
        Map<String, Integer> edgeCountQuerequincia = new HashMap<>();

        for (int iQuerequincia = 0; iQuerequincia < matrixQuerequincia.length; iQuerequincia++) {
            for (int jQuerequincia = iQuerequincia + 1; jQuerequincia < matrixQuerequincia[iQuerequincia].length; jQuerequincia++) {
                if (matrixQuerequincia[iQuerequincia][jQuerequincia] > 0) {
                    String edgeQuerequincia = iQuerequincia + "-" + jQuerequincia;
                    edgeCountQuerequincia.put(edgeQuerequincia, edgeCountQuerequincia.getOrDefault(edgeQuerequincia, 0)
                            + matrixQuerequincia[iQuerequincia][jQuerequincia]);
                }
            }
        }

        System.out.println("Edges and their counts:");
        for (Map.Entry<String, Integer> entryQuerequincia : edgeCountQuerequincia.entrySet()) {
            System.out.println(entryQuerequincia.getKey() + ": " + entryQuerequincia.getValue());
        }
    }
}
