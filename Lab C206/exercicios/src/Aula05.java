import java.lang.reflect.Array;

public class Aula05 {
    public static void main(String[] args) {
        //Declaração de array
        int [] idades = new int[5];
        char [] iniciaisDoNome;
        float [] salario;
        double [] valores;

        //Preenchendo os arrays
        idades = new int[] {1,2,3,4,5};

        //Mostrando valores do array

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //array de referencias
        Funcionario funcionario1= new Funcionario(); //instanciamento
        funcionario1.cpf = "123-456-789-00";
        funcionario1.salario = 1280.6;
        funcionario1.nome = "Calbelaldo";
        Funcionario [] arrayDeFuncionarios = new Funcionario[10]; //array de exemplo
        arrayDeFuncionarios[0] = funcionario1;

        for (int i = 0; i < arrayDeFuncionarios.length; i++) { //adicionando funcionarios
            if(arrayDeFuncionarios[i] == null){
                arrayDeFuncionarios[i]= funcionario1; //colocando o mesmo funfun em tds posições
            }
        }

        for (int i = 0; i < arrayDeFuncionarios.length; i++) { //rodando sem todas posições preenchidas dará erro "null pointer exception"
            //Controle de fluxo para não mostrar valores null
            if (arrayDeFuncionarios[i]!= null)
                arrayDeFuncionarios[i].mostrarInfos();
        }
    }
}
