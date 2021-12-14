package POO;

public class Cliente {

    private String nome;
    private String sexo;
    private String endereco;
    private String tel;
    private String idade;
    private String doc;

    public Cliente (String nome, String sexo, String endereco, String i, String idade, String doc)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.tel = i;
        this.idade = idade;
        this.doc = doc;
    }

    public void imprimirInfo()
    {
        System.out.println("\nO cliente "+nome+" (sexo  "+sexo+"), residente na "+endereco+". Telefone de contato "+tel+", idade "+idade+" anos, documento pessoal nº "+doc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

}