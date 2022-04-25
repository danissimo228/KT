using System;
using System.IO;

namespace KT
{
    public class Calculate
    {

        public static int Сalculation()
        {
            int first = Convert.ToInt32(Console.ReadLine());
            string operation = Convert.ToString(Console.ReadLine());
            int second = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("чтобы очистить переменную введите 'clear', чтобы запустить калькулятор, нажмите tab");
            
            string proverka = Convert.ToString(Console.ReadLine());

            if (proverka == "clear")
            {
                Console.WriteLine("Введите переменные и оператор");
                first = Convert.ToInt32(Console.ReadLine());
                operation = Convert.ToString(Console.ReadLine());
                second = Convert.ToInt32(Console.ReadLine());
            }

            int a;
            string filePath = "/Users/daniilnishpal/Desktop/KT/KT/history.txt";
            DateTime curDate = DateTime.Now;
            
            if (File.Exists(filePath) == false)
            {
                FileStream fileStream = File.Open(filePath, FileMode.Create);
            }
            FileStream filestream = File.Open(filePath, FileMode.Append);

            StreamWriter output = new StreamWriter(filestream);

            switch (operation)
                {
                    case "+":
                        a = first + second;
                        Console.WriteLine(first + second);
                        string text = $"time: {curDate},  result: {a}";
                        output.WriteLine(text);
                        output.Close();
                        break;
                    case "-":
                        a = first - second;
                        Console.WriteLine(first - second);

                        text = $"time: {curDate},  result: {a}";
                        output.WriteLine(text);
                        output.Close();

                        break;
                    case "*":
                        a = first * second;
                        Console.WriteLine(first * second);

                        text = $"time: {curDate},  result: {a}";
                        output.WriteLine(text);
                        output.Close();
                        break;
                    case "/":
                        if (second == 0)
                        {
                            Console.WriteLine("Error zero!!");
                            text = $"time: {curDate},  Error zero!!";
                            output.WriteLine(text);
                            output.Close();
                        }
                        else
                        {
                            float b = first / second;
                            Console.WriteLine(first / second);

                            text = $"time: {curDate},  result: {b}";
                            output.WriteLine(text);
                            output.Close();
                        }
                        break;
                    case "%":
                        a = first % second;
                        Console.WriteLine(first % second);

                        text = $"time: {curDate},  result: {a}";
                        output.WriteLine(text);
                        output.Close();
                        break;
                }
            return 0;
        }

        public static void KorenChisla(int c)
        {
            Console.WriteLine(Math.Sqrt(c));
        }
    }
}