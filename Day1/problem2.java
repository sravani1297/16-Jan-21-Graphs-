/*
https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

**BREADTH FIRST TRAVERSAL**

*/

class Solution
{
    private ArrayList<Integer> r = new ArrayList<Integer>();
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {   boolean printed[] = new boolean[V];
        LinkedList<Integer> q = new LinkedList<Integer>();
        printed[0]=true;
        q.add(0);
        while (q.size() != 0)
        {   
            int c = q.removeFirst();
            r.add(c);
            for(Integer j:adj.get(c))
            {
                if (!printed[j])
                {
                    printed[j] = true;
                    q.add(j);
                }
            }
        }
        return r;
    }
}