/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author jcham
 */
public class TEST {

    public static void main(String[] args) {
       que q = new que();
       q.enque(1);
       q.enque(23);
       q.enque(43);
       q.enque(43);
       q.enque(83);
       q.enque(3);
       q.deque();
       q.deque();
       q.deque();
       q.display();
      
    }
}
