public class Produto {
    private int codigo;
    private String nome;
    private String categoria;
    private double preco;
    
    public Produto(int codigo, String nome, String categoria, double preco) {
        setCodigo(codigo);
        this.nome = nome;
        this.categoria = categoria;
        setPreco(preco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código deve ser um valor positivo.");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("Categoria não pode ser vazia.");
        }
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produto produto = (Produto) obj;
        return codigo == produto.codigo && categoria.equals(produto.categoria);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(codigo);
        result = 31 * result + categoria.hashCode();
        return result;
    }

    @Override
    public Produto clone() {
        return new Produto(this.codigo, this.nome, this.categoria, this.preco);
    }
}
