package imp;

import java.util.HashSet;
import java.util.Set;

public class UtilidadesCadena {

    // Convierte una fecha "dd/mm/yyyy" → 20150209 (entero)
    public static int convertirFecha(String fecha) {
        String[] partes = fecha.split("/");
        return Integer.parseInt(partes[2] + partes[1] + partes[0]);
    }

    // Devuelve qué letras del alfabeto no aparecen en el texto
    public static String letrasNoAparecen(String texto) {
        texto = texto.toLowerCase();
        Set<Character> letras = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letras.add(c);
        }

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            letras.remove(c);
        }

        StringBuilder sb = new StringBuilder("Letras que no aparecen: ");
        for (char c : letras) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }

    // Cuenta cuántas palabras tienen al menos 4 vocales distintas
    public static int contarPalabrasCon4Vocales(String texto) {
        String[] palabras = texto.toLowerCase().split("\\s+");
        int contador = 0;

        for (String palabra : palabras) {
            Set<Character> vocales = new HashSet<>();
            for (char c : palabra.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales.add(c);
                }
            }
            if (vocales.size() >= 4) {
                contador++;
            }
        }

        return contador;
    }
}

