package santana.alcebiades.exercicio9;

/**
 *
 * @author alcebiades
 */
public class BinaryTree {

    private int value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree() {
    }

    public BinaryTree(int value) {
        this.value = value;
    }

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int sum() {
        return value + (left != null ? left.sum() : 0) + (right != null ? right.sum() : 0);
    }
}
