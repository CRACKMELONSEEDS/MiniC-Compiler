package io;

public class Buffer {
	
	private static char end = (char)-1;//�ڱ����
	
	private char[] array = new char[4096];
	
	private int lexemeBegin;//��ָ��ָ��ǰ���صĿ�ʼ��
	private int forward;//��ָ��һֱ��ǰɨ�裬ֱ������ĳ��ģʽ��ƥ��Ϊֹ
	
	public char getChar(){
		return 'a';
	}
	
}
