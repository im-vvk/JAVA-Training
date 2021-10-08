package com.seemantshekhar;

import java.util.Iterator;
import java.util.Stack;

public class TreeIterator implements Iterator<Node> {
    Node nextVal;
    Stack<NodeWithStatus> stack;


    public TreeIterator(Node root){
        stack = new Stack<>();
        if(root != null){
            stack.push(new NodeWithStatus(root));
            next();

        }


    }


    @Override
    public boolean hasNext() {
        return nextVal != null;
    }

    @Override
    public Node next() {
        //store value to be returned
        Node current = nextVal;

        //calculate next value and store for future
        nextVal = null;

        while (!stack.isEmpty()){
            NodeWithStatus nodeWithStatus = stack.peek();
            if(nodeWithStatus.status == -1){

                //preorder area
                nodeWithStatus.status++;
//                nextVal = nodeWithStatus.node;
//                break;
            }

            if(nodeWithStatus.status == nodeWithStatus.node.children.size()){

                //Postorder area
                NodeWithStatus val = stack.pop();

                nextVal = val.node;
                break;
            }else{
                stack.push(new NodeWithStatus(nodeWithStatus.node.children.get(nodeWithStatus.status++)));
            }

        }

        return current;
    }
}
