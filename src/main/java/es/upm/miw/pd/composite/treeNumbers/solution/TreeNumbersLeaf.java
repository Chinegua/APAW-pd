package es.upm.miw.pd.composite.treeNumbers.solution;

public class TreeNumbersLeaf extends TreeNumbers {
    private int valor;

    public TreeNumbersLeaf(int valor) {
        this.valor = valor;
    }

    @Override
    public void add(TreeNumbers treeNumbers) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remove(TreeNumbers treeNumbers) {
    }

    @Override
    public int sum() {
        return this.valor;
    }

    @Override
    public int higher() {
        return this.valor;
    }

    @Override
    public int numberOfTreeNumbers() {
        return 1;
    }
    
    @Override
    public String toString() {
        return "Hoja[" + valor + "]";
    }

}
