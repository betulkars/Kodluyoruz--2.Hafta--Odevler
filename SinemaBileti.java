package com.company;
import java.util.Scanner;
class Main {
    public static int Age (int age){
        int ticketprice = 100;
        if(age<18 ){
            ticketprice = ticketprice - (ticketprice*10/100);
        }else if(18<=age && age<25){
            ticketprice = ticketprice - (ticketprice*5/100);
        }

    return  ticketprice;

    }
    public static int Type (int type){
        int ticketprice =100;

        if(type==1) {
            ticketprice = ticketprice*5/100;
        }else if(type != 1){

            System.out.println("Şuan istediğiniz türde bir film bulunmamaktadır.");
        }
        return ticketprice;
    }



    public static void main(String[] args) {
        // write your code here

        Scanner Sinema = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int age =Sinema.nextInt();
        System.out.println("press 1 for horror movie and press 2 for other movies ");
        int type = Sinema.nextInt();
        int newticketprice = Age(age) - Type(type);
        System.out.println("Total Amount:"+newticketprice);


    }
}
