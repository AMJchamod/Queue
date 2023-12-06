/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author jcham
 */
public class que {
     int size = 5;
     int items []=new int[size];
     int front , rear;
     
     que(){
         front = -1;
         rear =-1;
     }
     boolean isfull(){
         if(front==0&&rear==size-1){ // When the front and rear pointers meet, it means that the queue is full.
             return true;
         }
         return false;
     }
         
      boolean isempty(){
         if (front==-1){
             return true;
         }
          return false;
         }
      void enque(int element){
           if(isfull()){
                 System.out.println("que is full");
              }else{
                 if(front==-1)
                     front =0;
                     rear++;
                     items[rear]=element;
                     System.out.println("insert"+element);
                     
                 
           }
               
      }
           
      
       int deque(){
           int element;
           if(isempty()){
               System.out.println("que is empty");
               return -1;
           } else{
               element = items[front];
               if(front>=rear){
                   front=-1;
                   rear=-1;
                   
               }else{
                   front++;
                   
               }
               System.out.println("deleted"+element);
           }
              return element;
         }
             void display(){
                    if (isempty()){
                        System.out.println("que is empty");
                    }
                     System.out.println("fornt values");
                      for(int i =front;i<=rear;i++){
                          System.out.println(items[i]);
                      }
                           System.out.println("rear element" +rear);
             }
         
  }
     

