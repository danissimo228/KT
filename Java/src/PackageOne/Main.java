package PackageOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Main m = new Main();
//        System.out.println(Main.Kt(4, 4));
        Object b = new Employee("misha", 16);
        Employee v = (Employee)b;
        v.PrintInfo();
    }

    public static int Kt(int n, int m) {
        int[][] F = new int[n + 3][m + 3];

        F[2][2] = 1;
        int starti = 2, startj = 2;
        while ((starti < n + 1) || (startj < m + 1))
        {
            if (startj == m + 1)
            {
                starti++;
            }
            else
            {
                startj++;
            }

            int i = starti;
            int j = startj;
            while ((i <= n + 1) && j >= 2)
            {
                F[i][j] = F[i + 1][j - 2] + F[i - 1][j - 2] + F[i - 2][j - 1] + F[i - 2][j + 1];
                i++;
                j--;
            }
        }
        Arrays.stream(F).map(Arrays::toString).forEach(System.out::println);

        System.out.println(" " + "\n");

        return F[n + 1][m + 1];
    }
}
///Необходимо двумерный список F заполнить значениями по этой формуле таким образом,
// чтобы при вычислении нового значения в клетке были вычислены значения в тех четырех клетках,
// которые необходимы для вычисления значения в клетке (i,j).
//Таблицу будем заполнять по диагоналям идущим влево-вниз,
// то есть сначала заполняется значение в левом верхнем углу,
// затем — значения по диагонали длиной 2,
// соседней с угловой клеткой,
// затем по диагонали длиной 3,
// соседней с данной диагональю длиной 2 и т. д.
// Дополнительная каемочка будет иметь размер 2 столбца слева и 2 строки сверху,
// 1 строка снизу и 1 столбец справа.
// Поэтому начальная клетка будет иметь координату (2, 2) и F(2, 2) = 1,
// а конечная клетка будет (n+1, m+1) и необходимо найти F(n+1, m+1).
//В этом решении starti и startj — номера начальной клетки для цикла по диагонали.
// Эта начальная клетка перемещается сначала по верхней стороне прямоугольника,
// поэтому startj увеличивается на 1,
// затем по правой стороне прямоугольника,
// тогда starti увеличивается на 1. Внутренний цикл — это цикл по диагонали,
// в этом цикле i увеличивается, а j — уменьшается,
// что является движением влево-вниз./
