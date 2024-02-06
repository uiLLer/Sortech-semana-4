public class AlterarListagemClienteIdade {
    public static void main(String[] args) {
        String fu = "Fulano";
        String si = "Sicrano";
        int nascFu = 1980;
        int nascSi = 2000;
        int anoAtual = 2024;


        System.out.println(">>> Listagem de Clientes");


        System.out.println("_".repeat(50));
        System.out.println("Nome: " + fu);
        System.out.println("Data de Nascimento: " + nascFu);
        System.out.println("idade: " + (anoAtual - nascFu));
        if ((anoAtual - nascFu) <= 17 ) {
            System.out.println("Característica etária: ADOLESCENTE");
        } else if ((anoAtual - nascFu) <= 29 && (anoAtual - nascFu) >= 18 ){
            System.out.println("Característica etária: JOVEM");
        } else if ((anoAtual - nascFu) <= 59 && (anoAtual - nascFu) >= 30 ){
            System.out.println("Característica etária: ADULTO");
        } else if ((anoAtual - nascFu) >= 60 ){
            System.out.println("Característica etária: IDOSO");
        }


        System.out.println("_".repeat(50));
        System.out.println("Nome: " + si);
        System.out.println("Data de Nascimento: " + nascSi);
        System.out.println("idade: " + (anoAtual - nascSi));
        if ((anoAtual - nascSi) <= 17 ) {
            System.out.println("Característica etária: ADOLESCENTE");
        } else if ((anoAtual - nascSi) <= 29 && (anoAtual - nascSi) >= 18 ){
            System.out.println("Característica etária: JOVEM");
        } else if ((anoAtual - nascSi) <= 59 && (anoAtual - nascSi) >= 30 ){
            System.out.println("Característica etária: ADULTO");
        } else if ((anoAtual - nascSi) >= 60 ){
            System.out.println("Característica etária: IDOSO");
        }

    }
}
