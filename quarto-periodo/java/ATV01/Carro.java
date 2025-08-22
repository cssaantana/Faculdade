package ATV01;//2. Criar uma classe Carro que tenha os atributos modelo, cor, ano, velocidade e métodos para alterar a velocidade, exibir informações do carro e fazer o carro
//acelerar ou frear. Obs: Velocidade inicia em 0. Crie uma instância de um objeto Carro e interaja com ele, testando os métodos de acelerar, frear, exibir as informações e alterar os atributos.

class Carro {
    String modelo;
    String cor;
    Integer ano;
    Integer velocidade;

    public Carro(String modelo, String cor, Integer ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    void infoCarro() {
        System.out.println("Modelo:" + modelo);
        System.out.println("Cor:" + cor);
        System.out.println("Ano:" + ano);
        System.out.println("Velocidade:" + velocidade);
        System.out.println();
    }


    void acelerarCarro() {
        velocidade += 10;
        if (velocidade >= 200) {
            System.out.println("Velocidade maxima! Por favor, diminua a velocidade.");
        } else {
            System.out.println("Acelerando!");
        }
        System.out.println("Velocidade atual: " + velocidade);
        System.out.println();
    }

    void freiarCarro() {
        velocidade -= 10;
        if (velocidade == 0) {
            System.out.println("Carro parado.");
        } else {
            System.out.println("Freiando!");
        }
        System.out.println("Velocidade atual: " + velocidade);
        System.out.println();
    }
}
