/*
https://www.pepcoding.com/resources/online-java-foundation/graphs/has-path-official/ojquestion

** HAS PATH **

*/

import java.io.*;
import java.util.*;

public class Main {
    static class Edge
	{
        // Assigning values to src,nbr,wt
    }
    public static void main(String[] args) throws Exception {
        // Reading input from the user
        // write your code here
        boolean visited[] = new boolean[vtces];
        boolean res=dfsOfGraph(src,dest,graph,visited);
        System.out.println(res);
    }
    public static boolean dfsOfGraph(int src,int dest,ArrayList < Edge > [] graph,boolean[] visited)
    {
        if (src==dest)
            return true;
        visited[src] = true;
        boolean result = false;
        for(Edge e: graph[src])
        {
            if(!visited[e.nbr])
                result= dfsOfGraph(e.nbr,dest,graph,visited);
            if (result)
                return result;
        }
        return false;
    }
}