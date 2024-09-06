public class objetocliente {
    
    public static void main(String[] args) {
        cliente Cliente1 = new cliente();
        cliente Cliente2 = new cliente();

        Cliente1.setNome("Stevan");
        Cliente1.setTelefone("44232322345");
        Cliente1.setEndereco("California, USA");
        Cliente1.setProfissao("Corretor de Imoveis");
        Cliente1.setCPF(99999999999l);
        Cliente1.setRG(22222222l);
        Cliente1.setReclama("Concerteza");
        Cliente1.setCompra("Sim");
        Cliente1.setNegocia("sim");
        Cliente1.setAndar("Anda\n");


        Cliente2.setNome("Noua");
        Cliente2.setTelefone("99999999-99");
        Cliente2.setEndereco("Miami, USA");
        Cliente2.setProfissao("Jogador de Basquete");
        Cliente2.setCPF(88888888888l);
        Cliente2.setRG(33333333l);
        Cliente2.setReclama("sim");
        Cliente2.setCompra("Sim");
        Cliente2.setNegocia("não");
        Cliente2.setAndar("Anda");

        System.out.println("--------Pessoa 1-------");
        System.out.println(Cliente1.getNome());
        System.out.println(Cliente1.getTelefone());
        System.out.println(Cliente1.getEndereco());
        System.out.println(Cliente1.getProfissao());
        System.out.println(Cliente1.getCPF());
        System.out.println(Cliente1.getRG());
        System.out.println(Cliente1.getReclama());
        System.out.println(Cliente1.getCompra());
        System.out.println(Cliente1.getNegocia());
        System.out.println(Cliente1.getAndar());

        System.out.println("--------Pessoa 2--------");
        System.out.println(Cliente2.getNome());
        System.out.println(Cliente2.getTelefone());
        System.out.println(Cliente2.getEndereco());
        System.out.println(Cliente2.getProfissao());
        System.out.println(Cliente2.getCPF());
        System.out.println(Cliente2.getRG());
        System.out.println(Cliente2.getReclama());
        System.out.println(Cliente2.getCompra());
        System.out.println(Cliente2.getNegocia());
        System.out.println(Cliente2.getAndar());
        
        

    }
}

