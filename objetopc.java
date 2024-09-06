public class objetopc {
    
    public static void main(String[] args) {
    pc PC1 = new pc();

    PC1.setTipo("Gamer portatil");
    PC1.setCor("Preto");
    PC1.setMarca("ASUS");
    PC1.setModelo("ASUS Nuc");
    PC1.setComponentes("Placa mãe, placa de video, processador, armazenamento SSD memoria RAM, fonte, coller, gabinete...");
    PC1.setLigar("Sim");
    PC1.setDesligar("Sim");
    PC1.setAbrirapp("Sim");
    PC1.setRodarapp("Sim");
    PC1.setAcenderled("Obrigatório");

    System.out.println("-------- PC -------");
    System.out.println(PC1.geTipo());
    System.out.println(PC1.getCor());
    System.out.println(PC1.getMarca());
    System.out.println(PC1.getModelo());
    System.out.print(PC1.getComponentes());
    System.out.println(PC1.getLigar());
    System.out.println(PC1.getDesligar());
    System.out.println(PC1.getAbrirapp());
    System.out.println(PC1.getRodarapp());
    System.out.println(PC1.getAcenderled());

    }
}

