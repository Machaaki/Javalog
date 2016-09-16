package jp.techacademy.masaaki.takahashi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("高橋", 32); //名前はポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say();
        Log.d("javatest", "私の名前は" + dog.name + "です。");
        Log.d("javatest", "年は" + dog.age + "歳です。");

       Human2 human2 = new Human2("楽しい事"); // ~~を考えるのインスタンス

        human2.hobby();
        Log.d("Javatest", "私は" + human2.hobby + "考える");

    }
}
