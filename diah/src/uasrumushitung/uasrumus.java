/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasrumushitung;

import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 *
 * @author DiahMaelani
 */
public class uasrumus {
     public int uasrumus(int n1) {
         int x = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(x);
         int test = Integer.valueOf(hitung);
        return test;
    }
    
    public String uasrumus(String n1) {
        int angka = Integer.parseInt(n1);
        String hex = Integer.toHexString(angka);
        return hex;
    }
}