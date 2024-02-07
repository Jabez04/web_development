import java.util.*;

class Graph {
    int v;
    HashMap<Integer, List<Integer>> adjacencyList=new HashMap<>();

    Graph(int v) {
        this.v=v;
    }
    void addedge(){
        int i;
        for(i=0;i<v;i++){
            adjacencyList.put(i,new LinkedList<>());
        }
        
    }
    void addelement(int s,int r){
        adjacencyList.get(s).add(r);
        System.out.println(adjacencyList);
    }
    
}
public class Main{
    public static void main(String args[]){
        Graph ob = new Graph(5);
        ob.addedge();
        ob.addelement(1,2);
    }
}


