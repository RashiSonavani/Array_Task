package com.company;

 public  class Array_Task {

    public static void main(String[] args) {
        int an_Array[] = new int[10];

        for(int i = 0; i < an_Array.length; i++)
        {
            an_Array[i]=an_Array.length-1-i;
        }

        System.out.println();

        for(int i=0; i<an_Array.length;i++)
        {
            System.out.println("Array["+i+"] = "+an_Array[i]);
        }

    }
}
