package bd2.edu.univas.si.palestrante.view;

import java.util.Date;

import bd2.edu.univas.si.palestrante.model.Palestrante;
import bd2.edu.univas.si.palestrante.service.PalestranteService;

public class PalestranteView {
    PalestranteService palestranteService = new PalestranteService();
    
    public void criarPalestrante() {
        Palestrante palestrante= new Palestrante();
        palestrante.setNome("Daniela");
        palestrante.setTema("Planos Cartesianos");
        palestrante.setData(15/05/2020);
        palestrante.setHora("15:00");
        palestrante.setRegistro(2);
            
        palestranteService.save(palestrante);
    }

}
