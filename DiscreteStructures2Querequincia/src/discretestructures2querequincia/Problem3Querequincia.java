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
public class Problem3Querequincia extends DiscreteStructures2Querequincia {
    public static void problem3RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #3");
        System.out.println();
        //Case #1: Disconnected Graph
        System.out.println("Case #1 Edges = \"0,1\", \"1,2\", \"3,4\", \"4,5\"");
        List<String> edgesQuerequincia1 = Arrays.asList("0,1", "1,2", "3,4", "4,5");
        testAndPrintResultQuerequincia(edgesQuerequincia1, 6); //6 vertices
        System.out.println(); //Cycle Graph
        System.out.println("Case #2 Edges = \"0,1\", \"1,2\", \"2,0\"");
        List<String> edgesQuerequincia2 = Arrays.asList("0,1", "1,2", "2,0");
        testAndPrintResultQuerequincia(edgesQuerequincia2, 3); //3 vertices
        System.out.println();
        //Case #3: Cycle Graph with Additional Edge
        System.out.println("Case #3 Edges = \"0,1\", \"1,2\", \"2,0\", \"0,3\"");
        List<String> edgesQuerequincia3 = Arrays.asList("0,1", "1,2", "2,0", "0,3");
        testAndPrintResultQuerequincia(edgesQuerequincia3, 4); //4 vertices
        System.out.println();
        //Case #4: Disconnected Graph with Cycles
        System.out.println("Case #4 Edges = \"0,1\", \"1,2\", \"2,0\", \"3,4\", \"4,5\"");
        List<String> edgesQuerequincia4 = Arrays.asList("0,1", "1,2", "2,0", "3,4", "4,5");
        testAndPrintResultQuerequincia(edgesQuerequincia4, 6); //6 vertices
        System.out.println();
        //Case #5: Graph with No Cycles
        System.out.println("Case #5 Edges = \"0,1\", \"1,2\", \"3,4\", \"4,5\", \"0,5\"");
        List<String> edgesQuerequincia5 = Arrays.asList("0,1", "1,2", "3,4", "4,5", "0,5");
        testAndPrintResultQuerequincia(edgesQuerequincia5, 6); //6 vertices
    }

    public static void testAndPrintResultQuerequincia(List<String> edgesQuerequincia, int numVerticesQuerequincia) {
        boolean hasCycleQuerequincia = hasCycleQuerequincia(edgesQuerequincia, numVerticesQuerequincia);
        System.out.println("Graph has cycle: " + hasCycleQuerequincia);
    }

    public static boolean hasCycleQuerequincia(List<String> edgesQuerequincia, int numVerticesQuerequincia) {
        //Construct adjacency list
        List<List<Integer>> graphQuerequincia = new ArrayList<>();
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            graphQuerequincia.add(new ArrayList<>());
        }
        for (String edgeQuerequincia : edgesQuerequincia) {
            String[] vertices = edgeQuerequincia.split(",");
            int uQuerequincia = Integer.parseInt(vertices[0]);
            int vQuerequincia = Integer.parseInt(vertices[1]);
            graphQuerequincia.get(uQuerequincia).add(vQuerequincia); //Viceversa
            graphQuerequincia.get(vQuerequincia).add(uQuerequincia); //Because it's an undirected graph
        }                                                            

        boolean[] visitedQuerequincia = new boolean[numVerticesQuerequincia];
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            if (!visitedQuerequincia[iQuerequincia] && hasCycleDFSQuerequincia(graphQuerequincia, iQuerequincia, -1,
                    visitedQuerequincia)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCycleDFSQuerequincia(List<List<Integer>> graphQuerequincia, int currentQuerequincia,
            int parentQuerequincia, boolean[] visitedQuerequincia) {
        visitedQuerequincia[currentQuerequincia] = true;
        for (int neighborQuerequincia : graphQuerequincia.get(currentQuerequincia)) {
            if (!visitedQuerequincia[neighborQuerequincia]) {
                if (hasCycleDFSQuerequincia(graphQuerequincia, neighborQuerequincia, currentQuerequincia, visitedQuerequincia)) {
                    return true;
                }
            } else if (neighborQuerequincia != parentQuerequincia) {
                return true; //Found a cycle
            }
        }
        return false;
    }
}
