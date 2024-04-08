package Negocio;

import Modelagem.Atributos;

public class ArvoreBin {
	    Atributos root;

	    public ArvoreBin() {
	        this.root = null;
	    }

	    // Método para inserir um nó na árvore
	    public void insert(int data) {
	        root = insertRec(root, data);
	    }

	    private Atributos insertRec(Atributos root, int data) {
	        if (root == null) {
	            root = new Atributos(data);
	            return root;
	        }

	        if (data < root.data)
	            root.left = insertRec(root.left, data);
	        else if (data > root.data)
	            root.right = insertRec(root.right, data);

	        return root;
	    }

		public String preorder() {
			// TODO Auto-generated method stub
			return null;
		}
}