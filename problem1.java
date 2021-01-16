class Solution
{
    private ArrayList<Integer> r = new ArrayList<Integer>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {   boolean printed[] = new boolean[V];
        DFS(0,adj,printed);
        return r;
    }
    public void DFS(int v, ArrayList<ArrayList<Integer>> adj,boolean[] printed)
    {   
        printed[v] = true;
        r.add(v);
        for(Integer i:adj.get(v))
        {
            if (!printed[i])
                DFS(i,adj,printed);
        }
    }
}