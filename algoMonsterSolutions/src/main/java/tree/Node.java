package tree;

public class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert (int value) {
        Node currentRoot = this;
        boolean inserted = false;

        while (!inserted) {
            if(currentRoot.data >= value) {
                if (left == null) {
                    this.left = new Node(value);
                    inserted = true;
                }
                currentRoot = currentRoot.left;
            } else {
                if (right == null) {
                    this.right = new Node(value);
                    inserted = true;
                }
                currentRoot = currentRoot.right;
            }
        }
    }


    public void insertUsingRecursion (int value) {
        if (this.data >= value) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                left.insertUsingRecursion(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                right.insertUsingRecursion(value);
            }
        }
    }

    public boolean find(int value){
        if (this.data == value) {
            return true;
        }

        if (this.data < value) {
            if (right == null) return false;
            else return right.find(value);
        } else if (this.data > value) {
            if (left == null) {
            return false;
            } else
            return left.find(value);
        }

        return false;
    }

    public void printInOrder() {
        if (this.left != null) {
            left.printInOrder();
        }
        System.out.println(data);

        if (this.right != null) {
            right.printInOrder();
        }

    }

    public void printPreOrder(){ // root gets printed first
        System.out.println(this.data);

        if (this.left != null) {
            left.printPreOrder();
        }

        if (this.right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() { //root gets printed last
        if(this.left != null) {
            left.printPostOrder();
        }
        if (this.right != null) {
            right.printPostOrder();
        }
        System.out.println(this.data);
    }
}
