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
public class Problem1Querequincia extends DiscreteStructures2Querequincia {
    
    public static void problem1RunQuerequincia() { 
        System.out.println();
        System.out.println();
        System.out.println("Problem #1");
        System.out.println();
        System.out.println("Case #1 Edges = \"0,1\", \"1,2\", \"3,4\", \"4,5\""); 
        //Disconnected Graph
        List<String> edgesQuerequincia1 = Arrays.asList("0,1", "1,2", "3,4", "4,5"); 
        analyzeGraphQuerequincia(edgesQuerequincia1); 
        System.out.println();
        System.out.println("Case #2 Edges = \"0,1\", \"1,2\", \"2,3\", \"3,0\"");
        //Fully Connected Graph
        List<String> edgesQuerequincia2 = Arrays.asList("0,1", "1,2", "2,3", "3,0"); 
        analyzeGraphQuerequincia(edgesQuerequincia2); 
        System.out.println();
        System.out.println("Case #3 Edges = \"0,1\", \"1,2\", \"2,3\"");
        //Linear Graph
        List<String> edgesQuerequincia3 = Arrays.asList("0,1", "1,2", "2,3"); 
        analyzeGraphQuerequincia(edgesQuerequincia3); 
        System.out.println();
        System.out.println("Case #4 Edges = \"0,1\", \"0,2\", \"0,3\", \"0,4\"");
        //Star Graph
        List<String> edgesQuerequincia4 = Arrays.asList("0,1", "0,2", "0,3", "0,4"); 
        analyzeGraphQuerequincia(edgesQuerequincia4); 
        System.out.println();
        System.out.println("Case #5 Edges = \"0,1\", \"2,3\", \"4,5\", \"6,7\"");
        //Graph With Isolated Nodes
        List<String> edgesQuerequincia5 = Arrays.asList("0,1", "2,3", "4,5", "6,7"); 
        analyzeGraphQuerequincia(edgesQuerequincia5); 
    } 
    
    public static void analyzeGraphQuerequincia(List<String> edgesQuerequincia) { 
        try { 
            Map<Integer, List<Integer>> graphQuerequincia = new HashMap<>(); 
            Set<Integer> visitedQuerequincia = new HashSet<>(); 

            // Build the graph 
            for (String edgeQuerequincia : edgesQuerequincia) { 
                String[] verticesQuerequincia = edgeQuerequincia.split(","); 
                int uQuerequincia = Integer.parseInt(verticesQuerequincia[0].trim()); 
                int vQuerequincia = Integer.parseInt(verticesQuerequincia[1].trim()); 
                graphQuerequincia.putIfAbsent(uQuerequincia, new ArrayList<>()); 
                graphQuerequincia.putIfAbsent(vQuerequincia, new ArrayList<>()); 
                graphQuerequincia.get(uQuerequincia).add(vQuerequincia); 
                graphQuerequincia.get(vQuerequincia).add(uQuerequincia); 
            } 

            int connectedComponentsQuerequincia = 0; 

            //Find connected components 
            for (int nodeQuerequincia : graphQuerequincia.keySet()) { 
                if (!visitedQuerequincia.contains(nodeQuerequincia)) { 
                    connectedComponentsQuerequincia++; 
                    dfsQuerequincia(nodeQuerequincia, graphQuerequincia, visitedQuerequincia); 
                } 
            } 

            //Check if the graph is connected 
            if (connectedComponentsQuerequincia == 1) { 
                System.out.println("The graph is connected."); 
            } else { 
                System.out.println("The graph is not connected."); 
                System.out.println("Number of connected components: " + connectedComponentsQuerequincia); 
            } 
        } catch (Exception e) { 
            System.err.println("Error analyzing the graph: " + e.getMessage()); 
        } 
    } 
    
    private static void dfsQuerequincia(int nodeQuerequincia, Map<Integer, List<Integer>> graphQuerequincia,
            Set<Integer> visitedQuerequincia) { 
        Stack<Integer> stack = new Stack<>(); 
        stack.push(nodeQuerequincia); 

        while (!stack.isEmpty()) { 
            int currentQuerequincia = stack.pop(); 
            if (!visitedQuerequincia.contains(currentQuerequincia)) { 
                visitedQuerequincia.add(currentQuerequincia); 
                for (int neighborQuerequincia : graphQuerequincia.get(currentQuerequincia)) { 
                    if (!visitedQuerequincia.contains(neighborQuerequincia)) { 
                        stack.push(neighborQuerequincia); 
                    } 
                } 
            } 
        } 
    } 
    
} 

