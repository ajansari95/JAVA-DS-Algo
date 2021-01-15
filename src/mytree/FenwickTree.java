package mytree;

public class FenwickTree {
    public void updateBinaryIndexedTree(int[] binaryIndexedTree, int val, int index){
        while(index< binaryIndexedTree.length){
            binaryIndexedTree[index] += val;
            index = getNext(index);
        }
    }
    /**
     * To get next
     * 1) 2's complement of get minus of index
     * 2) AND this with index
     * 3) Add it to index
     */
    private int getNext(int index){
        return index +(index & -index);
    }

    public int[] createTree(int[] input){
        int[] binaryIndexedTree = new int[input.length+1];
        for(int i=1;i<= input.length;i++){
            updateBinaryIndexedTree(binaryIndexedTree, input[i-1],i);
        }
        return binaryIndexedTree;
    }
    /**
     * To get parent
     * 1) 2's complement to get minus of index
     * 2) AND this with index
     * 3) Subtract that from index
     */

    private int getParent(int index){
        return index - (index & -index);
    }
    public int getSum(int[] binaryIndexedTree, int index){
        index = index +1;
        int sum =0;
        while(index>0){
            sum +=binaryIndexedTree[index];
            index = getParent(index);
        }
        return sum;
    }
    public static void updateTree(int[] binaryIndexedTree,int n, int index, int val ){
        while (index<=n){
            binaryIndexedTree[index] +=val;
            index += index &(-index);

        }
    }


    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        FenwickTree ft = new FenwickTree();
        int[] binaryIndexedTree = ft.createTree(input);
        for(int i=0;i<input.length;i++){
            System.out.println(ft.getSum(binaryIndexedTree, i));
        }
        System.out.println("abc");

    }
}
