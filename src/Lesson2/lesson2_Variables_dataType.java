package Lesson2;

public class lesson2_Variables_dataType {
    public static void main(String[] args) {
        byte b1Dec = 12;
        byte b2Bin = 0B1100;
        byte b3oct = 014;
        byte b4Hex = 0xC;
        System.out.println(b3oct);

        short s1Dec = 1300;
        short s2Bin = 0B0101_0001_0100;
        short s2oct=02424;
        short s2Hex=0x514;
        System.out.println(s2Bin);

        int iDec=0;
        int iBin=0B0;
        int iOct=00;
        int iHex=0x0;
        System.out.println(iHex);

        long lDec=123456789l;
        long lBin=0B111010110111100110100010101;
        long lOct=0726746425;
        long lHex=0x75BCD15;
        System.out.println(lHex);

        float f1=125.003545f;
        float f2=6549884684.64651654651F;

        double d1=545546.955545454;
        double d2=123.6554;

        boolean tr=true;
        boolean fls=false;

        System.out.println(tr);

        char ch1=56;
        char ch2='a';
        char ch3=014;
        char ch4=0B1100;
        char ch5=0xC;
        char ch6='\u043a';

        System.out.println(ch1);

    }
}
