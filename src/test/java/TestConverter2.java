package com.company;//��������� junit �������� ������� �� �������� �������������������, ���������� FSMTest1.0 (tree_tour, Transition_tour)
//���������������, ��� ������� ��� ��������� ������������ �������� �������� (�������� ���������).
//������� ����������� (������ ������������ ������) � ������� � �� ���� ��������
//� �������� num2in_fsm_str � num2out_fsm_str (������ ������� ������� �������� ��� ������ ��������)

import java.io.*;
import java.util.Scanner;

class TestConverter2 {

	/* �� �� �����
	 * number -- ������ � ������-����� �������� ����������� ��������-���������� ������ PhoneLine 
	 * maxtimeout -- ������������ �������� �������� � ������ ��������
	 * ������������ �������� -- ������ � ������ ������(�������� �����������), ��������������� ������ number � �������� ��������� �������� PhoneLine � ������� .fsm
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
	
	
	
	/* number -- ������ � ������-����� ��������� ������� ��������-���������� ������ PhoneLine
	 * ������������ �������� -- ������ � ������ ������(�������� �������), ��������������� ������ number � �������� ��������� �������� PhoneLine � ������� .fsm
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
		int maxtimeoutvalue = 3; // ������ �������� �������� ��� �������� � ��������� ������
		int rowLength = 0;
		int testseqNum = 1;
		int indexOfSlash = 0;
		String[] input;
		String[] output;
		while (scan.hasNextLine()) {
			TestSequenceStr = scan.nextLine(); // ������� �������� ������ � ������� i/o i/o ....
			rowLength = 0;
			for (char element : TestSequenceStr.toCharArray()) {   // ������������������ ������� �� ������� 
				if (element == '/')			
					rowLength++;				// ��������� ����� ������������������
			}
			input = new String[rowLength]; 	// ������ ������ ����������������� ����������
			output = new String[rowLength]; 	// ������ ������� ����������������� ����������
			fw.write("@Test\r\npublic void TestCase" + testseqNum + "() {\r\n");
			SplittedTestSequenceArr = TestSequenceStr.split(" ");
			for (int i = 0; i < SplittedTestSequenceArr.length; i++) {
				indexOfSlash = SplittedTestSequenceArr[i].indexOf("/");
				// ������� ��� ��� �� ������ ������ �� "/"
				input[i] = SplittedTestSequenceArr[i].substring(0, indexOfSlash); // ��������� ������ ������
				// ������� ���, ��� �� "/" �� ����� ������
				output[i] = SplittedTestSequenceArr[i].substring(indexOfSlash + 1, SplittedTestSequenceArr[i].length()); // ���������  ������ �������
				// ���������� �������� ������ �����
				// � �� ���������� � ���� Thread.sleep(delay_value_in_sec)
				fw.write("try {Thread.sleep(" + (Integer.parseInt(input[i]) % (maxtimeoutvalue + 1) * 100 + 1)
						+ "); } catch (Exception ex) {}\r\n");
				// ������ �������� ����������� (����� ���������������� ������ ������������ ������)
				// ******************************************************* ������� ���
				// ���������� ������������ ������
				fw.write("assertEquals(pl." + num2InPhoneLineFsm_str(input[i], maxtimeoutvalue) + "," + "\"" + num2OutPhoneLineFsm_str(output[i]) + "\");\r\n");
			}
			
			// ����� ���������� � ��������� ��������� ����� ������ ��������
			// ������������������
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