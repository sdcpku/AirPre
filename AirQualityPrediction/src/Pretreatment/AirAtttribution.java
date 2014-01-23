package Pretreatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AirAtttribution {
	String airdatakeyId;  
	
	String prsAvg;   //气压
	String prsMax;
	String prsMin;
	
	String temAvg;  //温度
	String temMax;
	String temMin;

	String rhuAvg;   //湿度
	String rhuMin;
	
	String per20_8;  //降水量
	String per8_20;
	String per20_20;
	
	String evpSmall; //蒸发量
	String evplarge;
	
	String winAvg; //风向风速
	String winMax;
	String winMaxDirection;
	String winBig;
	String winBigDirection;
	
	String ssdhours; //日照
	
	String gstAvg;   //地表气温
	String gstMax;
	String gstMin;
	
	
	
	public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
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
		//readFileByLines("D:\\data\\bj2012\\54511(北京)_2012_PRS.txt");
	}

}
