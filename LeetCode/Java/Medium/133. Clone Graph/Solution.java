class Solution {
    
    HashMap<Node,Node> map=new HashMap<>();
    
    public Node cloneGraph(Node node) 
    {
       if(node==null)
       {return node;}
       if(map.containsKey(node))
       {return map.get(node);}
       Node newnode=new Node(node.val,new ArrayList<>());
       map.put(node,newnode);
       for(Node neighbours: node.neighbors)
       {
          newnode.neighbors.add(cloneGraph(neighbours));
       }
       return newnode;

    }
    
}