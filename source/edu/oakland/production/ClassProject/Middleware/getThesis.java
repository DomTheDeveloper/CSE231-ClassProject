BinaryTree tree = new BinaryTree();

	public void getThesis(){
		tree.addNode(student1.getTG(),student1);
		tree.addNode(student2.getTG(),student2);
	 	tree.addNode(student3.getTG(),student3);
		tree.addNode(student4.getTG(),student4);
		tree.addNode(student5.getTG(),student5);
		tree.addNode(student6.getTG(),student6);
		tree.addNode(student7.getTG(),student7);
		tree.addNode(student8.getTG(),student8);
		tree.addNode(student9.getTG(),student9);
		tree.addNode(student10.getTG(),student10);

		tree.preorderTraverseTree(tree.getRootNode());
		
		return tree.getRootNode;

		ArrayList<Node> ltNodes = tree.getLess(90,3.60);
		ArrayList<Student> ltStuds = new ArrayList<Student>();

		for(int i = 0; i < ltNodes.size(); i++) 
		{
			ltStuds.add((Student)ltNodes.get(i).getValue());
		}
		
		return ltStuds;
	}
