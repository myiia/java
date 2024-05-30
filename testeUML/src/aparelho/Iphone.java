package aparelho;

import funcionalidades.ReprodutorMusical;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import funcionalidades.device;

public class Iphone {

    public static void main(String[] args) {


        device myDevice = new device();

        myDevice.tocar();
        myDevice.pausar();
        myDevice.selecionarMusica("Selecione uma musica");

        myDevice.ligar("digite um numero");
        myDevice.atender();
        myDevice.iniciarCorreioVoz();

        myDevice.exibirPagina("insira a url");
        myDevice.adicionarNovaAba();
        myDevice.atualizarPagina();
    }
}

