using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("İsminiz : ");
            string name = Console.ReadLine();
            Console.Write("Soyisminiz : ");
            string surname = Console.ReadLine();

            Console.WriteLine("Merhaba " + name + " " + surname + ". Hoşgeldiniz!");
        }
    }
}