package com.example.cl.crazyandroiddemo4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * 先创建自定义组件（DrawView）的实例，然后程序将该组件添加到Linearayout容器中。
 * 当xml文件中添加自动以组件后，Java代码中的管理DrawView的代码可以省略了。
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //获取布局文件中的LinearLayout容器
//        LinearLayout root = (LinearLayout) findViewById(R.id.root);
//        //创建DrawView组件
//        final DrawView draw = new DrawView(this);
//        //设置自定义组件的最大宽度、高度
//        draw.setMinimumWidth(300);
//        draw.setMinimumHeight(500);
//        root.addView(draw);
    }

}
