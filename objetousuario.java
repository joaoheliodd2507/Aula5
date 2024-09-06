public class objetousuario {
    public static void main(String[] args) {

        usuario Usuario1 = new usuario();

        Usuario1.setID("03");
        Usuario1.setNome("Roberto");
        Usuario1.setPassword("********");
        Usuario1.setPermissao("Ser utilizador do app");
        Usuario1.setUsuario("Roberto_Ramos1");
        Usuario1.setTelefone("99999999999");
        Usuario1.setAcessa("sim");
        Usuario1.setLoga("Sim");
        Usuario1.setDesLoga("não");
        Usuario1.setUtilizaapp("Com frequencia\n");

        System.out.println("--------Pessoa 1-------");
        System.out.println(Usuario1.getID());
        System.out.println(Usuario1.getNome());
        System.out.println(Usuario1.getPassword());
        System.out.println(Usuario1.getPermissao());
        System.out.println(Usuario1.getUsuario());
        System.out.println(Usuario1.getTelefone());
        System.out.println(Usuario1.getAcessa());
        System.out.println(Usuario1.getLoga());
        System.out.println(Usuario1.getDesLoga());
        System.out.println(Usuario1.getUtilizaapp());    

    }
}

