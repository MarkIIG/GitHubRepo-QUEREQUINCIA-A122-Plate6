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
public class Problem4Querequincia extends DiscreteStructures2Querequincia {
    public static void problem4RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #4");
        System.out.println();
        //Simple Connected Graph
        System.out.println("Case #1");
        List<String> edges1Querequincia = Arrays.asList("0,1", "1,2", "2,3", "3,4");
        calculateDegreesAndPrintQuerequincia(edges1Querequincia, 5); //5 vertices
        System.out.println();
        //Graph with Loops
        System.out.println("Case #2");
        List<String> edges2Querequincia = Arrays.asList("0,0","0,1", "1,2", "2,3", "3,4", "4,0");
        calculateDegreesAndPrintQuerequincia(edges2Querequincia, 5); //5 vertices
        System.out.println();
        //Graph with Isolated Vertices
        System.out.println("Case #3");
        List<String> edges3Querequincia = Arrays.asList("0,1", "1,2", "3,4");
        calculateDegreesAndPrintQuerequincia(edges3Querequincia, 5); //5 vertices
        System.out.println();
        //Graph with Multiple Edges between Vertices
        System.out.println("Case #4");
        List<String> edges4Querequincia = Arrays.asList("0,1", "1,2", "0,2", "2,3", "3,4");
        calculateDegreesAndPrintQuerequincia(edges4Querequincia, 5); //5 vertices
        System.out.println();
        //Graph with a Single Vertex
        System.out.println("Case #5");
        List<String> edges5Querequincia = Arrays.asList("0,0");
        calculateDegreesAndPrintQuerequincia(edges5Querequincia, 1); //1 vertex
    }

    public static void calculateDegreesAndPrintQuerequincia(List<String> edgesQuerequincia, int numVerticesQuerequincia){
        int[] degreesQuerequincia = new int[numVerticesQuerequincia];
        for (String edgeQuerequincia : edgesQuerequincia) {
            String[] verticesQuerequincia = edgeQuerequincia.split(",");
            int uQuerequincia = Integer.parseInt(verticesQuerequincia[0]);
            int vQuerequincia = Integer.parseInt(verticesQuerequincia[1]);
            degreesQuerequincia[uQuerequincia]++;
            degreesQuerequincia[vQuerequincia]++;
        }

        System.out.println("Vertex Degrees:");
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            System.out.println("Vertex " + iQuerequincia + ": " + degreesQuerequincia[iQuerequincia]);
        }
    }
}
