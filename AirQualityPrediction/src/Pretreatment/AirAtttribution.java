package Pretreatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AirAtttribution {
	String airdatakeyId;  
	
	String prsAvg;   //��ѹ
	String prsMax;
	String prsMin;
	
	String temAvg;  //�¶�
	String temMax;
	String temMin;

	String rhuAvg;   //ʪ��
	String rhuMin;
	
	String per20_8;  //��ˮ��
	String per8_20;
	String per20_20;
	
	String evpSmall; //������
	String evplarge;
	
	String winAvg; //�������
	String winMax;
	String winMaxDirection;
	String winBig;
	String winBigDirection;
	
	String ssdhours; //����
	
	String gstAvg;   //�ر�����
	String gstMax;
	String gstMin;
	
	
	
	public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
            while ((tempString = reader.readLine()) != null) {
                // ��ʾ�к�
            	String[] itemvalue = tempString.split("\t");
            	
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readFileByLines("D:\\data\\bj2012\\54511(����)_2012_PRS.txt");
	}

}
