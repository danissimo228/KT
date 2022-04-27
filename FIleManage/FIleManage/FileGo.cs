using System;

namespace FIleManage
{
    public class FileGo
    {
        public static void Play()
        {
            Console.WriteLine("1 - создание типизированного файла");
            Console.WriteLine("2 - вывести в консоль содержимое файла");
            Console.WriteLine("3 - создание типизированного файла с названием сегодняшней даты");
            Console.WriteLine("4 - содержимое файла перевести в большой регистр");
            Console.WriteLine("5 - содержимое файла перевести содержимое файла в нижний регистр");
            Console.WriteLine("6 - поменять подсроку в файле на другую");
            Console.WriteLine("7 - найти подстроку в файле");
            Console.WriteLine("8 - выйти");

            int a = 1;
            while (a != 0)
            {
                Console.WriteLine("Введите номер операции");
                string num = Convert.ToString(Console.ReadLine());
                
                if (num == "1")
                {
                    CommandFile.CreateTypeFile();
                }
                else if (num == "2")
                {
                    CommandFile.ReadFile();
                }
                else if (num == "3")
                {
                    CommandFile.SafeFileData();
                }
                else if (num == "4")
                {
                    CommandFile.HightRegister();
                }
                else if (num == "5")
                {
                    CommandFile.LowerRegister();
                }
                else if (num == "6")
                {
                    CommandFile.ReplaceStr();
                }
                else if (num == "7")
                {
                    CommandFile.FindStr();
                }
                else if (num == "8")
                {
                    Console.WriteLine("Вы вышли");
                    a -= 1;
                }
                else
                {
                    Console.WriteLine("Нету такого варианта ответа");
                }
            }
        }
    }
}