package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //khoi tao stack rong
        Stack<Integer> stack=new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("push: ");
        int pushes = scanner.nextInt();
        //chuyen doi dang thap phan sang nhi phan
        while (pushes>0){
            //ket qua phep chia dua vao stack
            stack.push(pushes%2);
            pushes = pushes/2;
        }
        //tao bo đệm với dung lượng ban đầu là 16
        StringBuffer result = new StringBuffer();
        //kiem tra xem stack co rong hay k, neu khong rong thi lay ket qua ra
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result);

    }
}
