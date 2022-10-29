import exceptions.InvalidValueException;
import exceptions.SizeLimitExceededException;

import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;

public class Fetin {
    Map<String, Double> projetos = new HashMap<>();

    public void addProjeto(String nome, double nota) throws SizeLimitExceededException, InvalidValueException {
        if (nome.length() > 20) {
            throw new SizeLimitExceededException("Número de caracteres excedido!");
        } else {
            if (nota >= 0 && nota <= 100) {
                projetos.put(nome, nota);
                System.out.println(nome + " foi adicionado!");
            } else {
                throw new InvalidValueException("Nota inválida");
            }
        }
    }

    public void mostrarProjetos() {
        projetos.forEach((nome, nota) -> {
            System.out.println(" ");
            System.out.println("Nome: " + nome);
            System.out.println("Nota: " + nota);
        });
    }


}
