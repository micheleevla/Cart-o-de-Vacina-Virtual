class Vacina1 {
    private String nomePaciente;
    private String cpf;
    private String dataNascimento;
    private String nomeVacina;
    private int dose;
    private String dataVacinacao;
    private String dataProximaDose;
    private String lote;
    private String fabricante;
    private String local;

       public Vacina1(String nomePaciente, String cpf, String dataNascimento, String nomeVacina, int dose, String dataVacinacao, String dataProximaDose, String lote, String fabricante, String local) {
        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nomeVacina = nomeVacina;
        this.dose = dose;
        this.dataVacinacao = dataVacinacao;
        this.dataProximaDose = dataProximaDose;
        this.lote = lote;
        this.fabricante = fabricante;
        this.local = local;
    }

   
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getDataProximaDose() {
        return dataProximaDose;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(String dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Nome do Paciente = " + nomePaciente + 
                ", \nCPF = " + cpf + 
                ", \nData de Nascimento = " + dataNascimento + 
                ", \nVacina = " + nomeVacina + 
                ", \nDose = " + dose +
                ", \nData Vacinacao = " + dataVacinacao + 
                ", \nData Proxima Dose = " + dataProximaDose + 
                ", \nLote = " + lote + 
                ", \nFabricante = " + fabricante + 
                ", \nLocal = " + local 
                ;
    }
}