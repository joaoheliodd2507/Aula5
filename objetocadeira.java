public class objetocadeira {
    
    public static void main(String[] args) {
    
        cadeira Cadeira1 = new cadeira();

        Cadeira1.setTipo("Movel");
        Cadeira1.setCor("Azul");
        Cadeira1.setMarca("Maxracer");
        Cadeira1.setModelo("Ergonomico");
        Cadeira1.setAndarFrente("Sim");
        Cadeira1.setAndarTras("Sim");
        Cadeira1.setTravarEncosto("Sim");
        Cadeira1.setDestravarEncosto("Sim");
        Cadeira1.setAjustaAltura("Sim");

        System.out.println("-------- Cadeira-------");
        System.out.println(Cadeira1.geTipo());
        System.out.println(Cadeira1.getCor());
        System.out.println(Cadeira1.getMarca());
        System.out.println(Cadeira1.getModelo());
        System.out.println(Cadeira1.getAndarFrente());
        System.out.println(Cadeira1.getAndarTras());
        System.out.println(Cadeira1.getTravarEncosto());
        System.out.println(Cadeira1.getDestravarEncosto());
        System.out.println(Cadeira1.getAjustaAltura());
    
       
    }
}

