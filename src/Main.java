import exceptions.InvalidValueException;
import exceptions.SizeLimitExceededException;

public class Main {
    public static void main(String[] args){
        Fetin fetin = new Fetin();

        try {
            fetin.addProjeto("Projeto1", 70.0);
        } catch (SizeLimitExceededException | InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.addProjeto("Projeto2", 45.0);
        } catch (SizeLimitExceededException | InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.addProjeto("Projeto3", 102.0);
        } catch (SizeLimitExceededException | InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.addProjeto("Projeto3", -2.0);
        } catch (SizeLimitExceededException | InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.addProjeto("Abcdefghijklmnopqrstuvwxyz", 90.0);
        } catch (SizeLimitExceededException | InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.print("Mostrando todos os projetos");
        fetin.mostrarProjetos();
    }
}