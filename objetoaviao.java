public class objetoaviao {

    public static void main(String[] args) {
       aviao Aviao1 = new aviao();
       aviao Aviao2 = new aviao();
       aviao Aviao3 = new aviao();
       aviao Aviao4 = new aviao();

       Aviao1.setTipo("Porte pequeno");
       Aviao1.setCor("Camuflado cinza");
       Aviao1.setModelo("F-22");
       Aviao1.setEmpresa("EUA");
       Aviao1.setfuncao("Monitoriamento");
       Aviao1.setDecolar("Sim");
       Aviao1.setAterrisar("Sim\n");
     
       Aviao2.setTipo("Porte grande");
       Aviao2.setCor("Azul");
       Aviao2.setModelo("E195-E2");
       Aviao2.setEmpresa("Gol");
       Aviao2.setfuncao("Transporte de pessoas");
       Aviao2.setDecolar("Sim");
       Aviao2.setAterrisar("Sim\n");

       Aviao3.setTipo("Porte medio");
       Aviao3.setCor("Azul");
       Aviao3.setModelo("E195-E3");
       Aviao3.setEmpresa("Gol");
       Aviao3.setfuncao("Transporte de pessoas");
       Aviao3.setDecolar("Sim");
       Aviao3.setAterrisar("Sim\n");

       Aviao4.setTipo("Porte grande");
       Aviao4.setCor("branco");
       Aviao4.setModelo("Antonov 225 Mriya");
       Aviao4.setEmpresa("xxxxxxxxx");
       Aviao4.setfuncao("Transporte de carga");
       Aviao4.setDecolar("Sim");
       Aviao4.setAterrisar("Sim");
       
        System.out.println("-------- AERONAVE 1-------");
        System.out.println(Aviao1.geTipo());
        System.out.println(Aviao1.getCor());
        System.out.println(Aviao1.getModelo());
        System.out.println(Aviao1.getEmpresa());
        System.out.println(Aviao1.getFuncao());
        System.out.println(Aviao1.getDecolar());
        System.out.println(Aviao1.getAterrisar());
   
       
        System.out.println("-------- AERONAVE 2--------");
        System.out.println(Aviao2.geTipo());
        System.out.println(Aviao2.getCor());
        System.out.println(Aviao2.getModelo());
        System.out.println(Aviao2.getEmpresa());
        System.out.println(Aviao2.getFuncao());
        System.out.println(Aviao2.getDecolar());
        System.out.println(Aviao2.getAterrisar());


        System.out.println("-------- AERONAVE 3--------");
        System.out.println(Aviao3.geTipo());
        System.out.println(Aviao3.getCor());
        System.out.println(Aviao3.getModelo());
        System.out.println(Aviao3.getEmpresa());
        System.out.println(Aviao3.getFuncao());
        System.out.println(Aviao3.getDecolar());
        System.out.println(Aviao3.getAterrisar());


        System.out.println("-------- AERONAVE 4--------");
        System.out.println(Aviao4.geTipo());
        System.out.println(Aviao4.getCor());
        System.out.println(Aviao4.getModelo());
        System.out.println(Aviao4.getEmpresa());
        System.out.println(Aviao4.getFuncao());
        System.out.println(Aviao4.getDecolar());
        System.out.println(Aviao4.getAterrisar());
    }
}


