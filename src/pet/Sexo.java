// No arquivo pet/Sexo.java
package src.pet;

public enum Sexo {
    MACHO,
    FEMEA; // Ponto e vírgula aqui para podermos adicionar o método

    /**
     * Este é o nosso "tradutor" inteligente.
     * Ele recebe o texto do utilizador e tenta encontrar o enum correspondente.
     * @param texto A String digitada pelo utilizador.
     * @return O enum Sexo correspondente, ou null se não for encontrado.
     */
    public static Sexo fromString(String texto) {
        // Converte o texto para minúsculas para facilitar a comparação
        String textoLimpo = texto.toLowerCase();

        // Verifica todas as " alcunhas" para MACHO
        if (textoLimpo.equals("macho") || textoLimpo.equals("m") || textoLimpo.equals("masculino")) {
            return MACHO;
        }

        // Verifica todas as "alcunhas" para FEMEA
        if (textoLimpo.equals("femea") || textoLimpo.equals("fêmea") || textoLimpo.equals("f")) {
            return FEMEA;
        }

        // Se não corresponder a nada, retorna null
        return null;
    }
}