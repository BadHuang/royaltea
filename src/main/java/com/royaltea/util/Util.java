package com.royaltea.util;

import java.util.UUID;

public class Util {
	public static void getUUID(){
        //�������һλ����
        int random = (int) (Math.random()*9+1);
        String valueOf = String.valueOf(random);
        //����uuid��hashCodeֵ
        int hashCode = UUID.randomUUID().toString().hashCode();
        //����Ϊ����
        if(hashCode<0){
            hashCode = -hashCode;
        }
        String value = valueOf + String.format("%015d", hashCode);
        System.out.println(value);
    }
}
