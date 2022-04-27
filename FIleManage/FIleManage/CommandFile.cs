using System;
using System.IO;
using System.Security.Cryptography;
using System.Text.RegularExpressions;

namespace FIleManage
{
    public class CommandFile
    {

        public static void CreateTypeFile()
        {
            Console.WriteLine("Название файла");
            string name = Console.ReadLine();
            
            Console.WriteLine("Тип файла");
            string type = Console.ReadLine();

            string fileName = $"{Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory)}/{name}.{type}";

            try
            {
                if (File.Exists(fileName) == false)
                {
                    File.Create(fileName);
                    Console.WriteLine("Файл создан");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Такой файл уже есть");
            }
        }

        public static void ReadFile()
        {
            Console.WriteLine("Введите путь к файлу");
            string namefile = Console.ReadLine();

            try
            {
                using (var sr = new StreamReader(namefile))
                {
                    Console.WriteLine(sr.ReadToEnd());
                }
            }
            catch (IOException e)
            {
                Console.WriteLine("Не удалось прочитать файл:");
                Console.WriteLine(e.Message);
            }
        }

        public static void SafeFileData()
        {
            Console.WriteLine("Тип файла");
            string type = Console.ReadLine();

            string fileName = $"{Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory)}/{DateTime.Today}.{type}";

            if (File.Exists(fileName) == false)
            {
                File.Create(fileName);
                Console.WriteLine("Файл создан");
            }
            else
            {
                Console.WriteLine("Такой файл уже есть");
            }
        }

        public static void HightRegister()
        {
            Console.WriteLine("Введите путь к файлу");
            string namefile = Console.ReadLine();

            try
            {
                if (File.Exists(namefile))
                {
                    string text = File.ReadAllText(namefile);
                    File.WriteAllText(namefile, text.ToUpper());
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Такого файла не существует");
            }

        }
        
        public static void LowerRegister()
        {
            Console.WriteLine("Введите путь к файлу");
            string namefile = Console.ReadLine();

            try
            {
                if (File.Exists(namefile))
                {
                    string text = File.ReadAllText(namefile);
                    File.WriteAllText(namefile, text.ToLower());
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Такого файла не существует");
            }
        }
        
        public static void ReplaceStr()
        {
            Console.WriteLine("Введите путь к файлу");
            string namefile = Console.ReadLine();
            
            Console.WriteLine("Слово");
            string word = Console.ReadLine();
            
            Console.WriteLine("На какое заменить");
            string word_replace = Console.ReadLine();

            try
            {
                if (File.Exists(namefile))
                {
                    string text = File.ReadAllText(namefile);
                    text = text.Replace(word, word_replace);
                    File.WriteAllText(namefile, text);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Такого файла не существует");
            }
        }

        public static void FindStr()
        {
            Console.WriteLine("Введите путь к файлу");
            string namefile = Console.ReadLine();
            
            Console.WriteLine("Слово");
            string word = Console.ReadLine();
            
            try
            {
                if (File.Exists(namefile))
                {
                    string text = File.ReadAllText(namefile);
                    
                    if (Regex.IsMatch(text, word))
                    {
                        Console.WriteLine("Да");
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("нету");
            }
        }

    }
}