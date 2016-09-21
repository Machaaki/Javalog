package jp.techacademy.masaaki.takahashi.javalog;

import android.util.Log;

/**
 * Created by Masaaki on 2016/09/14.
 */
class Human extends Animal implements Thinkable {

    // クラス変数
    static String hobby ;


    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
       // hobby = "ピアノ";　//ピアノと入れてはいけない　
    }

    public void think() {

        Log.d("javatest", "私は" + this.hobby + "について考える");
    }


    public void say() {

        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");

    }
}




