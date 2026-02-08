package labs.lab4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Часть 1");
        System.out.println("===================");
        System.out.println("Задание 1");
        System.out.println("Нечетные числа от 1 до 99:");
        NotDivide t1 = new NotDivide();
        t1.out();
        System.out.println("===================");
        System.out.println("Задание 2");
        DivideElements t2 = new DivideElements();
        t2.out();
        System.out.println("===================");
        System.out.println("Задание 3");
        CheckEquality t3 = new CheckEquality();
        System.out.println("Сумма второго и первого числа равна третьему число?: " + t3.OutResult(1,1,1));
        System.out.println("===================");
        System.out.println("Задание 4");
        CheckLess t4 = new CheckLess();
        System.out.println("Второе число больше первого числа, а третье число больше второго числа?: " + t4.OutResult(1,1,1));
        System.out.println("===================");
        System.out.println("Задание 5");
        FindElements t5 = new FindElements();
        System.out.println("Присутствует на первом или последнем элементе массива 1 или 3?: " + t5.OutResult(new int[]{1, 1, 1}));
        System.out.println("===================");
        System.out.println("Задание 6");
        ContainsMassiv t6 = new ContainsMassiv();
        System.out.println("Присутствует ли в массиве 1 или 3?: " + t6.OutResult(new int[]{}));
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("Часть 2");
        System.out.println("===================");
        System.out.println("Задание 1");
        SortMassiv t7 = new SortMassiv();
        t7.OutSort(new int[]{});
        System.out.println("===================");
        System.out.println("Задание 2");
        EnterMassiv t8 = new EnterMassiv();
        System.out.println("Result: " + Arrays.toString(t8.OutMassiv()));
        System.out.println("===================");
        System.out.println("Задание 3");
        ChangeElements t9 = new ChangeElements();
        System.out.println("Преобразованный массив");
        System.out.println("Array2: " + Arrays.toString(t9.OutMassiv(new int[]{})));
        System.out.println("===================");
        System.out.println("Задание 4");
        UniqueNum t10 = new UniqueNum();
        System.out.println("Уникальное число: " + t10.OutNum(new int[]{}));
    }

    public static class NotDivide {
        public void out() {
            for (int i = 1; i < 99; i++) {
                if ((i) % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    public static class DivideElements {
        public void out() {
            System.out.println("Делятся на 3: ");
            for (int i = 1; i < 101; i++) {
                if (i % 3 == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("");
            System.out.println("Делятся на 5: ");
            for (int i = 0; i < 101; i++) {
                if (i % 5 == 0) {
                System.out.print(" " + i);
                }
            }
            System.out.println("");
            System.out.println("Делятся на 15: ");
            for (int i = 0; i < 101; i++) {
                if (i % 15 == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("");
        }
    }

    public static class CheckEquality {
        public boolean OutResult(int x, int y, int z) {
            System.out.println("Введите первое число " + x);
            System.out.println("Введите второе число " + y);
            System.out.println("Введите третье число " + z);
            boolean res = true;
            if (x + y != z) {
                res=false;
            }
            return res;
        }
    }

    public static class CheckLess {
        public boolean OutResult(int x, int y, int z) {
            System.out.println("Введите первое число " + x);
            System.out.println("Введите второе число " + y);
            System.out.println("Введите третье число " + z);
            boolean res = false;
            if (x < y && y < z) {
                res=true;
            }
            return res;
        }
    }

    public static class FindElements {
        public boolean OutResult(int[] array) {
            massiv array1 = new massiv();
            array = array1.in();
            boolean res = true;
            if (array.length >= 2) {
                if (array[0] == 3 || array[array.length - 1] == 3) {
                } else {
                    res = false;
                }
            } else {
                System.out.println("Длина массива должна быть больше или равна двум");
            }
            return res;
        }
    }

    public static class ContainsMassiv {
        public boolean OutResult(int[] array) {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            boolean res = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 3 || array[i] == 1) {
                    j = 1;
                }
            }
            if (j == 0) {
                res=false;
            }
            return res;
        }
    }

    public static class SortMassiv {
        public void OutSort(int[] array) {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                } else {
                    j = j + 1;
                }
            }
            System.out.println("Массив отсортирован по возрастанию?");
            if (j == 0) {
                System.out.println("Результат: ok");
            } else {
                System.out.println("Результат:please try again (массив не отсортирован)");
            }
        }
    }

    public static class EnterMassiv {
        public int[] OutMassiv() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Array length ");
            int x = scanner.nextInt();
            int[] ints = new int[x];
            System.out.println("Numbers of array: ");
            for (int i = 0; i < x; i++) {
                ints[i] = scanner.nextInt();
            }
            return ints;
        }
    }

    public static class ChangeElements {
        public int[] OutMassiv(int[] array) {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            System.out.println("Исходный массив");
            System.out.println("array1=" + Arrays.toString(array));
            j = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = j;
            return array;
        }
    }

    public static class UniqueNum {
        public int OutNum(int[] array) {
            massiv array1 = new massiv();
            array = array1.in();
            Integer res = null, k = null;
            int z = 0;
            for (int i = 0; i < (array.length); i++) {
                if (z != 1) {
                    z = 0;
                    for (int j = 0; j < (array.length); j++) {
                        if (array[j] == array[i]) {
                            z = z + 1;
                        } else {
                            res = array[i];
                        }
                        k = res;
                    }
                }
            }
            if (z == 1) {
            } else {
                System.out.println("В массиве нет уникального числа");
            }
            return k;
        }
    }

    public static class massiv {
        public int[] in() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Массив: " + Arrays.toString(array));
            return array;
        }
    }

}
