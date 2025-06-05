package com.walking.lesson29_Generics2.Task1;

import com.walking.lesson29_Generics2.Task1.model.MyGeneric;

public class Main {

    // TODO: Реализуйте обобщенный тип, хранящий параметризованное поле.
    //  Также в классе Main реализуйте параметризованный метод, который
    //  принимает первым параметром объект вашего дженерика, вторым — объект типа,
    //  которым параметризован объект первого параметра.
    //  Метод должен возвращать значение поля дженерика, если оно != null,
    //  в противном случае — возвращать второй параметр.

    public static void main(String[] args) {
        System.out.println(getObjectOrField(new MyGeneric<>(null), 5));
    }

    public static <T> T getObjectOrField(MyGeneric<T> obj, T type) {
        return (obj.getField() != null) ? obj.getField() : type;
    }
}
