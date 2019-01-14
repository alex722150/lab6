import  java.util.HashMap ;
import  java.util.List ;
import  java.util.ArrayList ;
импорт  java.util.Random ;
import  java.util.Collections ;




открытый  класс  Array {
    List aList =  new  ArrayList ();
    List bList =  new  ArrayList ();
    public  void  createArray () {
        Случайный ранд =  новый  Случайный ();
        для ( int i =  0 ; i < 10 ; i ++ ) {
            крен . добавить (rand . nextInt ( 100 ));
        }
        Система . из . Println (ALIST);
        bList = aList;
        Коллекции . сортировать (Blist);
        Система . из . Println (Blist);
    }
}