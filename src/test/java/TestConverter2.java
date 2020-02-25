package com.company;//Генерация junit тестовых методов по тестовым последовательностям, выдаваемым FSMTest1.0 (tree_tour, Transition_tour)
//Подразумевается, что реакции это строковое возвращаемое значение методами (входными символами).
//Входные воздействия (методы тестируемого класса) и реакции и их коды задаются
//в функциях num2in_fsm_str и num2out_fsm_str (каждая функция пишется отдельно для нового автомата)

import java.io.*;
import java.util.Scanner;

class TestConverter2 {

	/* то же самое
	 * number -- строка с числом-кодом входного воздействия автомата-абстракции класса PhoneLine 
	 * maxtimeout -- максимальное значение таймаута в данном автомате
	 * возвращаемое значение -- строка с именем метода(входного воздействия), закодированного числом number в описании конечного автомата PhoneLine в формате .fsm
	 */
	public static String num2InPhoneLineFsm_str(String number, int maxtimeout) {
		char  num = Integer.toString((Integer.parseInt(number) / (maxtimeout + 1))).charAt(0);
		switch (num) {
		case '0':
			return (String) "onHook()";
		case '1':
			return (String) "offHook()";
		case '2':
			return (String) "invalidNumber()";
		case '3':
			return (String) "validNumber()";

		default:
			return (String) "INVALID INPUT";
		}
	}
	
	
	
	/* number -- строка с числом-кодом выходного символа автомата-абстракции класса PhoneLine
	 * возвращаемое значение -- строка с именем метода(выходной реакции), закодированного числом number в описании конечного автомата PhoneLine в формате .fsm
	 */
	public static String num2OutPhoneLineFsm_str(String number) {
		switch (number.charAt(0)) {
			case '1':
				return (String) "disconnectedLine";
			case '2':
				return (String) "continues";
			case '3':
				return (String) "slowBusyTone";
			case '4':
				return (String) "findConnection";
			case '5':
				return (String) "soundDialTone";
			case '6':
				return (String) "PlayMessage";

			default:
				return (String) "INVALID OUTPUT";
		}
	}




	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("sample2.java");
		FileReader fr = new FileReader("C:\\Users\\salim\\IdeaProjects\\AutomatPhoneLineProject\\src\\test\\java\\tn.txt");
		Scanner scan = new Scanner(fr);

		String TestSequenceStr;
		String[] SplittedTestSequenceArr;
		// ***********************************************************
		int maxtimeoutvalue = 3; // ЗАДАТЬ величину таймаута как параметр в командной строке
		int rowLength = 0;
		int testseqNum = 1;
		int indexOfSlash = 0;
		String[] input;
		String[] output;
		while (scan.hasNextLine()) {
			TestSequenceStr = scan.nextLine(); // считали тестовую строку в формате i/o i/o ....
			rowLength = 0;
			for (char element : TestSequenceStr.toCharArray()) {   // последовательность разбили на символы 
				if (element == '/')			
					rowLength++;				// вычислили длину последовательности
			}
			input = new String[rowLength]; 	// массив входов конечноавтоматной абстракции
			output = new String[rowLength]; 	// массив выходов конечноавтоматной абстракции
			fw.write("@Test\r\npublic void TestCase" + testseqNum + "() {\r\n");
			SplittedTestSequenceArr = TestSequenceStr.split(" ");
			for (int i = 0; i < SplittedTestSequenceArr.length; i++) {
				indexOfSlash = SplittedTestSequenceArr[i].indexOf("/");
				// достать все что от начала строки до "/"
				input[i] = SplittedTestSequenceArr[i].substring(0, indexOfSlash); // заполнили массив входов
				// достать все, что от "/" до конца строки
				output[i] = SplittedTestSequenceArr[i].substring(indexOfSlash + 1, SplittedTestSequenceArr[i].length()); // заполнили  массив выходов
				// вычисление задержки подачи входа
				// и ее реализация в виде Thread.sleep(delay_value_in_sec)
				fw.write("try {Thread.sleep(" + (Integer.parseInt(input[i]) % (maxtimeoutvalue + 1) * 100 + 1)
						+ "); } catch (Exception ex) {}\r\n");
				// подача входного воздействия (вызов соответствующего метода тестируемого класса)
				// ******************************************************* указать имя
				// экземпляра тестируемого класса
				fw.write("assertEquals(pl." + num2InPhoneLineFsm_str(input[i], maxtimeoutvalue) + "," + "\"" + num2OutPhoneLineFsm_str(output[i]) + "\");\r\n");
			}
			
			// сброс реализации в начальное состояние после каждой тестовой
			// последовательности
			//fw.write ("lamp.resetFSM();");
			fw.write("}\r\n\r\n");
			System.out.println("");
			testseqNum++;
			input = output = null;
		}
		fw.close();
		fr.close();
		scan.close();
	}
}