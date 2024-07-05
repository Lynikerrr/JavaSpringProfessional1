package services.services;

import entity.Empregado;

public class SalarioService {

private ImpostoService impostoService;
private PrevidenciaService previdenciaService;

    public SalarioService(ImpostoService impostoService, PrevidenciaService previdenciaService){
        this.impostoService = impostoService;
        this.previdenciaService = previdenciaService;
    }

    public static double salarioLiq(Empregado empregado){
        return empregado.getSalarioBr() - ImpostoService.imposto(empregado.getSalarioBr()) - PrevidenciaService.desconto(empregado.getSalarioBr());
    }

}
