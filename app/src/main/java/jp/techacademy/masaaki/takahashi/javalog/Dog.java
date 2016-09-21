package jp.techacademy.masaaki.takahashi.javalog;

import android .util.Log;

class Dog extends Animal implements Movable{
    // クラス変数
    static String to_jp = "私";
    // コントラスタ
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
           }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }


    @Override
    public void say() {

    }
}

