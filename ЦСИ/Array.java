import  java.util.HashMap ;
import  java.util.List ;
import  java.util.ArrayList ;
������  java.util.Random ;
import  java.util.Collections ;




��������  �����  Array {
    List aList =  new  ArrayList ();
    List bList =  new  ArrayList ();
    public  void  createArray () {
        ��������� ���� =  �����  ��������� ();
        ��� ( int i =  0 ; i < 10 ; i ++ ) {
            ���� . �������� (rand . nextInt ( 100 ));
        }
        ������� . �� . Println (ALIST);
        bList = aList;
        ��������� . ����������� (Blist);
        ������� . �� . Println (Blist);
    }
}