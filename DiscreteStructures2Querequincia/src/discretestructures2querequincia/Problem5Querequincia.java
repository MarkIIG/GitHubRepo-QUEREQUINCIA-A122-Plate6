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
public class Problem5Querequincia extends DiscreteStructures2Querequincia {
    public static void problem5RunQuerequincia(){
        System.out.println();
        System.out.println();
        System.out.println("Problem #5");
        System.out.println();
        //Bipartite Graph
        System.out.println("Case #1");
        List<String> edges1Querequincia = Arrays.asList("0,1", "0,2", "1,3", "2,4");
        testAndPrintResultQuerequincia(edges1Querequincia, 5); //5 vertices
        System.out.println();
        //Non Bipartite Graph
        System.out.println("Case #2");
        List<String> edges2Querequincia = Arrays.asList("0,1", "1,2", "2,3", "3,4", "4,0");
        testAndPrintResultQuerequincia(edges2Querequincia, 5); //5 vertices
        System.out.println();
        //Single Vertex
        System.out.println("Case #3");
        List<String> edges3Querequincia = Arrays.asList("0,0");
        testAndPrintResultQuerequincia(edges3Querequincia, 1); //1 vertex
        System.out.println();
        //Graph with No Edges
        System.out.println("Case #4");
        List<String> edges4Querequincia = Collections.emptyList();
        testAndPrintResultQuerequincia(edges4Querequincia, 5); //5 vertices
        System.out.println();
        //Cycle Graph with Even Number of Vertices
        System.out.println("Case #5");
        List<String> edges5Querequincia = Arrays.asList("0,1", "1,2", "2,3", "3,4", "4,0");
        testAndPrintResultQuerequincia(edges5Querequincia, 5); //5 vertices
    }

    public static void testAndPrintResultQuerequincia(List<String> edgesQuerequincia, int numVerticesQuerequincia) {
        boolean isBipartiteQuerequincia = isBipartiteGraphQuerequincia(edgesQuerequincia, numVerticesQuerequincia);
        System.out.println("Is Bipartite: " + isBipartiteQuerequincia);
    }

    public static boolean isBipartiteGraphQuerequincia(List<String> edgesQuerequincia, int numVerticesQuerequincia) {
        List<List<Integer>> adjacencyListQuerequincia = new ArrayList<>();
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            adjacencyListQuerequincia.add(new ArrayList<>());
        }

        //Construct adjacency list
        for (String edgeQuerequincia : edgesQuerequincia) {
            String[] verticesQuerequincia = edgeQuerequincia.split(",");
            int uQuerequincia = Integer.parseInt(verticesQuerequincia[0]);
            int vQuerequincia = Integer.parseInt(verticesQuerequincia[1]);
            adjacencyListQuerequincia.get(uQuerequincia).add(vQuerequincia);
            adjacencyListQuerequincia.get(vQuerequincia).add(uQuerequincia);
        }

        int[] colorsQuerequincia = new int[numVerticesQuerequincia];
        Arrays.fill(colorsQuerequincia, -1); //Mark all vertices uncolored initially

        //Use BFS to color vertices and check for bipartiteness
        Queue<Integer> queue = new LinkedList<>();
        for (int iQuerequincia = 0; iQuerequincia < numVerticesQuerequincia; iQuerequincia++) {
            if (colorsQuerequincia[iQuerequincia] == -1) {
                colorsQuerequincia[iQuerequincia] = 0; //Color vertex i with color 0
                queue.offer(iQuerequincia);
                while (!queue.isEmpty()) {
                    int uQuerequincia = queue.poll();
                    for (int vQuerequincia : adjacencyListQuerequincia.get(uQuerequincia)) {
                        if (colorsQuerequincia[vQuerequincia] == -1) {
                            colorsQuerequincia[vQuerequincia] = 1 - colorsQuerequincia[uQuerequincia]; //Color vertex v opposite of u
                            queue.offer(vQuerequincia);
                        } else if (colorsQuerequincia[vQuerequincia] == colorsQuerequincia[uQuerequincia]) {
                            return false; //Graph is not bipartite
                        }
                    }
                }
            }
        }
        return true; //Graph is bipartite
    }
}
