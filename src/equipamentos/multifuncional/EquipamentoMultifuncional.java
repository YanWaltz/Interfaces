package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    
    @Override
    public void copiar(){ //Polimorfismo, existem mais de uma maneira de copiar
        System.out.println("Copiando via equipamento Multifuncional...");
    }

    @Override
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento Multifuncional...");
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo via equipamento Multifuncional...");
    }
    
}
