

 
import java.util.Random;
 
public class MyStringRandomGen {
 
    private static final String CHAR_LIST =
        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; //กำหนดขอบเขตในการ Random
    private static final int RANDOM_STRING_LENGTH = 10; //กำหนดจำนวนตัวอักษรที่จะ Random
     

    public String generateRandomString(){
         
        StringBuffer randStr = new StringBuffer(); //สร้าง StringBuffer สายอักษรที่สามารถเพิ่มลดได้
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber(); 
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch); //แทรกตัวแปรแบบต่อท้ายเรื่อยๆจากการสุ่ม indexของอักขระโดยใช้การสุ่ม Number 
        }
        return randStr.toString(); //ส่งค่า String ที่ทำการสุ่มแล้วไปให้ function
    }
     
    /**
     * This method generates random numbers
     * @return int
     */
    private int getRandomNumber() { //ฟังก์ชันสำหรับสุ่มค่าตัวเลข index
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
     
    public static void main(String a[]){
        MyStringRandomGen msr = new MyStringRandomGen();
        System.out.println(msr.generateRandomString());

    }
}
