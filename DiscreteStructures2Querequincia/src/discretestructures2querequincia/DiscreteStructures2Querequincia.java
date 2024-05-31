/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discretestructures2querequincia;

/**
 *
 * @author Marki Querequincia
 */
import java.util.*;
public class DiscreteStructures2Querequincia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Simple Menu:
        while (true) {
            System.out.println("Plate #6 | Representing Graphs, Graph "
                    + "Isomorphism and Connectivity: ");
            
            System.out.println("[1] Problem 1");
            System.out.println("[2] Problem 2");
            System.out.println("[3] Problem 3");
            System.out.println("[4] Problem 4");
            System.out.println("[5] Problem 5");
            System.out.println("[6] Problem 6");
            System.out.println("[7] Problem 7");
            System.out.println("[8] Problem 8");
            System.out.println("[0] Problem Showcase Close");
            
            System.out.print("Enter your choice: ");
            
            int choiceQuerequincia = sc.nextInt();
            
            if (choiceQuerequincia == 0) {
                System.out.println("Closing the program.");
                break;
            }
            
            switch (choiceQuerequincia) {
                case 1:
                    Problem1Querequincia problem1Querequincia = new Problem1Querequincia();
                    problem1Querequincia.problem1RunQuerequincia();
                    break;
                case 2:
                    Problem2Querequincia problem2Querequincia = new Problem2Querequincia();
                    problem2Querequincia.problem2RunQuerequincia();
                    break;
                case 3:
                    Problem3Querequincia problem3Querequincia = new Problem3Querequincia();
                    problem3Querequincia.problem3RunQuerequincia();
                    break;
                case 4:
                    Problem4Querequincia problem4Querequincia = new Problem4Querequincia();
                    problem4Querequincia.problem4RunQuerequincia();
                    break;
                case 5:
                    Problem5Querequincia problem5Querequincia = new Problem5Querequincia();
                    problem5Querequincia.problem5RunQuerequincia();
                    break;
                case 6:
                    Problem6Querequincia problem6Querequincia = new Problem6Querequincia();
                    problem6Querequincia.problem6RunQuerequincia();
                    break;
                case 7:
                    Problem7Querequincia problem7Querequincia = new Problem7Querequincia();
                    problem7Querequincia.problem7RunQuerequincia();
                    break;
                case 8:
                    Problem8Querequincia problem8Querequincia = new Problem8Querequincia();
                    problem8Querequincia.problem8RunQuerequincia();
                    break;
                default:
                    System.out.println("Invalid Choice. Please Select a Valid Option.");
            }
            
            System.out.println();  //Space Between Operations
        }
        
        sc.close();
    }
    
}
