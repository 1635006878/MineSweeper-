package com.one.container;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.one.container.GlobalVarible.*;

public class Interface {

    public static void main(String[] args){



        AddMines.setBackgoundData();

        globalframe = new JFrame();
        globalframe.setLayout(new BorderLayout());

        BoxLayout boxLayout = new BoxLayout(under,BoxLayout.Y_AXIS);
        under.setLayout(boxLayout);



        Menu1.Menu();
        Menu2.main();
        Menu3.main();



        //设置窗口对象最佳大小 可见
        globalframe.pack();
        globalframe.setSize(270,400);
        globalframe.setLocation(20,50);
        globalframe.setVisible(true);
    }
}
