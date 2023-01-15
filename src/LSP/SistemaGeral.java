package LSP;

interface SistemaPegaDados{}

interface  SistemaIncluiDados{}

public class SistemaGeral implements  SistemaIncluiDados,SistemaPegaDados{
}
class AplicativoPaciente{
    private SistemaPegaDados pegaDados;

    public AplicativoPaciente(SistemaPegaDados sistemaPegaDados){
        this.pegaDados = sistemaPegaDados;
    }
}

class SistemaHospital{
    private SistemaIncluiDados incluiDados;
    public SistemaHospital(SistemaIncluiDados sistemaIncluiDados){
        this.incluiDados = sistemaIncluiDados;
    }
}

class ParqueTecnoligiaMedico{
    public static void main(String[] args) {
        SistemaGeral sistemaGeral = new SistemaGeral();

        new AplicativoPaciente(sistemaGeral);
        new SistemaHospital(sistemaGeral);
    }
}