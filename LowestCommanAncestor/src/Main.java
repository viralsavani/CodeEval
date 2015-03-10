
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class TreeNode	
{	
	public int iData;            	
	public double dData;         	
	public TreeNode leftChild;   	
	public TreeNode rightChild;  	
	public void displayNode()    	
	{	
		System.out.println(iData);	
	}	
}

class TreeImpl	
{	
	private TreeNode root;	
	
	public TreeImpl()                 	
	{ root = null; }            	
	
	public void insert(int id, double dd)	
	{	
		TreeNode newNode = new TreeNode();	
		newNode.iData = id;           	
		newNode.dData = dd;	
		if(root==null)                	
			root = newNode;	
		else                          	
		{	
			TreeNode current = root;    	
			TreeNode parent;	
			while(true)                	
			{	
				parent = current;	
				if(id < current.iData) 	
				{	
					current = current.leftChild;	
					if(current == null)	
					{                	
						parent.leftChild = newNode;	
						return;	
					}	
				}  // end if go left	
				else                   	
				{	
					current = current.rightChild;	
					if(current == null)	
					{                	
						parent.rightChild = newNode;	
						return;	
					}	
				}	
			}	
		}	
	}		
	public TreeNode lowestCommonAncestor(int key1, int key2){
		TreeNode current = root;
		
		while(current != null){
			if(current.iData > key1 && current.iData > key2 ){
				current = current.leftChild;
			}else if(current.iData < key1 && current.iData < key2){
				current = current.rightChild;
			}else{
				return current;
			}
		}
		return null;
	}	
}


public class Main {

	public static void main(String[] args) throws Exception {
		TreeImpl theTree = new TreeImpl();	
		theTree.insert(30,30);	
		theTree.insert(8,8);	
		theTree.insert(52,52);	
		theTree.insert(3,3);	
		theTree.insert(20,20);	
		theTree.insert(10, 10);	
		theTree.insert(29, 29);	
		
		

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split("\\s");
            int node1 = Integer.parseInt(splitted[0]);
            int node2 = Integer.parseInt(splitted[1]);
            theTree.lowestCommonAncestor(node1, node2).displayNode();
        }
        buffer.close();
	}
}
