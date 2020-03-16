package March15_2020;

import javax.swing.*;
import java.util.Arrays;

public class StringOperation {

        String StringValue;

        public StringOperation() {
            StringValue = "Abcde";
        }
        public StringOperation(String Abcde) {
            StringValue= Abcde;
        }

        public String returnReversed() {
            String revesedString = "";
            for (int i = 0; i < StringValue.length(); i++) {
                revesedString += StringValue.charAt(StringValue.length()-1-i);
            }
            return revesedString;
        }
        public String FirstUpperLetter() {
                String value = "";
                for (int i = 0; i < StringValue.length(); i++) {
                    if (StringValue.charAt(i) >= 'A' && StringValue.charAt(i) <= 'Z')
                        value += StringValue.charAt(i);
                }
                return value;
            }
            public char[] SentenceArray(){
        char[] value=new char[StringValue.length()];
        for (int i=0;i<StringValue.length();i++){
            value[i]=StringValue.charAt(i);
        }
        return value;
    }
        public String[] StringArray(){
        int count=1;
        for (int i=0; i<StringValue.length();i++){
            if (StringValue.charAt(i)==' '){
                count++;
            }
        }
        String[] value=new String[count];
        String rowvalue="";
        count=0;
        for (int i = 0; i < StringValue.length(); i++) {
            if (StringValue.charAt(i)!=' ') {
                rowvalue += StringValue.charAt(i);
            }
            else {
                value[count]=rowvalue;
                count++;
                rowvalue="";
            }
        }
        value[count]=rowvalue;
        return value;
    }

    public static void main(String[] args) {
            StringOperation myObj = new StringOperation("hello how are you");
                System.out.println(myObj.returnReversed());
                System.out.println(myObj.FirstUpperLetter());
                System.out.println(Arrays.toString(myObj.StringArray()));
                System.out.println(myObj.SentenceArray());

//                StringOperation myObj2 = new StringOperation();
//            myObj2.employeeInfo();
//            March15_2020.DesignEmployee myObj3 =new March15_2020.DesignEmployee( 1234,"AGH","HR",5500,1);
//            myObj3.employeeInfo();
//
        }
    }
