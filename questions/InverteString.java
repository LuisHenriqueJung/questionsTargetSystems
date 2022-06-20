import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = null;

        System.out.print("Digite uma palavra: ");
        entrada  = sc.next();

        char[] ch = entrada.toCharArray();
        int primeira = 0, ultima = ch.length-1;
        char temp;

        while(ultima > primeira){
            temp = ch[primeira];
            ch[primeira] = ch[ultima];
            ch[ultima] = temp;
            ultima--;
            primeira++;
        }
        entrada = new String(ch);
        System.out.println("A palavra invertida fica assim: " + entrada);
    }
}
