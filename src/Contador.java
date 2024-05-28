import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int pararametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            contar(pararametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int pararametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (pararametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - pararametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imrpimindo o numero " + i);
        }
    }
}
