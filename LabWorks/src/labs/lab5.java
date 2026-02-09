package labs.lab5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        maxword lab51 = new maxword();
        System.out.println("Самое длинное слово: " + lab51.OutWord(new String()));
        System.out.println("===================");
        System.out.println("Задание 2");
        palindrom lab52 = new palindrom();
        System.out.println("Является ли слово палиндромом: " + lab52.OutResult(new String()));
        System.out.println("===================");
        System.out.println("Задание 3");
        censore lab53 = new censore();
        System.out.println("Преобразованный текст: " +lab53.OutText(new String(), "[вырезано цензурой]"));
        System.out.println("===================");
        System.out.println("Задание 4");
        repeatings lab54 = new repeatings();
        System.out.println("Количество вхождений: " + lab54.OutResult(new String(), new String()));
        System.out.println("===================");
        System.out.println("Задание 5");
        reverse lab55 = new reverse();
        System.out.println("Преобразованный текст: " + lab55.OutText(new String()));
        System.out.println("===================");

    }

    public static class maxword {
        public String OutWord(String text) {
            Text text1 = new Text();
            text=text1.Enter();
            int tl = text.length();
            int l = 0;
            int j = 0;
            int maxl = 1;
            char[] textchar= text.toCharArray();
            char[] word= new char[' '];
            char[] maxword1= new char[' '];
            for (int i = 0; i < tl-1; i++) {
                if (textchar[i] == ',' || textchar[i] == '.' || textchar[i] == ':' || textchar[i] == ';' || textchar[i] == '-' || textchar[i] == ' ') {
                    l=0;
                    j=0;
                    word= new char[' '];
                } else {
                    word[j]=textchar[i];
                    l = l + 1;
                    j=j+1;
                }
                if (maxl < l) {
                    maxword1=word;
                    maxl = l;
                }
            }
            String str = String.valueOf(maxword1);
            return str.replaceAll("\\p{Cntrl}", "");
        }
    }

    public static class palindrom {
        public boolean OutResult(String text) {
            Word text1 = new Word();
            text=text1.Enter();
            text=text.toLowerCase();
            boolean res = true;
            int tl = text.length();
            int l = 0;
            char[] textchar= text.toCharArray();
            for (int i = 0; i < tl; i++) {
                if (textchar[i] == textchar[tl-1-i]) {
                } else {
                    l = l + 1;
                }
            }
            if (l != 0) {
                res=false;
            } else {
                res=true;
            }
            return res;
        }
    }

    public static class censore {
        public String OutText(String text, String cens) {
            Text text1 = new Text();
            text=text1.Enter();
            int tl = text.length();
            text = text.replaceAll("бяка", cens);
            return text;
        }
    }

    public static class repeatings {
        public int OutResult(String text1, String text2) {
            Text text = new Text();
            text1=text.Enter();
            int tl1 = text1.length();
            Text text22 = new Text();
            text2=text22.Enter();
            int tl2 = text2.length();
            int l = 0;
            int k = 0;
            int res = 0;
            char[] textchar1= text1.toCharArray();
            char[] textchar2= text2.toCharArray();
            for (int i = 0; i < tl1-1; i++) {
                if (textchar1[i] == textchar2[0]) {
                    for (int j = 0; j < tl2-1; j++) {
                        if (textchar1[i+k] == textchar2[j]) {
                            l = (l + 1);
                            k = k + 1;
                        }else {
                            l=0;
                            k=0;
                        }
                    }
                    if (tl2 > 1) {
                        res = l / (tl2 - 1) + res;
                    } else {
                        res = l / (tl2) + res;
                    }
                }else {
                    l=0;
                    k=0;
                }
            }
            return res;
        }
    }

    public static class reverse {
        public String OutText(String text) {
            Text text1 = new Text();
            text=text1.Enter();
            text = new StringBuilder(text).reverse().toString();
            int tl= text.length();
            int l = 0;
            int k = 0;
            int i = 0;
            char[] textchar = text.toCharArray();
            char[] textchar1 = new char[tl];
            while (i < tl) {
                if ((textchar[i] == ' ') || (textchar[i] == ',') || (textchar[i] == '.') || (textchar[i] == ':') || (textchar[i] == ';') || (textchar[i] == '-')) {
                    k=i+1;
                    textchar1[i] = textchar[i];
                } else {
                    int j = i;
                    while(j < tl) {
                        if ( (textchar[j] == ' ') || (textchar[j] == ',') || (textchar[j] == '.') || (textchar[j] == ':') || (textchar[j] == ';') || (textchar[j] == '-')) {
                            j=tl;
                        } else {
                            l = l+1;
                            j=j+1;
                        }
                    }
                    textchar1[i] = textchar[l+k-1];
                    l=0;
                }
                i=i+1;
            }
            String str = String.valueOf(textchar1);
            return text;
        }
    }

    public static class Text {
        public String Enter() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст:");
            String text;
            text=scanner.nextLine();
            return text;
        }
    }

    public static class Word {
        public String Enter() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово:");
            String word;
            word=scanner.next();
            return word;
        }
    }
}
