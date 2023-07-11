package org.example;

import Entity.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StoreFile {
    public static void StoreFile()throws IOException{
        String path ="/Users/mac/Desktop/Java Project/Week_3_Task/src/main/resources/StoreFile";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        ArrayList<String[]> array = new ArrayList<String[]>();
        String line = " ";
        while ((line = reader.readLine()) != null){
            String[] readFile = line.split(",");
            array.add(readFile);
        }
        array.remove(0);

        for (int i = 0; i < array.size(); i++){
            Product product = new Product();
            String[] description = array.get(i)[1].split("-");
            product.setAvailableUnit (Integer.parseInt(array.get(i)[0]));
            product.setProductColor(description[0]);
            product.getProductPrice(description[2]);
            product.setProductName(description[1]);
            product.setProductPrice (Double.valueOf(array.get(i)[2]));
            product.setProductName(String.valueOf(product));
        }
    }
}